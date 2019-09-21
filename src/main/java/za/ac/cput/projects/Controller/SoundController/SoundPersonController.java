package za.ac.cput.projects.Controller.SoundController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Services.SoundService.SoundPersonService;

import java.util.Set;

@RestController
@RequestMapping("/soundPerson")
public class SoundPersonController {

    @Autowired
    @Qualifier("SoundPersonServiceImpl")
    private SoundPersonService soundPersonService;

    @PostMapping("/create")
    @ResponseBody
    public SoundPerson create(SoundPerson soundPerson)
    {
        return soundPersonService.create(soundPerson);
    }

    @PostMapping("/update ")
    @ResponseBody
    public SoundPerson update(SoundPerson soundPerson)
    {
        return soundPersonService.update(soundPerson);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        soundPersonService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public SoundPerson read(@PathVariable String id)
    {
        return soundPersonService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<SoundPerson> getAll()
    {
        return soundPersonService.getAll();
    }
}
