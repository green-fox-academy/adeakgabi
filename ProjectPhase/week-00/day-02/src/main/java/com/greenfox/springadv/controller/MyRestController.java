package com.greenfox.springadv.controller;

import com.greenfox.springadv.model.ApiTodo;
import com.greenfox.springadv.model.User;
import com.greenfox.springadv.service.ApiTodoService;
import com.greenfox.springadv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {

    private ApiTodoService apiTodoService;
    private UserService userService;

    @Autowired
    public MyRestController(ApiTodoService apiTodoService, UserService userService) {
        this.apiTodoService = apiTodoService;
        this.userService = userService;
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

    @PostMapping("/register")
    public Object register(@RequestBody User user){
        if(user.getUserName() == null || user.getUserName().isEmpty()){
            return "Please provide a username";
        } else if(user.getPassword() == null || user.getPassword().isEmpty()){
            return "Please give a password!";
        }
        userService.add(user);
        return "Your registration is successful!";
    }
}
