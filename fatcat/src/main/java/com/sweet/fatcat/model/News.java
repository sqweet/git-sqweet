package com.sweet.fatcat.model;

public class News {
    private Integer id;
    private String title;
    private String content1;
    private String img1;
    private String content2;
    private String img2;
    private String content3;
    private String img3;
    private String reporter;
    private Integer count;
    private String type;

    public News(Integer id, String title, String content1, String img1, String content2, String img2, String content3, String img3, String reporter, Integer count, String type) {
        this.id = id;
        this.title = title;
        this.content1 = content1;
        this.img1 = img1;
        this.content2 = content2;
        this.img2 = img2;
        this.content3 = content3;
        this.img3 = img3;
        this.reporter = reporter;
        this.count = count;
        this.type = type;
    }

    public News() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
