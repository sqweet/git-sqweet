package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.User;
import com.sweet.fatcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public String toLogin(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "login/validate",method = RequestMethod.POST)
    public String validate(User user){
        User validateUser = userService.validate(user);
        if(validateUser!=null){
            return "hello";
        }else {
            return "密码错误";

        }
    }
}
