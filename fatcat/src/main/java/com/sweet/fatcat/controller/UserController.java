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

            if(validateUser.getId().equals("admin")){
                return "管理员登录成功";
            }
            return "登录成功";
        }else {
            return "密码错误";

        }
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        httpServletRequest.getSession().setAttribute("isLogin",false);
        httpServletRequest.getSession().setAttribute("user",null);
        return "Login";
    }

    @ResponseBody
    @RequestMapping(value = "login/regist",method = RequestMethod.POST)
    public String register(User user){
        boolean flag = userService.register(user);
        if(flag){
            return "注册成功";
        }else {
            return "用户名已被占用";
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
