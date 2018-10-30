package com.sweet.service;

import com.sweet.mapper.UserMapper;
import com.sweet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(int id){
        return userMapper.selectUser(id);
    }
}
