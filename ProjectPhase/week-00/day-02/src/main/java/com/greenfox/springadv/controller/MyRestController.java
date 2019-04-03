package com.greenfox.springadv.controller;

import com.greenfox.springadv.model.ApiTodo;
import com.greenfox.springadv.service.ApiTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private ApiTodoService apiTodoService;

    @Autowired
    public MyRestController(ApiTodoService apiTodoService) {
        this.apiTodoService = apiTodoService;
    }

    @GetMapping("/")
    public String home(){
        return "hi there!";
    }

    @PostMapping("/add")
    public Object addNewTodo(@RequestParam ApiTodo apiTodo){
        apiTodoService.add(apiTodo);
        return "Your todo is successfully saved!";
    }
}
