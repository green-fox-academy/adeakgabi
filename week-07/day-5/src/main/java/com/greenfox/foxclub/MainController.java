package com.greenfox.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    FoxList foxList;

    @Autowired
    public MainController(FoxList foxList){
        this.foxList = foxList;
    }

    @RequestMapping("/")
    public String home(@RequestParam("name") String name, Model model){
        model.addAttribute("name",  name);
        model.addAttribute("food", "pizza and lemonade");
        model.addAttribute("tricks", 2);
        foxList.addFoxes(name);
        model.addAttribute("foxList", foxList);
        return "index";
    }

    @GetMapping("/login")
    public String getLoginForm (){
        return "login";
    }

    @PostMapping("/login")
    public String postLoginForm (@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("food", "salad and water");
        model.addAttribute("tricks", 1);
        return "redirect:/?name=" + name;
    }

}
