package cn.group.xudy.service.Impl;


import cn.group.xudy.dao.UserDao;
import cn.group.xudy.mapper.UserMapper;
import cn.group.xudy.model.User;
import cn.group.xudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map<String, Object>> listUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> findUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
