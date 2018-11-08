package com.sweet.fatcat.service;

import com.sweet.fatcat.mapper.AttentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttentionService {
    @Autowired
    private AttentionMapper attentionMapper;


    public boolean addAttention(String userId,Integer newsId){
        attentionMapper.insertAttention(userId, newsId);
        return true;
    }
}
