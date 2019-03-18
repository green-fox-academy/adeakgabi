package com.greenfox.frontendexcercise.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyService {

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


}
