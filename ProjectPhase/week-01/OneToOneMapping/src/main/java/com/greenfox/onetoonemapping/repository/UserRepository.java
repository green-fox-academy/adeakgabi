package com.greenfox.onetoonemapping.repository;

import com.greenfox.onetoonemapping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);

    User findUserById(Integer id);
}
