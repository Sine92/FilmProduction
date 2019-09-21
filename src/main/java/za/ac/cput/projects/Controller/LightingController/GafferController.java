package za.ac.cput.projects.Controller.LightingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Services.LightingService.GafferService;

import java.util.Set;

@RestController
@RequestMapping("/gaffer")
public class GafferController {

    @Autowired
    @Qualifier("GafferServiceImpl")
    private GafferService gafferService;

    @PostMapping("/create")
    @ResponseBody
    public Gaffer create(Gaffer gaffer)
    {
        return gafferService.create(gaffer);
    }

    @PostMapping("/update")
    @ResponseBody
    public Gaffer update(Gaffer gaffer)
    {
        return gafferService.update(gaffer);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        gafferService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Gaffer read(@PathVariable String id)
    {
        return gafferService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Gaffer> getAll()
    {
        return gafferService.getAll();
    }



}
