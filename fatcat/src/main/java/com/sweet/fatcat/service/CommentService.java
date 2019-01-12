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

    public List<Comment> initNewsComments(int newsId){
        List<Comment> comments = commentMapper.getCommentsByNewsId(newsId);
        return comments;
    }

    public void addComment(Comment newComment){
        commentMapper.addComment(newComment);
    }
}
