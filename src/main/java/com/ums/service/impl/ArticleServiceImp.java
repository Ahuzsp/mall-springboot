package com.ums.service.impl;

import com.ums.mapper.ArticleMapper;
import com.ums.pojo.Article;
import com.ums.pojo.Clan;
import com.ums.service.ArticleService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList() {
       return articleMapper.getArticleList();
    }

    @Override
    public Article getArticleDetailById(Integer articleId) {
        return articleMapper.getArticleDetailById(articleId);
    }
}
