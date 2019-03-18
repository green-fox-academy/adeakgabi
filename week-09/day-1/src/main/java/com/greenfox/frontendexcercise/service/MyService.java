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
}
