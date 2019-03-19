package com.greenfox.frontendexcercise.service;

import com.greenfox.frontendexcercise.model.Log;
import com.greenfox.frontendexcercise.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyService {

    LogRepository logRepository;

    @Autowired
    public MyService(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    public Map<String, Integer> doubleInputNum(int number){
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("received", number);
        newMap.put("result", number*2);
        return newMap;
    }

    public Map<String, String> greetUser(String name, String title) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("welcome_message", "Oh, hi there " + name + ", my dear " + title +"!");
        return newMap;
    }

    public Map<String, Integer> doUntilFactor(Map<String, Integer> doUntil){
        Map<String, Integer> doUntilResult = new HashMap<>();
        Integer untilNum = doUntil.get("until");
        Integer result = 1;
        for (int i = 0; i < untilNum; i++) {
            result = result * (i + 1);
        }
        doUntilResult.put("result", result);
        return doUntilResult;
    }

    public Map<String, Integer> doUntilSum(Map<String, Integer> doUntil){
        Map<String, Integer> doUntilResult = new HashMap<>();
        Integer untilNum = doUntil.get("until");
        int result = 0;
        for (int i = 0; i < untilNum; i++) {
            result += i+1;
        }
        doUntilResult.put("result", result);
        return doUntilResult;
    }


    public Map<String, Integer> sumOfNumbers(Integer[] numbers) {
        Map<String, Integer> sumResult = new HashMap<>();
        Integer result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        sumResult.put("result", result);
        return sumResult;
    }

    public Map<String, Integer> multipliedNumbers(Integer[] numbers) {
        Map<String, Integer> multipliedNumbers = new HashMap<>();
        Integer result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        multipliedNumbers.put("result", result);
        return multipliedNumbers;
    }

    public Integer[] doubleAllNumbers(Integer[] numbers) {
        Integer[] doubledNumbers = new Integer [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = numbers[i]*2;
        }
        return doubledNumbers;
    }

    public void saveLogObject(Log log){
        logRepository.save(log);
    }


    public List<Log> getAllLogs() {
        List<Log> allLogs = new ArrayList<>();
        logRepository.findAll().forEach(log -> allLogs.add(log));
        return allLogs;
    }


}
