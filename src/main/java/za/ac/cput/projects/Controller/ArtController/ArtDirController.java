package za.ac.cput.projects.Controller.ArtController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Services.ArtService.IMPL.ArtDirectServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/artDirector")

public class ArtDirController {

    @Autowired
    @Qualifier("ArtDirectServiceImpl")
    private ArtDirectServiceImpl artDirectService;

    @PostMapping("/create")
    @ResponseBody
    public ArtDirector create(ArtDirector artDirector)
    {
        return artDirectService.create(artDirector);
    }


    @PostMapping("/update")
    @ResponseBody

    public ArtDirector update(ArtDirector artDirector)
    {
        return artDirectService.update(artDirector);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        artDirectService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ArtDirector read(@PathVariable String id)
    {
        return artDirectService.read(id);
    }
    @GetMapping("/read/all")
    @ResponseBody
    public Set<ArtDirector> getAll()
    {
        return artDirectService.getAll();
    }


}
