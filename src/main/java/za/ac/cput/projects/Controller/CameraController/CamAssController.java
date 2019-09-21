package za.ac.cput.projects.Controller.CameraController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Services.CameraService.CamAssService;

import java.util.Set;

@RestController
@RequestMapping("/camAssistant")
public class CamAssController {

    @Autowired
    @Qualifier("CamAssServiceImpl")
    private CamAssService camAssService;


    @PostMapping("/create")
    @ResponseBody
    public CamAssistant create(CamAssistant  camAssistant)
    {
        return camAssService.create(camAssistant);
    }

    @PostMapping("/update")
    @ResponseBody
    public CamAssistant update(CamAssistant camAssistant)
    {
        return camAssService.update(camAssistant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        camAssService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public CamAssistant read(@PathVariable String id)
    {
        return camAssService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<CamAssistant> getAll()
    {
        return camAssService.getAll();
    }
}
