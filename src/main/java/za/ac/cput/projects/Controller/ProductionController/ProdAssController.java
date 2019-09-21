package za.ac.cput.projects.Controller.ProductionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Services.ProductionService.ProdAssService;

import java.util.Set;

@RestController
@RequestMapping("/productionAssist")
public class ProdAssController {

    @Autowired
    @Qualifier("ProdAssServiceImpl")
    private ProdAssService prodAssService;

    @PostMapping("/create")
    @ResponseBody
    public ProductionAssist create(ProductionAssist productionAssist)
    {
       return prodAssService.create(productionAssist);
    }

    @PostMapping("/update")
    @ResponseBody
    public ProductionAssist update(ProductionAssist productionAssist)
    {
        return prodAssService.update(productionAssist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        prodAssService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProductionAssist read(@PathVariable String id)
    {
        return  prodAssService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProductionAssist> getAll()
    {
        return prodAssService.getAll();
    }
}
