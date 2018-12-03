package cn.group.xudy.service;

import cn.group.xudy.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map<String,Object>> listUser();

    int insertUser(User user);

    List<User> findUserById(int id);
}
