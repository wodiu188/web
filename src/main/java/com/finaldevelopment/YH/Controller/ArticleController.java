package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Entity.type_of_article;
import com.finaldevelopment.YH.Mapper.articleMapper;
import com.finaldevelopment.YH.Mapper.type_of_articleMapper;
import com.finaldevelopment.YH.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Article")
public class ArticleController {

    @Autowired
    private articleMapper mapper;

    @Autowired
    private type_of_articleMapper type_of_articleMapper;

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
    public Result insertArticle(article articles,String value, HttpServletRequest servlet){
//        System.out.println(value);
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
        article article2 = mapper.queryByName(articles.getA_name());

        String[] split = value.split(",");
        for (String s : split) {
            Integer integer = Integer.valueOf(s);
            type_of_article type = new type_of_article();
            type.setType_id(integer);
            type.setArticle_id(article2.getArticle_id());
            type_of_articleMapper.insertType(type);
        }
        return Result.success(i);
//        return Result.success();
    }

    @GetMapping("/getArticleByType")
    public Result getArticleByType(int id,String name){
        List<type_of_article> type_of_articles = type_of_articleMapper.queryByTypeId(id);
        List<article> lists=new ArrayList<>();
        for (type_of_article type : type_of_articles) {
            article article = mapper.queryByID(type.getArticle_id());
            lists.add(article);
        }
        Result<List<article>> success = Result.success(lists);
        success.setMsg(name);
        return success;
    }

    @PostMapping("/updateArticleByName")
    public Result updateArticleById(article article){

        mapper.updateArticle(article);

        return Result.success();
    }

}
