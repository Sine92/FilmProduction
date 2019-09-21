package za.ac.cput.projects.Controller.StylingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Services.StylingService.MakeUpService;

import java.util.Set;

@RestController
@RequestMapping("/makeUpAssist")
public class MakeUpController {

    @Autowired
    @Qualifier("MakeUpServiceImpl")
    private MakeUpService makeUpService;

    @PostMapping("/create")
    @ResponseBody
    public MakeUpAssist create(MakeUpAssist makeUpAssist)
    {
        return makeUpService.create(makeUpAssist);
    }

    @PostMapping("/update")
    @ResponseBody
    public MakeUpAssist update(MakeUpAssist makeUpAssist)
    {
        return makeUpService.update(makeUpAssist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        makeUpService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MakeUpAssist read(@PathVariable String id)
    {
        return makeUpService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MakeUpAssist> getAll()
    {
        return makeUpService.getAll();
    }

}
