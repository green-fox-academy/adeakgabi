package com.greenfox.connectionwithmysql.model;

import javax.persistence.*;

@Entity
@Table (name = "assignee")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;

    

}
