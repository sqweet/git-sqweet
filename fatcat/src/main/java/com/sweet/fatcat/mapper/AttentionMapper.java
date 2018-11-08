package com.sweet.fatcat.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionMapper {
    @Insert("INSERT INTO attentions(id,user,news) VALUES (null,#{userId},#{newsId})")
    void insertAttention(@Param("userId") String userId, @Param("newsId") int newsId);

}
