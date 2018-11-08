package com.sweet.fatcat.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionMapper {
    @Select("INSERT INTO attention(user,news) VALUES (#{userId),#(newsId)")
    void insertAttention(String userId,int newsId);
}
