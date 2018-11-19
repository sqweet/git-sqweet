package com.sweet.fatcat.model;

public class Comment {
    private Integer id;
    private String user;
    private Integer news;
    private String content;
    private String datetime;

    public Comment(Integer id, String user, Integer news, String content,String datetime) {
        this.id = id;
        this.user = user;
        this.news = news;
        this.content = content;
        this.datetime = datetime;
    }

    public Comment() {
    }


    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
