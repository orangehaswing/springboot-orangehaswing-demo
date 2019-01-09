package com.orangehaswing.templateengine;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("host", "http://github.com");
        return "home";
    }
}
