package com.greenfox.springadv.service;

import com.greenfox.springadv.model.DTO;
import com.greenfox.springadv.model.User;
import com.greenfox.springadv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public String message;

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        this.message = "";
        if (user.getUserName() == null || user.getUserName().isEmpty()) {
            this.message = "Please provide a username";
        } else if (user.getPassword() == null || user.getPassword().isEmpty()) {
            this.message = "Please give a password!";
        } else if (userRepository.findUserByUserNameEquals(user.getUserName()).size() != 0) {
            this.message = "This username is already used!";
        } else {
            userRepository.save(user);
            this.message = "Your registration was successful";
        }
    }

    public List<DTO> listAll(){
        List<DTO> dtoUsers = new ArrayList<>();
        userRepository.findAll().forEach(user -> dtoUsers.add(new DTO(user.getId(), user.getUserName())));
        return dtoUsers;
    }
}
