package com.sweet.fatcat.controller;

import com.sweet.fatcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/find/{id}")
    public String findUser(@PathVariable String id){
        return service.getUser(id).toString();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
