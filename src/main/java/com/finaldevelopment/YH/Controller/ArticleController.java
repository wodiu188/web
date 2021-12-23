package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Mapper.articleMapper;
import com.finaldevelopment.YH.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Article")
public class ArticleController {

    @Autowired
    private articleMapper mapper;

    @GetMapping("/query")
    public Result queryArticleByName(){
        List<article> articles = mapper.queryAllArticle();
        Result<List<article>> success = Result.success(articles);
        return success;
    }

}
