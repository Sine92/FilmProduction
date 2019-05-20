package za.ac.cput.projects.Controller.ProductionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Services.ProductionService.ProducerService;

import java.util.Set;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    @Qualifier("ServiceImpl")
    private ProducerService producerService;

    @PostMapping("/create")
    @ResponseBody
    public Producer create(Producer producer)
    {
        return producerService.create(producer);
    }

    @PostMapping("/update")
    @ResponseBody
    public Producer update(Producer producer)
    {
        return producerService.update(producer);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Producer read(@PathVariable String id)
    {
        return producerService.read(id);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        producerService.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Producer> getAll()
    {
        return producerService.getAll();
    }
}
