package com.ums.service;

import com.ums.pojo.Article;
import com.ums.pojo.Clan;

import java.util.List;

public interface ArticleService {
    List<Article> getArticleList(Integer category, Integer userId, String keyword);

    Article getArticleDetailById(Integer articleId);
}
