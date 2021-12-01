package com.finaldevelopment.YH.Mapper;

import com.finaldevelopment.YH.Entity.users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface usersMapper {

    public users queryByName(String name);

    public users queryByID(int id);

    public int insertUsers(users users);

    public int updateUsers(users users);

    public int deleteUsersById(int id);

}
