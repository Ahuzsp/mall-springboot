package com.ums.controller;

import com.ums.common.CommonResult;
import com.ums.pojo.Article;
import com.ums.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/getArticleList")
    public CommonResult<List<Article>> getArticleList(@RequestParam(required = false) Integer category, @RequestParam(required = false) Integer userId, @RequestParam(required = false) String keyword) {
        try {
            List<Article> articleList = articleService.getArticleList(category, userId, keyword);
            return CommonResult.success(articleList);
        } catch (Exception e) {
            return CommonResult.failed("获取文章失败: " + e.getMessage());
        }
    }

    @GetMapping("/getArticleDetailById")
    public CommonResult<Article> getArticleDetailById(@RequestParam Integer articleId) {
        Article articleDetail = articleService.getArticleDetailById(articleId);
        return CommonResult.success(articleDetail);
    }
}
