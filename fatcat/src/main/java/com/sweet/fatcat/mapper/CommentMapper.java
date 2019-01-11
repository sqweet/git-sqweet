package com.sweet.fatcat.mapper;

import com.sweet.fatcat.model.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {

    @Select("SELECT * FROM Comment WHERE news= #{news}")
    List<Comment> getCommentsByNewsId(int news);
    @Insert("INSERT INTO Comment(user,news,content,time) VALUES(#{user},#{news},#{content},#{time}) ")
    void addComment(Comment newComment);
}
