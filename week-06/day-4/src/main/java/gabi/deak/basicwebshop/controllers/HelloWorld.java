package gabi.deak.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("hi", "Hello World!");
        return "greeting";
    }
}
