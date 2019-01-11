package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.Comment;
import com.sweet.fatcat.model.News;
import com.sweet.fatcat.service.CommentService;
import com.sweet.fatcat.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private CommentService commentService;
    private int newsId = 1;

    @RequestMapping(value = "/newsId",method = RequestMethod.POST)
    public String setNews(int receivedNewsId){
        newsId = receivedNewsId;
        System.out.println(newsId);
        return "news";
    }

    @ResponseBody
    @RequestMapping(value = "/news",method = RequestMethod.POST)
    public Map<String, Object> getNews(){
        List<Comment> comments = commentService.initNewsComments(newsId);
        News news = newsService.getNewsById(newsId);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("title",news.getTitle());
        map.put("content1",news.getContent1());
        map.put("img1",news.getImg1());
        map.put("content2",news.getContent2());
        map.put("img2",news.getImg2());
        map.put("content3",news.getContent3());
        map.put("img3",news.getImg3());
        map.put("comments",comments);
        return map;
    }
}
