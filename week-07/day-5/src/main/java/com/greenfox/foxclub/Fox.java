package com.greenfox.foxclub;

import java.util.ArrayList;


public class Fox {
    private String name;
    private ArrayList<String> tricks = new ArrayList<>();
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

    public void setName(String name){
         this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTricks(String trick) {
        this.tricks.add(trick);
    }
}


