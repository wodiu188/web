package com.finaldevelopment.YH.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class article {

    private int article_id;
    private String a_name;
    private int by_userid;
    private int type_id;
    private String description;
    private String content;
    private String a_image;
    private Date create_date;
}
