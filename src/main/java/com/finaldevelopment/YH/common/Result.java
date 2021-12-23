package com.finaldevelopment.YH.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)

@ApiModel("同一请求数据的返回类型")
public class Result<T> {

    @ApiModelProperty("成功或者错误信息")
    private String msg;
    @ApiModelProperty("状态码,0代表成功")
    private String code;
    @ApiModelProperty("请求后返回的数据")
    private T data;

    public Result(){

    }

    public Result(T data) {
        this.data = data;
    }

    public static Result success(){
        Result result = new Result();
        result.code="0";
        result.msg="success";
        return result;
    }
    public static <T> Result<T> success(T data){
        Result result = new Result<>(data);
        result.code="0";
        result.msg="success";
        return result;
    }

    public static Result error(String msg,String code){
        Result<Object> result = new Result<>();
        result.msg=msg;
        result.code=code;
        return result;
    }

}
