package za.ac.cput.projects.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/IN")
    @ResponseBody

    public String getHome()
    {
        return "YOU ARE INSIDE";
    }



}
