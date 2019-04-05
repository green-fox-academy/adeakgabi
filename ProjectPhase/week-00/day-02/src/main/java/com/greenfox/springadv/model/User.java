package com.greenfox.springadv.model;

import org.hibernate.secure.spi.GrantedPermission;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private boolean enabled;

 /*   @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.All)
    private Role role; */

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<ApiTodo> todoList;

    public User() {
    }

    public User(String userName, String password, List<ApiTodo> todoList) {
        this.userName = userName;
        this.password = password;
        this.todoList = todoList;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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

    public List<ApiTodo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<ApiTodo> apiTodo) {
        this.todoList = apiTodo;
    }

    public void addTodos(ApiTodo apiTodo) {
        this.todoList.add(apiTodo);
    }

    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
/*
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    } */
}
