package com.ums.service.impl;

import com.ums.mapper.ArticleMapper;
import com.ums.pojo.Article;
import com.ums.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList(Integer category, Integer userId, String keyword) {
        return articleMapper.getArticleList(category, userId, keyword);
    }

    @Override
    public Article getArticleDetailById(Integer articleId) {
        return articleMapper.getArticleDetailById(articleId);
    }
}
