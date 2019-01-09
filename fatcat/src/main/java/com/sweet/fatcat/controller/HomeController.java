package com.sweet.fatcat.controller;

import com.sweet.fatcat.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/")
    public String home(){return "home";}

    @ResponseBody
    @RequestMapping(value = "getTitles")
    public List<String> titles(){
        List<String> titles = newsService.getAllNewsTitle();
        return titles;
    }
}
