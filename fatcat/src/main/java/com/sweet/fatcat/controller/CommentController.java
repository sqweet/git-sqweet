package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.Comment;
import com.sweet.fatcat.model.User;
import com.sweet.fatcat.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CommentController {

    @Autowired
    private HttpServletRequest httpServletRequest;
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "news/publish")
    public String publishComment(String content,int news){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = simpleDateFormat.format(new Date());
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        Comment comment = new Comment();
        comment.setUser(user.getId());
        comment.setContent(content);
        comment.setNews(news);
        comment.setTime(time);
        commentService.addComment(comment);
        return "news";
    }
}
