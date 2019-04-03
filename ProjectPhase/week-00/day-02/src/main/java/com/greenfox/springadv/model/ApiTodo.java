package com.greenfox.springadv.model;

import javax.persistence.*;

@Entity
@Table(name = "api_todo")
public class ApiTodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String description;
    private boolean urgent;

    @ManyToOne
    private User user;

    public ApiTodo(){
    }

    public ApiTodo(String title, String description, boolean urgent) {
        this.title = title;
        this.description = description;
        this.urgent = urgent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }
}
