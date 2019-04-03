package com.greenfox.springadv.service;

import com.greenfox.springadv.model.ApiTodo;
import com.greenfox.springadv.repository.ApiTodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiTodoService {

    private ApiTodoRepository apiTodoRepository;

    @Autowired
    public ApiTodoService(ApiTodoRepository apiTodoRepository) {
        this.apiTodoRepository = apiTodoRepository;
    }

    public void add(ApiTodo apiTodo) {
        apiTodoRepository.save(apiTodo);
    }
}
