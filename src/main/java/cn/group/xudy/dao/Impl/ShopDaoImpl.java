package cn.group.xudy.dao.Impl;

import cn.group.xudy.dao.ShopDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@MapperScan("cn.group.xudy.dao.Impl")
@SpringBootApplication
@Repository
public class ShopDaoImpl implements ShopDao {
}
