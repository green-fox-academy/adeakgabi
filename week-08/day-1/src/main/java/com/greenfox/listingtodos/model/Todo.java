package com.greenfox.listingtodos.model;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    Boolean urgent = false;
    Boolean done = false;

    public Todo(){
    }

    public Todo(String title){
        this.title = title;
    }

    public Long getId(){
        return this.id;
    }

    public String getTitle() {
        return title;
    }






}
