package gabi.deak.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        model.addAttribute("message", "(It is a web page.)");

        return "greeting";
    }
}
