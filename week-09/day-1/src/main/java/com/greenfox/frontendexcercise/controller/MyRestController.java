package com.greenfox.frontendexcercise.controller;

import com.greenfox.frontendexcercise.error.ErrorMessage;
import com.greenfox.frontendexcercise.model.AppendA;
import com.greenfox.frontendexcercise.model.Arrayss;
import com.greenfox.frontendexcercise.model.Log;
import com.greenfox.frontendexcercise.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

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
        myService.saveLogObject(new Log("/doubling", "input" + number ));
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
        myService.saveLogObject(new Log("/greeter", "name= " + name + "title= " + title));
        return myService.greetUser(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appendAnA (@PathVariable ("appendable") String word){
        myService.saveLogObject((new Log("/appenda/" + word, word)));
        return new AppendA(word);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @GetMapping("/appenda")
    public void appendAnAWithoutWord (){
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil (@RequestBody Map<String, Integer> doUntil, @PathVariable("action") String word){
        if(word.equals("factor")){
            myService.saveLogObject(new Log("/dountil/" + word, doUntil + " , " + word));
            return myService.doUntilFactor(doUntil);
        } else if(word.equals("sum")){
            myService.saveLogObject(new Log("/dountil/" + word, doUntil + " , " + word));
            return myService.doUntilSum(doUntil);
        }
        return new ErrorMessage("Please provide a number!");
    }

    @PostMapping(value = "/arrays")
    public Object arrayHandler (@RequestBody Arrayss arrayss){
        if(arrayss.getWhat().equals("sum")){
            myService.saveLogObject(new Log("/arrays", Arrays.toString(arrayss.getNumbers())));
            return myService.sumOfNumbers(arrayss.getNumbers());
        } else if(arrayss.getWhat().equals("multiply")){
            return myService.multipliedNumbers(arrayss.getNumbers());
        } else if(arrayss.getWhat().equals("double")){
            return myService.doubleAllNumbers(arrayss.getNumbers());
        }
        return new ErrorMessage("Please provide what to do with the numbers!");
    }

}
