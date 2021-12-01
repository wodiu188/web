package com.finaldevelopment.YH.Mapper;

import com.finaldevelopment.YH.Entity.a_type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface a_typeMapper {

    public a_type queryByName(String name);

    public int insertAType(a_type a_type);

    public int deleteATypeByID(int id);

}
