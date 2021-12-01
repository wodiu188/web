package com.finaldevelopment.YH;

import com.finaldevelopment.YH.Entity.a_type;
import com.finaldevelopment.YH.Mapper.a_typeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalDevelopmentApplicationTests {

    @Autowired
    a_typeMapper a_typeMapper;

    @Test
    void contextLoads() {

        a_type a_type = a_typeMapper.queryByName("111");
        System.out.println(a_type);

    }

}
