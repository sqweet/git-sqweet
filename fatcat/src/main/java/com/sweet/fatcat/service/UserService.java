package com.sweet.fatcat.service;

import com.sweet.fatcat.mapper.UserMapper;
import com.sweet.fatcat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(String id){
        return userMapper.selectUser(id);
    }
}
