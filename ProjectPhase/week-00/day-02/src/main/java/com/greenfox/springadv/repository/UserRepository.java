package com.greenfox.springadv.repository;

import com.greenfox.springadv.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

User findUserByUserName (String name);
}
