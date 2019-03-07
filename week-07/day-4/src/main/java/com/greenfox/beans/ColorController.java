package com.greenfox.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColorController {

    UtilityService utilityService;

    @Autowired
    public ColorController(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/colored")
    public String utilities (Model model, UtilityService utilityService){
        model.addAttribute("utilities", utilityService.randomColor().toUpperCase());
        return "colored";
    }
}
