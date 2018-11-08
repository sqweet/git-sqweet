package com.sweet.fatcat.controller;
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

    @ResponseBody
    @RequestMapping(value = "login/validate",method = RequestMethod.POST)
    public String validate(User user){
        User validateUser = userService.validate(user);
        if(validateUser!=null){
            httpServletRequest.getSession().setAttribute("isLogin",true);
            httpServletRequest.getSession().setAttribute("user",validateUser);
            System.out.println("login succeed");
            System.out.println("user id"+httpServletRequest.getSession().getAttribute("user"));
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
    @RequestMapping(value = "news/attention",method = RequestMethod.POST)
    public String attention(int newsId){
        User loginedUser = (User) httpServletRequest.getSession().getAttribute("user");
        System.out.println(newsId);
        boolean flag = attentionService.addAttention("sweet",newsId);
        if(flag){
            return "success";
        }else{
            return "fail";
        }

    }
}
