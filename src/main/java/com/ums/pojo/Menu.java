package com.ums.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Menu {
    // 根据表格ums_menu生成相关字段
    private Long id;
    private Long parentId;
    private Date createTime;
    private String title;
    private Integer level;
    private Integer sort;
    private String name;
    private String icon;
    private Integer hidden;
}
