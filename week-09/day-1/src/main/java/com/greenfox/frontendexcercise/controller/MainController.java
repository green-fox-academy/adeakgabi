package com.greenfox.frontendexcercise.controller;

import com.greenfox.frontendexcercise.error.ErrorMessage;
import com.greenfox.frontendexcercise.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private MyService myService;

    public MainController(MyService myService){
        this.myService = myService;
    }

    @RequestMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/doubling")
    public @ResponseBody Object doubleInputNumber(@RequestParam (value = "input", required = false) Integer number){
        if(number == null){
            return new ErrorMessage("Please provide an input!");
        }
        return myService.doubleInputNum(number);
    }

}
