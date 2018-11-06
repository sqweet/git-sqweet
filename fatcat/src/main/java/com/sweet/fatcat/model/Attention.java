package com.sweet.fatcat.model;

public class Attention {
    private Integer id;
    private String user;
    private Integer news;

    public Attention(Integer id, String user, Integer news) {
        this.id = id;
        this.user = user;
        this.news = news;
    }

    public Attention() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getNews() {
        return news;
    }

    public void setNews(Integer news) {
        this.news = news;
    }
}
