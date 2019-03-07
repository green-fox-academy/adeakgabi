package com.greenfox.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

    UtilityService utilityService;

    @Autowired
    public ColorController(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String links(){
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String utilities (Model model, UtilityService utilityService){
        model.addAttribute("utilities", utilityService.randomColor().toUpperCase());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String emailCheck (Model model, @RequestParam("email") String email, UtilityService utilityService) {
        model.addAttribute("email", utilityService.validateEmail(email));
        model.addAttribute("isValid", utilityService.getIsValid());
        return "email";
    }


}
