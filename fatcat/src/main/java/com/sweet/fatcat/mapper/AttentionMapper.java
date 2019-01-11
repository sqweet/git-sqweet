package com.sweet.fatcat.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionMapper {
    @Insert("INSERT INTO attention(user,news) VALUES (#{userId},#{newsId}")
    void insertAttention(String userId,int newsId);
}
