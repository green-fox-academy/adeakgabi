package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/assignee", ""})
    public String assigneeList(Model model, String name, String email){
        model.addAttribute("assignees", assigneeService.getAllAssignees());
      //  model.addAttribute("newAssignee", new Assignee(name, email));
        return "assignee";
    }

    @GetMapping("/assignee/add")
    public String getAddAssignee(Model model, String name, String email) {
        model.addAttribute("newAssignee", new Assignee(name, email));
        return "addAssignee";
    }

    @PostMapping("/assignee/add")
    public String postAddAssignee(@ModelAttribute Assignee newAssignee){
        assigneeService.addAssignee(newAssignee);
        return "redirect:/assignee";
    }

    @RequestMapping(value = "assignee/{id}/delete", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        assigneeService.deleteAssignee(id);
        return "redirect:/assignee";
    }
}
