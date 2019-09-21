package za.ac.cput.projects.Controller.ProductionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Services.ProductionService.ProdManagerService;

import java.util.Set;

@RestController
@RequestMapping("/prodManager")
public class ProdManController {

    @Autowired
    @Qualifier("ProdManagerServiceImpl")
    private ProdManagerService prodManagerService;


    @PostMapping("/create")
    @ResponseBody
    public ProdManager create(ProdManager prodManager)
    {
        return prodManagerService.create(prodManager);
    }

    @PostMapping("/update")
    @ResponseBody
    public ProdManager update(ProdManager prodManager)
    {
        return prodManagerService.create(prodManager);
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        prodManagerService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProdManager read(@PathVariable String id)
    {
        return prodManagerService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProdManager> getAll()
    {
        return prodManagerService.getAll();
    }
}
