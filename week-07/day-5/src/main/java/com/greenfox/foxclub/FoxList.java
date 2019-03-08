package com.greenfox.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxList {
    ArrayList<Fox> foxes = new ArrayList<>();

    public FoxList(){
        Fox fox1 = new Fox("Vuk");
        foxes.add(fox1);
    }

    public void addFoxes(String name){
        foxes.add(new Fox (name));
    }

    public ArrayList<Fox> getFoxList() {
        return foxes;
    }

    public Fox getFox(String name){
        for (Fox fox: foxes) {
            if (fox.getName().equalsIgnoreCase(name)){
                return fox;
            }
        }
        return null;
    }
}
