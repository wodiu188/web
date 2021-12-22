package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Mapper.articleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("/Article")
public class ArticleController {

    @Autowired
    private articleMapper mapper;

    @RequestMapping("/query")
    public String queryArticleByName(String name){
        article articles = mapper.queryByName(name);
        return "";
    }

}
