package za.ac.cput.projects.Controller.LightingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Services.LightingService.GenOpService;

import java.util.Set;

@RestController
@RequestMapping("/generatorOp")
public class GenOpController {
    @Autowired
    @Qualifier("GenOpServiceImpl")
    private GenOpService genOpService;

    @PostMapping("/create")
    @ResponseBody
    public GeneratorOp create(GeneratorOp generatorOp)
    {
        return genOpService.create(generatorOp);
    }

    @PostMapping("/update")
    @ResponseBody

    public GeneratorOp update(GeneratorOp generatorOp)
    {
        return genOpService.update(generatorOp);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void  delete(@PathVariable String id)
    {
        genOpService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public GeneratorOp read(@PathVariable String id)
    {
        return genOpService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<GeneratorOp> getAll()
    {
        return genOpService.getAll();
    }

}
