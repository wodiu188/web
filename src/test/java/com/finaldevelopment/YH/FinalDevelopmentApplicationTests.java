package com.finaldevelopment.YH;

import com.finaldevelopment.YH.Entity.a_type;
import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Mapper.a_typeMapper;
import com.finaldevelopment.YH.Mapper.articleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FinalDevelopmentApplicationTests {

    @Autowired
    articleMapper articleMapper;

    @Test
    void contextLoads() {

        List<article> articles = articleMapper.queryAllArticle();
        for (article a:articles){
            System.out.println(a);
        }


    }

}
