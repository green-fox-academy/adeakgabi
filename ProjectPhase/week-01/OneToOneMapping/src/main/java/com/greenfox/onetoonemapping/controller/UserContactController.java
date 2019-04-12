package com.greenfox.onetoonemapping.controller;

import com.greenfox.onetoonemapping.model.User;
import com.greenfox.onetoonemapping.model.UserContact;
import com.greenfox.onetoonemapping.repository.UserContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usercontact")
public class UserContactController {

  private UserContactRepository userContactRepository;

  @Autowired
  public UserContactController(UserContactRepository userContactRepository) {
    this.userContactRepository = userContactRepository;
  }

  @GetMapping("/all")
  public List<UserContact> getUserContacts() {
    return userContactRepository.findAll();
  }

  @GetMapping("/update/{name}")
  public List<UserContact> update(@PathVariable final String name){
    User user = new User();
    UserContact userContact = new UserContact();

    user.setName(name)     //for this i have to set the User setters returning a User instead of void
        .setSalary(1000)
        .setTeamName("Aragonite");

    userContact.setPhoneNo(1111)
                .setUser(user);    //I'm setting the user here to this contact!

    userContactRepository.save(userContact);

    return userContactRepository.findAll();
  }

}

