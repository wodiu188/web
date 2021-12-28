package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Mapper.articleMapper;
import com.finaldevelopment.YH.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Article")
public class ArticleController {

    @Autowired
    private articleMapper mapper;

    @GetMapping("/query")
    public Result queryArticleAll(){
        List<article> articles = mapper.queryAllArticle();
        Result<List<article>> success = Result.success(articles);
        return success;
    }

    @GetMapping("/queryByName")
    public Result queryArticleByName(String name){
        System.out.println(name);
        article article = mapper.queryByName(name);
        System.out.println(article);
        return Result.success(article);
    }

    @GetMapping("/queryByDescription")
    public Result queryArticleByDescription(String name){
        List<article> articles = mapper.queryByNameDescription(name);
        return Result.success(articles);
    }

    @PostMapping("/aaaa")
    public Result insertArticle(article articles, HttpServletRequest servlet){

//        System.out.println(a_name);
//        System.out.println(description);
//        System.out.println(content);
//
//        article articles = new article();
//        articles.setA_name(a_name);

        article article = mapper.queryByName(articles.getA_name());
        if (article != null)
        {
            return Result.error("已存在","500");
        }
        System.out.println(articles);

        int i = mapper.insertArticle(articles);
        return Result.success(i);
    }

}
