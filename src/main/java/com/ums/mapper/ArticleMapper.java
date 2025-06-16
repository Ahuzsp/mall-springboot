package com.ums.mapper;

import com.ums.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select("select * from article")
    List<Article> getArticleList();

    @Select("select * from article where articleId=#{articleId}")
    Article getArticleDetailById(Integer articleId);
}
