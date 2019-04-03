package com.greenfox.joiningtables.repository;

import com.greenfox.joiningtables.model.Leader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepo extends CrudRepository <Leader,Long> {
}
