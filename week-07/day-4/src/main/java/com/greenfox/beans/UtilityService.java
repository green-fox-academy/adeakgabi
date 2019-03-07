package com.greenfox.beans;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;
    Boolean isValid = false;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email){
        if(email.contains("@") || email.contains(".")){
            this.isValid = true;
            return email + " is a valid email address";
        } else {
            return email + " is not a valid email address";
        }
    }

    public Boolean getIsValid(){
        return this.isValid;
    }
}