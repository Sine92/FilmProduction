package za.ac.cput.projects.Controller.UnitController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Services.UnitService.UnitAssService;
import za.ac.cput.projects.Services.UnitService.UnitManagerService;

import java.util.Set;

@RestController
@RequestMapping("/unitManager")
public class UnitManController {

    @Autowired
    @Qualifier("ServiceImpl")
    private UnitManagerService unitManagerService;

    @PostMapping("/create")
    @ResponseBody
    public UnitManager create(UnitManager unitManager)
    {
        return unitManagerService.create(unitManager);
    }

    @PostMapping("/update")
    @ResponseBody
    public UnitManager update(UnitManager unitManager)
    {
        return unitManagerService.update(unitManager);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        unitManagerService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public UnitManager read(@PathVariable String id)
    {
        return unitManagerService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<UnitManager> getAll()
    {
        return unitManagerService.getAll();
    }

}
