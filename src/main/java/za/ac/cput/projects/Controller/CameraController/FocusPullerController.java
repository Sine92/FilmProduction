package za.ac.cput.projects.Controller.CameraController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Services.CameraService.FocusPullerService;

import java.util.Set;

@RestController
@RequestMapping("/focusPuller")
public class FocusPullerController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FocusPullerService focusPullerService;

    @PostMapping("/create")
    @ResponseBody
    public FocusPuller create(FocusPuller focusPuller)
    {
        return focusPullerService.create(focusPuller);
    }

    @PostMapping("/update")
    @ResponseBody
    public FocusPuller update(FocusPuller focusPuller)
    {
        return focusPullerService.update(focusPuller);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        focusPullerService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public FocusPuller read(@PathVariable String id)
    {
        return focusPullerService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FocusPuller> getAll()
    {
        return focusPullerService.getAll();
    }
}
