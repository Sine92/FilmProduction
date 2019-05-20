package za.ac.cput.projects.Controller.CameraController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Services.CameraService.DITService;

import java.util.Set;

@RestController
@RequestMapping("/dit")
public class DITController {
    @Autowired
    @Qualifier("ServiceImpl")
    private DITService ditService;

    @PostMapping("/create")
    @ResponseBody
    public DIT create(DIT dit)
    {
        return ditService.create(dit);
    }

    @PostMapping("/update")
    @ResponseBody
    public DIT update(DIT dit)
    {
        return  ditService.update(dit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        ditService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public DIT read(@PathVariable String id)
    {
        return ditService.read(id);
    }
    @GetMapping("/read/all")
    @ResponseBody
    public Set<DIT> getAll()
    {
        return ditService.getAll();
    }
}
