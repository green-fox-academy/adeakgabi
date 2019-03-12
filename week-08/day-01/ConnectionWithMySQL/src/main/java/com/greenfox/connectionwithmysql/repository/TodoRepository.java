package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
