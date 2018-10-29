package com.sweet.fatcat.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.sweet.fatcat.model.User;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM User WHERE id = #{id}")
    User selectUser(int id);
}
