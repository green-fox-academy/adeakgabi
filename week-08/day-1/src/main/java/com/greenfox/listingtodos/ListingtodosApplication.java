package com.greenfox.listingtodos;

import com.greenfox.listingtodos.model.Todo;
import com.greenfox.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {
    TodoRepository todoRepository;

    @Autowired
    ListingtodosApplication (TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn more about Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn other stuff too"));
        todoRepository.save(new Todo("I have to learn..."));

    }
}
