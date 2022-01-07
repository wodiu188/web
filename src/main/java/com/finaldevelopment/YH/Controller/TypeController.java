package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.Entity.a_type;
import com.finaldevelopment.YH.Mapper.a_typeMapper;
import com.finaldevelopment.YH.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Type")
public class TypeController {

    @Autowired
    a_typeMapper mapper;
    @GetMapping("/getAllType")
    public Result getAllType(){
        List<a_type> a_types = mapper.queryAllType();
        return Result.success(a_types);
    }

}
