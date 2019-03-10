package com.greenfox.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class MainController {
    FoxList foxList;

    @Autowired
    public MainController(FoxList foxList){
        this.foxList = foxList;
    }

    @RequestMapping("/info")
    public String info (@RequestParam("name") String name, Model model) {
       if (name != null) {
            model.addAttribute("name", name);
            String food = foxList.getFox(name).getFood();
            String tricks = Arrays.toString(foxList.getFox(name).getTricks().toArray());
            model.addAttribute("food", food);
            model.addAttribute("tricks", tricks);
            return "index";
        }
        return "login";
    }

    @RequestMapping("/")
    public String homeGoToLogin() {
        return "login";
    }

    @GetMapping("/login")
    public String getLoginForm (){
        return "login";
    }

    @PostMapping("/login")
    public String postLoginForm (@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
       // model.addAttribute("food", "salad and water");
       // model.addAttribute("tricks", 1);
        if(foxList.getFox(name) == null){
            foxList.addFoxes(name);
        }
        return "redirect:/info?name=" + name;
    }

    @PostMapping("/update")
    public String postUpdateForm (@RequestParam("name") String name, @RequestParam("food") String food, @RequestParam("tricks") String tricks, Model model) {
       /* model.addAttribute("name", name);
        model.addAttribute("food", food);
        model.addAttribute("tricks", tricks); */
        Fox fox1 = foxList.getFox(name);
        fox1.setFood(food);
        if (!tricks.equals("")){ fox1.addTricks(tricks); }
        return "redirect:/info?name=" + name;
    }
}
