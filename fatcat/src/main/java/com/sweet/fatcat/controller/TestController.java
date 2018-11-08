package com.sweet.fatcat.controller;

import com.sweet.fatcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @Autowired
    UserService service;

    @ResponseBody
    @RequestMapping(value = "find/{id}")
    public String find(@PathVariable String id){
        return service.getUser(id).toString();
    }

    @RequestMapping(value = "news")
    public String news(){ return "attentionTest";}
}
