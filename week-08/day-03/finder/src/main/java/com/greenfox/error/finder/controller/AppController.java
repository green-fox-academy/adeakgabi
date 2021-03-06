package com.greenfox.error.finder.controller;

import com.greenfox.error.finder.service.UserService;
import com.greenfox.error.finder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "index";
    }

    @RequestMapping("/app")
    public String create() {
        service.save(new User());
        return "redirect:/";
    }
}