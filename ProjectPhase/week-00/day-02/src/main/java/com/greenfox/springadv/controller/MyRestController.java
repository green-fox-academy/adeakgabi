package com.greenfox.springadv.controller;

import com.greenfox.springadv.model.ApiTodo;
import com.greenfox.springadv.model.DTO;
import com.greenfox.springadv.model.User;
import com.greenfox.springadv.service.ApiTodoService;
import com.greenfox.springadv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String home() {
        return "hi there!";
    }

    @PostMapping("/add")
    public Object addNewTodo(@RequestBody ApiTodo apiTodo) {
        apiTodoService.add(apiTodo);
        return "Your todo is successfully saved!";
    }

    @GetMapping("/list")
    public List<DTO> listUsers() {
        return userService.listAll();
       // return apiTodoService.listAll();
    }

    @PostMapping("/register")
    public Object register(@RequestBody User user) {
        Map<String, String> userMessage = new HashMap<>();
        userService.add(user);
        userMessage.put("message", userService.message);
        return userMessage;
    }

    @GetMapping("/admin")
    public Object adminMessage(){
        return "Hi there, my favorite admin!";
    }


}
