package com.greenfox.frontendexcercise.repository;

import com.greenfox.frontendexcercise.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
