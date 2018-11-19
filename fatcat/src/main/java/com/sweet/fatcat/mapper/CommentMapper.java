package com.sweet.fatcat.mapper;

import com.sweet.fatcat.model.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {

    @Insert("INSERT INTO comment(id,user,news,content,time) VALUES (NULL,#{user},#{news},#{content},#{datetime})")
    void insertComment(Comment comment);

    @Select("SELECT * FROM comment WHERE news = #{newsId}")
    List<Comment> getCommentByNewsId(int newsId);

    @Select("SELECT * FROM comment WHERE user = #{userId}")
    List<Comment> getCommentByUserId(String userId);
}
