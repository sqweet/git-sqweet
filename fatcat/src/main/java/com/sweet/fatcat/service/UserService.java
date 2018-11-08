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

    public User validate(User inputUser){
        User getUser = userMapper.selectUser(inputUser.getId());
        if(getUser.getPassword().equals(inputUser.getPassword())){
            return getUser;
        }else {
            return null;
        }
    }

    public boolean register(User user){
        User check = userMapper.selectUser(user.getId());
        if(check!=null){
            return false;
        }else{
            userMapper.insertUser(user);
            return true;

        }
    }
}
