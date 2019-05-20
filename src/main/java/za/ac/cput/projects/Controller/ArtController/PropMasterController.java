package za.ac.cput.projects.Controller.ArtController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Services.ArtService.PropMasterService;

import java.util.Set;

@RestController
@RequestMapping("/propMaster")
public class PropMasterController {
    @Autowired
    @Qualifier("ServiceImpl")
    private PropMasterService propMasterService;

    @PostMapping("/create")
    @ResponseBody
    public PropMaster create(PropMaster propMaster)
    {
        return propMasterService.create(propMaster);
    }

    @PostMapping("/update")
    @ResponseBody
    public PropMaster update(PropMaster propMaster)
    {
        return propMasterService.update(propMaster);
    }

    @GetMapping("/delet/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        propMasterService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PropMaster read(@PathVariable String id)
    {
         return propMasterService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
     public Set<PropMaster> getAll()
    {
        return propMasterService.getAll();
    }

}
