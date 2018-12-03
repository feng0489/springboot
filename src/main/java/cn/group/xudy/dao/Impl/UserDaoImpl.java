package cn.group.xudy.dao.Impl;

import cn.group.xudy.Vo.CollectionVo;
import cn.group.xudy.dao.UserDao;
import cn.group.xudy.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.List;

// MyBatis 支持
//@MapperScan("cn.group.xudy.model.dao.Impl")
@MapperScan("cn.group.xudy.dao.Impl")
@SpringBootApplication
@Repository
public class UserDaoImpl implements UserDao {
//    @Override
//    public List<CollectionVo> findAllUser() {
//        return null;
//    }
//
//    @Override
//    public List<CollectionVo> findUserById(int id) {
//        return null;
//    }
//
//    @Override
//    public int insertUser(User user) {
//        return 0;
//    }
//
//    @Override
//    public int updateUserByid(User user) {
//        return 0;
//    }
}
