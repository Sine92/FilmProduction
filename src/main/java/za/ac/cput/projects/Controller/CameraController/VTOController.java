package za.ac.cput.projects.Controller.CameraController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Services.CameraService.VTOService;

import java.util.Set;

@RestController
@RequestMapping("/vto")
public class VTOController {

    @Autowired
    @Qualifier("VTOServiceImpl")
    private VTOService vtoService;

    @PostMapping("/create")
    @ResponseBody
    public VTO create(VTO vto)
    {
        return vtoService.create(vto);
    }

    @PostMapping("/update")
    @ResponseBody
    public VTO update(VTO vto)
    {
        return vtoService.update(vto);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        vtoService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public VTO read(@PathVariable String id)
    {
        return vtoService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<VTO> getAll()
    {
        return vtoService.getAll();
    }
}
