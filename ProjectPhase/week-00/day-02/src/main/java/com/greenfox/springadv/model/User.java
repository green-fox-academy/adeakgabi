package com.greenfox.springadv.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private boolean enabled;

 /*   @JoinColumn(name = "ROLE_ID", referencedColumnName = "id")
    private Role role;  */


    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "USER_ROLES",
            joinColumns =  @JoinColumn(name ="USER_ID", referencedColumnName = "id"),inverseJoinColumns= @JoinColumn(name="ROLE_ID", referencedColumnName = "id"))
    private List<Role> roles;


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

    public List<Role> getRole() {
        return roles;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }
}
