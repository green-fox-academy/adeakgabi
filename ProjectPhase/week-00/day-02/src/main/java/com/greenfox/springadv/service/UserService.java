package com.greenfox.springadv.service;

import com.greenfox.springadv.model.User;
import com.greenfox.springadv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        if(userRepository.findUserByUserNameEquals(user.getUserName()).size() == 0){
            userRepository.save(user);
        } else {
            System.out.println("This username is already used!");
        }
    }
}
