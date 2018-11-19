package com.sweet.fatcat.service;

import com.sweet.fatcat.mapper.CommentMapper;
import com.sweet.fatcat.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getCommentOfTheNews(int newsId){
        List<Comment> commentList = commentMapper.getCommentByNewsId(newsId);
        return commentList;
    }

    public boolean addComment(Comment comment){
        commentMapper.insertComment(comment);
        return true;
    }
}
