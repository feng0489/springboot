package cn.group.xudy.controller;

import cn.group.xudy.model.RespCode;
import cn.group.xudy.model.Result;
import cn.group.xudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping(value = "/login")
    public Result login(@RequestBody Map<String, String> person){
        RespCode res = new RespCode();
        res.setCode(0);
        res.setMsg("ok");
        return  new Result(res,person);
    }


}
