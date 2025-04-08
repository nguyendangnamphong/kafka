package com.example.demo.controller;

import com.example.demo.kafka.UserProducer;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserProducer userProducer;

    @PostMapping
    public String sendUser(@RequestBody User user) {
        userProducer.sendUser(user);
        return "Sent!";
    }
}
