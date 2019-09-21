package za.ac.cput.projects.Controller.StylingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Services.StylingService.WadrobeService;

import java.util.Set;

@RestController
@RequestMapping("/wadrobe")
public class WadrobeController {

    @Autowired
    @Qualifier("WadrobeServiceImpl")
    private WadrobeService wadrobeService;

    @PostMapping("/create")
    @ResponseBody
    public Wadrobe create(Wadrobe wadrobe)
    {
        return wadrobeService.create(wadrobe);
    }

    @PostMapping("/update")
    @ResponseBody
    public Wadrobe update(Wadrobe wadrobe)
    {
        return  wadrobeService.update(wadrobe);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        wadrobeService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Wadrobe read(@PathVariable String id)
    {
        return  wadrobeService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Wadrobe> getAll()
    {
        return wadrobeService.getAll();
    }

}
