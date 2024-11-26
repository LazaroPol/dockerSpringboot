package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<Users> getUsers (){

        List<Users> usersList = userRepository.findAll();
        return usersList;
    }

}
