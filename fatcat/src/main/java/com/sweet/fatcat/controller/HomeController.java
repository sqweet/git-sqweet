package com.sweet.fatcat.controller;

import com.sweet.fatcat.service.NewsService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "/")
    public String home(){return "home";}

    @ResponseBody
    @RequestMapping(value = "getTitles")
    public List<String> titles(){
        List<String> titles = newsService.getAllNewsTitle();
        return titles;
    }

    @ResponseBody
    @RequestMapping(value = "/checkLog")
    public boolean checkLog(){
        boolean isLogin = isLoginned();
        return isLogin;
    }


    private boolean isLoginned(){
        if(null== httpServletRequest.getSession().getAttribute("isLogin")){
            return false;
        }else if((boolean)httpServletRequest.getSession().getAttribute("isLogin")){
            return true;
        }else{
            return false;
        }
    }
}
