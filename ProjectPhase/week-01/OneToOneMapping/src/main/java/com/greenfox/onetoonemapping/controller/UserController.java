package com.greenfox.onetoonemapping.controller;

import com.greenfox.onetoonemapping.model.User;
import com.greenfox.onetoonemapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  UserRepository userRepository;

  @Autowired
  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/hi")
  public @ResponseBody String sayHi(){
    return "hello";
  }

  @GetMapping("/all")
  public List<User> getAll() {
    return userRepository.findAll();
  }

  @GetMapping("/{name}")
  public List<User> getUser(@PathVariable("name") final String name) {
    return userRepository.findByName(name);

  }

  @GetMapping("/id/{id}")
  public User getId(@PathVariable("id") final Integer id) {
    return userRepository.findUserById(id);
  }

  @GetMapping("/update/{id}/{name}")
  public User update(@PathVariable("id") final Integer id, @PathVariable("name")
  final String name) {


    User users = getId(id);
    users.setName(name);

    return userRepository.save(users);
  }
}