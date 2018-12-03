package cn.group.xudy.controller;


import cn.group.xudy.model.RespCode;
import cn.group.xudy.model.Result;
import cn.group.xudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/list")
    public Result selectUser(){
        List<Map<String, Object>> list = userService.listUser();
        RespCode res = new RespCode();
        res.setMsg("ok");
        res.setCode(0);
        return new Result(res,list);
    }

}
