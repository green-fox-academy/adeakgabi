package com.greenfox.listingtodos.controller;

import com.greenfox.listingtodos.model.Todo;
import com.greenfox.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    TodoController (TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @RequestMapping ("/todo")
    public String todo(){
        return "";
    }



    @RequestMapping (value = {"/list", "/"}, method = RequestMethod.GET)
    public String list(Model model){
        return "todolist";
    }
}
