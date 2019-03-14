package com.greenfox.connectionwithmysql.service;

import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }


    public Todo getTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();
        return todo;
    }

    public List<Todo> getAllTodo() {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todo -> todos.add(todo));
        return todos;
    }

    public List<Todo> getAllActiveTodo(Boolean isActive) {
        List<Todo> todos = new ArrayList<>();
        if(isActive){
            todoRepository.findAll().forEach(todo -> todos.add(todo));
            return todos.stream().filter(todo -> todo.getDone()).collect(Collectors.toList());
        } else {
            todoRepository.findAll().forEach(todo -> todos.add(todo));
            return todos.stream().filter(todo -> !todo.getDone()).collect(Collectors.toList());
        }
    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }

    public void updateTodo(Todo todo){
        Todo todoWithUpdatedInfo = todoRepository.findById(todo.getId()).get();
        todoWithUpdatedInfo.setTitle(todo.getTitle());
        todoWithUpdatedInfo.setDone(todo.getDone());
        todoWithUpdatedInfo.setUrgent(todo.getUrgent());
        todoRepository.save(todoWithUpdatedInfo);
    }
}
