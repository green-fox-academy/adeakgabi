package com.greenfox.joiningtables.service;

import com.greenfox.joiningtables.repository.FollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    private FollowerRepo followerRepo;

    public FollowerService(FollowerRepo followerRepo) {
        this.followerRepo = followerRepo;
    }
}
