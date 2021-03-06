package com.sweet.fatcat.mapper;

import com.sweet.fatcat.model.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
    @Select("SELECT * FROM News WHERE id = #{id}")
    News selectedNews(int id);

    @Insert("INSERT INTO News(title,content1,img1,content2,img2,content3,img3,reporter,count,type) VALUES " +
            "(#{id},#{content1},#{img1},#{content2}),#{img2},#{content3},#{img3},#{reporter},#{count},#{type}")
    void insert(News insertNews);

    @Update("UPDATE News SET title=#{title},content1=#{content1},content2=#{content2},content3=#{content3}," +
            "img1=#{img1},img2=#{img2},img3=#{img3},reporter=#{reporter},type=#{type} WHERE id=#{id}")
    void update (News news);

    @Select("SELECT title FROM News")
    List<String> selectTitles();
}
