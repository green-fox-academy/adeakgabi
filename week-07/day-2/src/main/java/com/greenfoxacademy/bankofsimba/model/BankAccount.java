package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;

    public BankAccount(String name, int balance, String animalType){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getAnimalType(){
        return this.animalType;
    }
}

