package com.greenfox.springadv.model;

import javax.persistence.*;


@Entity
@Table(name = "role")
public class Role {

    private Long id;
    private String name;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
