package cn.group.xudy.service.Impl;

import cn.group.xudy.dao.ShopDao;
import cn.group.xudy.mapper.ShopMapper;
import cn.group.xudy.model.Shop;
import cn.group.xudy.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopDao shopDao;

    @Autowired
    ShopMapper shopMapper;

    @Override
    public List<Map<String, Object>> listShop() {
        return shopMapper.selectAll();
    }

    @Override
    public int insertShop(Shop shop) {
        return shopMapper.insert(shop);
    }

    @Override
    public List<Shop> findShopById(int id) {
        return shopMapper.selectById(id);
    }
}
