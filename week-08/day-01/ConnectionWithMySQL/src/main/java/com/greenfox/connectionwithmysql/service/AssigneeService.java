package com.greenfox.connectionwithmysql.service;

import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> getAllAssignees() {
        List<Assignee> assignees = new ArrayList<>();
        assigneeRepository.findAll().forEach(assignee -> assignees.add(assignee));
        return assignees;
    }


    public void addAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public void deleteAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }

    public Object getAssignee(Long id) {
        Assignee assignee = assigneeRepository.findById(id).get();
        return assignee;
    }

    public void updateAssignee(Assignee assignee) {
        Assignee updatedAssignee = assigneeRepository.findById(assignee.getId()).get();
        updatedAssignee.setName(assignee.getName());
        assigneeRepository.save(updatedAssignee);
    }

}
