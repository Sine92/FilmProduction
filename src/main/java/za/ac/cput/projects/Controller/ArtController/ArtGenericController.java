package za.ac.cput.projects.Controller.ArtController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Domain.Request.NewArtEmployee;
import za.ac.cput.projects.Domain.ResponseObj;
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

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
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
                responseObj
            }


        }
    }

    private ArtDirector getArtDirector(NewArtEmployee artEmployee) {
        return artDirectService.
    }


}
