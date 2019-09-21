package za.ac.cput.projects.Controller.UnitController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Services.UnitService.UnitAssService;

import java.util.Set;

@RestController
@RequestMapping("/unitAssist")
public class UnitAssController {

    @Autowired
    @Qualifier("UnitAssServiceImpl")
    private UnitAssService unitAssService;

    @PostMapping("/create")
    @ResponseBody
    public UnitAssist create(UnitAssist unitAssist)
    {
        return unitAssService.create(unitAssist);
    }

    @PostMapping("/update")
    @ResponseBody
    public UnitAssist update(UnitAssist unitAssist)
    {
        return unitAssService.update(unitAssist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        unitAssService.delete(id);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public UnitAssist read(@PathVariable String id)
    {
        return unitAssService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<UnitAssist> getAll()
    {
        return unitAssService.getAll();
    }


}
