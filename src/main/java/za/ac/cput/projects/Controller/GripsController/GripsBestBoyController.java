package za.ac.cput.projects.Controller.GripsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Services.GripsService.GripBestBoyService;

import java.util.Set;

@RestController
@RequestMapping("/gripBestBoy")
public class GripsBestBoyController {
    @Autowired
    @Qualifier("GripsBestBoyServiceImpl")
    private GripBestBoyService gripBestBoyService;

    @PostMapping("/create")
    @ResponseBody
    public GripBestBoy create(GripBestBoy gripBestBoy)
    {
        return  gripBestBoyService.create(gripBestBoy);
    }

    @PostMapping("/update")
    @ResponseBody
    public GripBestBoy update(GripBestBoy gripBestBoy)
    {
        return gripBestBoyService.update(gripBestBoy);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        gripBestBoyService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public GripBestBoy read(@PathVariable String id)
    {
        return gripBestBoyService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<GripBestBoy> getAll()
    {
        return gripBestBoyService.getAll();
    }

}
