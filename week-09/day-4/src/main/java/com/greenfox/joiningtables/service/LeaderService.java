package com.greenfox.joiningtables.service;

import com.greenfox.joiningtables.model.Leader;
import com.greenfox.joiningtables.repository.LeaderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeaderService {

    private LeaderRepo leaderRepo;
    private List<Leader> leaderList;

    @Autowired
    public LeaderService(LeaderRepo leaderRepo) {
        this.leaderRepo = leaderRepo;
    }

    public List<Leader> addLeaders(Leader leader){
        List<Leader> leaders = new ArrayList<>();

    }


}
