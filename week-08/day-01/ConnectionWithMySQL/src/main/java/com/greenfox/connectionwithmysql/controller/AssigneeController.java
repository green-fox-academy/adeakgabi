package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = "/")
    public String activeList(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive ){
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "assignee";
    }

    @GetMapping("/add")
    public String addAssignee(Model model, String name, String email){
        model.addAttribute("assignee", new Assignee(name, email));
        return "assignee";
    }

    @PostMapping("/add")
    public String postAddAssignee(@ModelAttribute Assignee assignee){
        assigneeService.addAssignee(assignee);
        return "redirect:/assignee";
    }
}
