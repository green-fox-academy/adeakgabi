package com.greenfoxacademy.springstart.controllers;

public class Greeting {

    long ID;
    String content;

    public Greeting(long ID, String content){
        this.ID = ID;
        this.content = content;
    }

    public long getID (){
        return this.ID;
    }

    public String getContent(){
        return this.content;
    }
}
