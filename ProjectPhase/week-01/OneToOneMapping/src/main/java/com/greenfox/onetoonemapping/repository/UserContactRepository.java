package com.greenfox.onetoonemapping.repository;

import com.greenfox.onetoonemapping.model.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactRepository extends JpaRepository<UserContact, Integer> {
}
