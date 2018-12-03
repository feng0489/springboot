package cn.group.xudy.controller;

import cn.group.xudy.model.RespCode;
import cn.group.xudy.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {


    /**
     * 捕获异常类
     * @param ex  异常
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exceptionHandler(Exception ex){
        RespCode res = new RespCode();
        res.setCode(1);
        res.setMsg("请求异常");
     return new Result(res,ex.getMessage());
    }
}
