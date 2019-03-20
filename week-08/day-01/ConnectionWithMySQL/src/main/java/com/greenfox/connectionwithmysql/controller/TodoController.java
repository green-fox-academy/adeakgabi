package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping (value = {"/list", ""})
    public String list(Model model){
        model.addAttribute("todos", todoService.getAllTodo());
        return "todolist";
    }

    @GetMapping (value = "/")
    public String activeList(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive ){
        model.addAttribute("todos", todoService.getAllActiveTodo(isActive));
        return "todolist";
    }
    @GetMapping("/add")
    public String getTodos(Model model){
        model.addAttribute("todo", new Todo());
        return "addtodo";
    }

    @PostMapping("/add")
    public String postTodos(@ModelAttribute Todo todo){
        todoService.addTodo(todo);
        return "redirect:/todo/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editTodos(Model model, @PathVariable("id") Long id){
        model.addAttribute("todo", todoService.getTodo(id));
        return "edit";
    }

    @PostMapping(value = "/{id}/edit")
    public String postEdit(@ModelAttribute Todo todo) {
        todoService.updateTodo(todo);
        return "redirect:/todo/list";
    }

    @PostMapping("/search")
    public String searchForGet(Model model, String word){
        model.addAttribute("todos", todoService.searchInTodos(word));
        return "todolist";
    }



}
