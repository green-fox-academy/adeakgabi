package com.greenfox.springadv.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<ApiTodo> apiTodo;

    public User() {
    }

    public User(String userName, String password, List<ApiTodo> apiTodo) {
        this.userName = userName;
        this.password = password;
        this.apiTodo = apiTodo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ApiTodo> getApiTodo() {
        return apiTodo;
    }

    public void setApiTodo(List<ApiTodo> apiTodo) {
        this.apiTodo = apiTodo;
    }
}
