package com.greenfox.springadv.controller;

import com.greenfox.springadv.model.ApiTodo;
import com.greenfox.springadv.service.ApiTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Object addNewTodo(@RequestBody ApiTodo apiTodo){
        apiTodoService.add(apiTodo);
        return "Your todo is successfully saved!";
    }

    @GetMapping("/list")
    public List<ApiTodo> listTodos(){
        return apiTodoService.listAll();
    }
}
