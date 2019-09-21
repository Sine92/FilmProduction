package za.ac.cput.projects.Controller.LightingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Services.LightingService.BestBoyService;

import java.util.Set;

@RestController
@RequestMapping("/bestBoy")
public class BestBoyController {
    @Autowired
    @Qualifier("BestBoyServiceImpl")
    private BestBoyService bestBoyService;

    @PostMapping("/create")
    @ResponseBody
    public BestBoy create(BestBoy bestBoy)
    {
        return bestBoyService.create(bestBoy);
    }

    @PostMapping("/update")
    @ResponseBody
    public BestBoy update(BestBoy bestBoy)
    {
        return bestBoyService.update(bestBoy);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        bestBoyService.delete(id);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public BestBoy read(@PathVariable String id)
    {
        return bestBoyService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BestBoy> getAll()
    {
        return bestBoyService.getAll();
    }



}
