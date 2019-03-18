package com.greenfox.frontendexcercise.controller;

import com.greenfox.frontendexcercise.error.ErrorMessage;
import com.greenfox.frontendexcercise.model.AppendA;
import com.greenfox.frontendexcercise.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @Autowired
    private MyService myService;

    public MyRestController(MyService myService){
        this.myService = myService;
    }

    @GetMapping("/doubling")
    public Object doubleInputNumber(@RequestParam(value = "input", required = false) Integer number){
        if(number == null){
            return new ErrorMessage("Please provide an input!");
        }
        return myService.doubleInputNum(number);
    }

    @GetMapping("/greeter")
    public Object greetTheUser(@RequestParam (required = false)String name, @RequestParam (required = false) String title){
        if(name == null && title == null){
            return new ErrorMessage("Please provide a name and a title!");
        } else if(name == null){
            return new ErrorMessage("Please provide a name!");
        } else if(title == null){
            return new ErrorMessage("Please provide a title!");
        }

        return myService.greetUser(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appendAnA (@PathVariable ("appendable") String word){
        return new AppendA(word);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @GetMapping("/appenda")
    public void appendAnAWithoutWord (){
    }

}
