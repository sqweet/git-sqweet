package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.News;
import com.sweet.fatcat.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/news/{id}")
    public String news(@PathVariable int id){
        News news = newsService.getNewsById(id);
        return news.getContent1();
    }
}
