package com.greenfox.foxclub;

import java.util.ArrayList;


public class Fox {
    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;


    public Fox(String name){
    this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<String> getTricks(){
        return this.tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
}
