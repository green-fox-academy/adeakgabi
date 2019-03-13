package com.greenfox.error.finder.repository;

import com.greenfox.error.finder.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
