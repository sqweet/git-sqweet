package com.sweet.fatcat.service;

import com.sweet.fatcat.mapper.NewsMapper;
import com.sweet.fatcat.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public News getNewsById(int id){
        News searchedNews = newsMapper.selectedNews(id);
        if(null!=searchedNews)
            return searchedNews;
        return null;
    }

    public List<String> getAllNewsTitle(){
        return newsMapper.selectTitles();
    }
}
