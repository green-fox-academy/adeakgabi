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

}
