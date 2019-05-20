package za.ac.cput.projects.Controller.ArtController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Services.ArtService.PropsService;

import java.util.Set;

@RestController
@RequestMapping("/props")
public class PropsController {

    @Autowired
    @Qualifier("ServiceImpl")
    private PropsService propsService;

    @PostMapping("/create")
    @ResponseBody
    public Props create(Props props)
    {
        return propsService.create(props);
    }

    @PostMapping("/update")
    @ResponseBody
    public Props update(Props props)
    {
        return propsService.update(props);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
     public void delete(@PathVariable String id)
    {
        propsService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Props read(@PathVariable String id)
    {
        return propsService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Props> getAll()
    {
        return  propsService.getAll();
    }
}
