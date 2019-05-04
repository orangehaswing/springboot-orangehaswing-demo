package springbootorangehaswing.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DockerController {

    @RequestMapping("/docker")
    public String  index(){
        return "home";
    }

}
