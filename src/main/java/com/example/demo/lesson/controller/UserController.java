package com.example.demo.lesson.controller;

import com.example.demo.lesson.jpa.UserJPA;
import com.example.demo.lesson.untity.UserUntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserJPA userJPA;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserUntity> list() {
        return userJPA.findAll();
    }
}
