package com.sweet.fatcat.controller;

import com.sweet.fatcat.model.Attention;
import com.sweet.fatcat.model.User;
import com.sweet.fatcat.service.AttentionService;
import com.sweet.fatcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AttentionService attentionService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value="news")
    public String toNews(){ return "news";}

    @RequestMapping(value="register")
    public String toRegister(){ return "register";}

    @ResponseBody
    @RequestMapping(value = "login/validate",method = RequestMethod.POST)
    public String validate(User user){
        User validateUser = userService.validate(user);
        if(validateUser!=null){
            httpServletRequest.getSession().setAttribute("isLogin",true);
            httpServletRequest.getSession().setAttribute("user",validateUser);
            return "hello";
        }else {
            return "密码错误";

        }
    }

    @ResponseBody
    @RequestMapping(value = "register/regist",method = RequestMethod.POST)
    public String register(User user){
        boolean flag = userService.register(user);
        if(flag){
            return "succeed";
        }else {
            return "failed";
        }
    }

    @ResponseBody
    @RequestMapping(value = "news/attention")
    public String attention(int newsId){
        User loginedUser = (User) httpServletRequest.getAttribute("user");
        if(attentionService.addAttention(loginedUser.getId(),newsId)){
            return "success";
        }else{
            return "fail";
        }

    }
}
