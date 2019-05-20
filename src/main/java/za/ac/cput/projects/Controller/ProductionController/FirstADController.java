package za.ac.cput.projects.Controller.ProductionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Services.ProductionService.FirstADService;

import java.util.Set;

@RestController
@RequestMapping("/firstAD")
public class FirstADController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FirstADService firstADService;

    @PostMapping("/create")
    @ResponseBody
    public FirstAD create(FirstAD firstAD)
    {
        return firstADService.create(firstAD);
    }

    @PostMapping("/update")
    @ResponseBody
    public FirstAD update(FirstAD firstAD)
    {
        return firstADService.update(firstAD);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        firstADService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public FirstAD read(@PathVariable String id)
    {
        return firstADService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FirstAD> getAll()
    {
        return firstADService.getAll();
    }
}
