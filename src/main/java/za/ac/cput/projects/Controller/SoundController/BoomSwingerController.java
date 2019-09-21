package za.ac.cput.projects.Controller.SoundController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Services.SoundService.BoomSwingerService;

import java.util.Set;

@RestController
@RequestMapping("/boomSwinger")
public class BoomSwingerController {
    @Autowired
    @Qualifier("BoomSwingerServiceImpl")
    private BoomSwingerService boomSwingerService;

    @PostMapping("/create")
    @ResponseBody
    public BoomSwinger create(BoomSwinger boomSwinger)
    {
        return boomSwingerService.create(boomSwinger);
    }

    @PostMapping("/update")
    @ResponseBody
    public BoomSwinger update(BoomSwinger boomSwinger)
    {
        return boomSwingerService.update(boomSwinger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        boomSwingerService.delete(id);
    }

    @GetMapping ("/read/{id}")
    @ResponseBody
    public BoomSwinger read(@PathVariable String id)
    {
        return boomSwingerService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BoomSwinger> getAll()
    {
        return boomSwingerService.getAll();
    }
}
