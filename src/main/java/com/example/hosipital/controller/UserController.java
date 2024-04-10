package com.example.hosipital.controller;

import com.example.hosipital.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setName("theonefx");
        user.setAge(666);
        return user;
    }
}
