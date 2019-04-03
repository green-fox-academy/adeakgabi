package com.greenfox.joiningtables.repository;

import com.greenfox.joiningtables.model.Follower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepo extends CrudRepository <Follower, Long> {
}
