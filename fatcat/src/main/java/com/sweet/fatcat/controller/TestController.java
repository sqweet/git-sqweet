package com.sweet.fatcat.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mysql.cj.xdevapi.JsonArray;
import com.sweet.fatcat.model.Comment;
import com.sweet.fatcat.service.CommentService;
import com.sweet.fatcat.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    UserService service;
    @Autowired
    CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "find/{id}")
    public String find(@PathVariable String id){
        return service.getUser(id).toString();
    }

    @RequestMapping(value = "news")
    public String news(){ return "attentionTest";}

    @RequestMapping(value = "comment")
    public String toComment(){ return "commentTest";}

    @ResponseBody//显示新闻所有的评论
    @RequestMapping(value="news/testComment")
    public JSONArray query() {
            List<Comment> commentList = commentService.getCommentOfTheNews(1);
            JSONArray data = JSONArray.fromObject(commentList);
            return data;
    }

    @RequestMapping(value = "news/textCommit")
    public String addCommentTest(String content){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String datetime = df.format(date);
        Comment newComment = new Comment(null,"sweet",1,content,datetime);
        commentService.addComment(newComment);
        return "commentTest";
    }
}
