package com.greenfox.frontendexcercise.service;

import com.greenfox.frontendexcercise.model.Log;
import com.greenfox.frontendexcercise.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    public void saveLogObject(Log log){
        logRepository.save(log);
    }
}
