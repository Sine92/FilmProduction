package za.ac.cput.projects.Controller.LightingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Services.LightingService.SparkService;

import java.util.Set;

@RestController
@RequestMapping("/spark")
public class SparkController {

    @Autowired
    @Qualifier("ServiceImpl")
    private SparkService sparkService;

    @PostMapping("/create")
    @ResponseBody
    public Spark create(Spark spark)
    {
        return  sparkService.create(spark);
    }

    @PostMapping("/update")
    @ResponseBody
    public Spark update(Spark spark)
    {
        return sparkService.update(spark);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        sparkService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Spark read(@PathVariable String id)
    {
        return sparkService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Spark> getAll()
    {
        return sparkService.getAll();
    }
}
