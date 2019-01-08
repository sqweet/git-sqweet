package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.News;
import com.sweet.fatcat.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/news",method = RequestMethod.POST)
    public Map<String, Object> getNews(int id){
        News news = newsService.getNewsById(id);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("content1",news.getContent1());
        map.put("content2",news.getContent2());
        map.put("content3",news.getContent3());
        return map;
    }
}
