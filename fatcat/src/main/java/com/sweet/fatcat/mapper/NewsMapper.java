package com.sweet.fatcat.mapper;

import com.sweet.fatcat.model.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    @Select("SELECT * FROM News WHERE id = #{id}")
    News selectedNews(int id);

    @Insert("INSERT INTO News(title,content1,img1,content2,img2,content3,img3,reporter,count,type) VALUES " +
            "(#{id},#{content1},#{img1},#{content2}),#{img2},#{content3},#{img3},#{reporter},#{count},#{type}")
    void insert(News insertNews);
}
