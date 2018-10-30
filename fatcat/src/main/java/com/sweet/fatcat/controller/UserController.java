package com.sweet.fatcat.controller;

import com.sweet.fatcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "login/validate")
    public String validate(){
        return null;
    }
}
