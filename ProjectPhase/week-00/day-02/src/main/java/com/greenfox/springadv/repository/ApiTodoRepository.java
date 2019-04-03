package com.greenfox.springadv.repository;

import com.greenfox.springadv.model.ApiTodo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiTodoRepository extends CrudRepository<ApiTodo, Long> {
}
