package com.liangjun.strive.controller;

import com.liangjun.strive.bean.User;
import com.liangjun.strive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryUsers")
    public void queryUsers(){
        List<User> users = userService.queryUsers();
        for (User u:users){
            System.out.print(u.getUsername());
        }
    }
}
