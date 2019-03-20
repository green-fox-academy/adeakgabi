package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM todo WHERE LOWER(todo.title) LIKE %:word%")
    public List<Todo> searchInTodos(@Param("word") String word);

}
