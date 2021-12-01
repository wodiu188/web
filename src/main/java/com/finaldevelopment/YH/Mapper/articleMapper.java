package com.finaldevelopment.YH.Mapper;

import com.finaldevelopment.YH.Entity.a_type;
import com.finaldevelopment.YH.Entity.article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface articleMapper {

    public List<article> queryByName(String name);

    public article queryByID(int id);

    public List<article> queryByType(a_type a_type);

    public int insertArticle(article article);

    public int deleteArticle(article article);
}
