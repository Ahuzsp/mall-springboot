package com.ums.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {
    private int articleId;
    private int userId;
    private String articleTitle;
    private String description;
    private String mdValue;
    private int category;
    private int commentCount;
    private int readCount;
    private int likeCount;
    private int collectCount;
    private String cover;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
