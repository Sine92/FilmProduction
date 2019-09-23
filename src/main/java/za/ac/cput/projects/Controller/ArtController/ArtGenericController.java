package za.ac.cput.projects.Controller.ArtController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Domain.Request.NewArtEmployee;
import za.ac.cput.projects.Domain.ResponseObj;

import za.ac.cput.projects.Factories.ArtFactories.ArtDirectorFactory;
import za.ac.cput.projects.Factories.ArtFactories.PropMasterFactory;
import za.ac.cput.projects.Factories.ResponseObjFactory;
import za.ac.cput.projects.Services.ArtService.ArtDirectService;
import za.ac.cput.projects.Services.ArtService.IMPL.ArtDirectServiceImpl;
import za.ac.cput.projects.Services.ArtService.IMPL.PropMasterServiceImpl;
import za.ac.cput.projects.Services.ArtService.IMPL.PropsServiceImpl;

import java.awt.*;

@RestController
@RequestMapping("/ArtDepartment/staff")
public class ArtGenericController {

    @Autowired
    private ArtDirectServiceImpl artDirectService;
    @Autowired
    private PropMasterServiceImpl propMasterService;
    @Autowired
    private PropsServiceImpl propsService;

    @GetMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createArtEmployee(@RequestBody NewArtEmployee artEmployee){
        System.out.println(artEmployee);
        ResponseObj responseObj = ResponseObjFactory.builderGenericResponseObj(HttpStatus.OK.toString(),"Art Employee Created");
        if(artEmployee.getFirstName()== null || artEmployee.getLastName()== null)
        {
           responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
           responseObj.setResponseDescription("PLEASE ENTER FIRST AND LAST NAME");
        }else {
               ArtDirector artDirector = getArtDirector(artEmployee);
               PropMaster propMaster = getPropMaster(artEmployee);
            Props props = getProps(artEmployee);
            if(artDirector == null || propMaster ==null || props == null){
                responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String text = artDirector == null ? "Director not found| ":"";
                text += propMaster == null ? "PropMaster has no job|" :"";
                text += props == null ? "Props is not yet hired|" :"";
                responseObj.setResponseDescription(text);
            }else
            {
               // Employee savedArtDempl = savedArtDEmpl(artEmployee);
                ArtDirector savedArtD = savedArtDirector(artEmployee);
                PropMaster savedPropM = savedPropMaster(savedArtD,propMaster);

            }

        }
        return  ResponseEntity.ok(responseObj);
    }



    private PropMaster savedPropMaster(ArtDirector savedArtD, PropMaster propMaster) {
        PropMaster propMaster1 = PropMasterFactory.createPropMaster(savedArtD.getArtId(),propMaster.getPmRole());
        return propMasterService.create(propMaster1);
    }

    private ArtDirector savedArtDirector(NewArtEmployee artEmployee) {
       ArtDirector art= ArtDirectorFactory.createArtDirector(artEmployee.getFirstName(),artEmployee.getNumber(),artEmployee.getLastName());
       return artDirectService.create(art);
    }



    private Props getProps(NewArtEmployee artEmployee) {
        return propsService.displayBy(artEmployee.getProps());
    }

    private PropMaster getPropMaster(NewArtEmployee artEmployee) {
       return propMasterService.displayBy(artEmployee.getPropMaster());
    }

    private ArtDirector getArtDirector(NewArtEmployee artEmployee) {
        return artDirectService.displayBy(artEmployee.getArtDirector());
    }


}
