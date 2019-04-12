package com.greenfox.onetoonemapping.model;

import javax.persistence.*;

@Entity
@Table(name = "users", catalog = "test")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private Integer id;
  @Column(name = "name")
  private String name;
  private Integer salary;
  private String teamName;

  public User() {
  }

  public Integer getId() {
    return id;
  }

  public User setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getSalary() {
    return salary;
  }

  public User setSalary(Integer salary) {
    this.salary = salary;
    return this;
  }

  public String getTeamName() {
    return teamName;
  }

  public User setTeamName(String teamName) {
    this.teamName = teamName;
    return this;
  }
}