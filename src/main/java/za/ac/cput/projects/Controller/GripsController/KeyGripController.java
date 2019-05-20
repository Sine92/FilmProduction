package za.ac.cput.projects.Controller.GripsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Services.GripsService.KeyGripService;

import java.util.Set;

@RestController
@RequestMapping("/keyGrip")
public class KeyGripController {
    @Autowired
    @Qualifier("ServiceImpl")
    private KeyGripService keyGripService;

    @PostMapping("/create")
    @ResponseBody
    public KeyGrip create(KeyGrip keyGrip)
    {
        return keyGripService.create(keyGrip);
    }

    @PostMapping("/update")
    @ResponseBody
    public KeyGrip update(KeyGrip keyGrip)
    {
        return keyGripService.update(keyGrip);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        keyGripService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public KeyGrip read(@PathVariable String id)
    {
        return keyGripService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<KeyGrip> getAll()
    {
        return keyGripService.getAll();
    }
}
