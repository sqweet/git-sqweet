package com.sweet.fatcat.model;

public class Comment {
    private Integer id;
    private String user;
    private Integer news;
    private String content;
    private String time;

    public Comment(Integer id, String user, Integer news, String content, String time) {

        this.id = id;
        this.user = user;
        this.news = news;
        this.content = content;
        this.time = time;
    }

    public Comment() {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
