package com.sweet.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.sweet.model.User;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM User WHERE id = {id}")
    User selectUser(int id);
}
