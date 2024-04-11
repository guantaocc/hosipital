package com.example.hosipital.controller;

import com.example.hosipital.domain.dos.UserDO;
import com.example.hosipital.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public Response<UserDO> getUser(){
        UserDO user = new UserDO();
        user.setUsername("theonefx");
        user.setIsDeleted(true);
        return Response.success(user);
    }
}
