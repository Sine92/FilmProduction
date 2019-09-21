package za.ac.cput.projects.Controller.ProductionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Services.ProductionService.TalentChapService;

import java.util.Set;

@RestController
@RequestMapping("/talentChaperone")
public class TalentChapController {

    @Autowired
    @Qualifier("TalentChapServiceImpl")
    private TalentChapService talentChapService;

    @PostMapping("/create")
    @ResponseBody
    public TalentChaperone create(TalentChaperone talentChaperone)
    {
        return talentChapService.create(talentChaperone);
    }

    @PostMapping("/update")
    @ResponseBody
    public TalentChaperone update(TalentChaperone talentChaperone)
    {
        return talentChapService.create(talentChaperone);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        talentChapService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TalentChaperone read(@PathVariable String id)
    {
        return talentChapService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TalentChaperone> getAll()
    {
        return talentChapService.getAll();
    }
}
