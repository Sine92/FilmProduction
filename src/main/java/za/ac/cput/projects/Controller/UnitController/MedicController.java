package za.ac.cput.projects.Controller.UnitController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Services.UnitService.MedicService;

import java.util.Set;

@RestController
@RequestMapping("/medic")
public class MedicController {
    @Autowired
    @Qualifier("MedicServiceImpl")
    private MedicService medicService;

    @PostMapping("/create")
    @ResponseBody
    public Medic create(Medic medic)
    {
        return  medicService.create(medic);
    }

    @PostMapping("/update")
    @ResponseBody
    public Medic update(Medic medic)
    {
        return medicService.update(medic);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        medicService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Medic read(@PathVariable String id)
    {
        return  medicService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Medic> getAll()
    {
        return medicService.getAll();
    }
}
