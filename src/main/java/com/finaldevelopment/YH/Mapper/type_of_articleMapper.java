package com.finaldevelopment.YH.Mapper;

import com.finaldevelopment.YH.Entity.type_of_article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface type_of_articleMapper {

    public List<type_of_article> queryAllTA();

    public List<type_of_article> queryByTypeId(int id);

    public int insertType(type_of_article type_of_article);
}
