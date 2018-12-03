package cn.group.xudy.service;

import cn.group.xudy.model.Shop;

import java.util.List;
import java.util.Map;

public interface ShopService {

    List<Map<String,Object>> listShop();

    int insertShop(Shop shop);

    List<Shop> findShopById(int id);
}
