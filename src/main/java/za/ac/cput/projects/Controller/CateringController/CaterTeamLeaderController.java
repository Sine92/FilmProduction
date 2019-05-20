package za.ac.cput.projects.Controller.CateringController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Services.CaterService.CaterTeamLerderService;

import java.util.Set;

@RestController
@RequestMapping("/caterTeamLeader")
public class CaterTeamLeaderController {
    @Autowired
    @Qualifier("ServiceImpl")
    private CaterTeamLerderService caterTeamLerderService;

    @PostMapping("/create")
    @ResponseBody
    public CaterTeamLeader create(CaterTeamLeader caterTeamLeader)
    {
        return caterTeamLerderService.create(caterTeamLeader);
    }

    @PostMapping("/update")
    @ResponseBody
    public CaterTeamLeader update(CaterTeamLeader caterTeamLeader)
    {
        return caterTeamLerderService.update(caterTeamLeader);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        caterTeamLerderService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public CaterTeamLeader read(@PathVariable String id)
    {
        return caterTeamLerderService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<CaterTeamLeader> getAll()
    {
        return caterTeamLerderService.getAll();
    }
}
