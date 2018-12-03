package cn.group.xudy.mapper;

import cn.group.xudy.model.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ShopMapper {

    @Select("select * from shop")
    List<Map<String,Object>> selectAll();

    @Insert("INSERT INTO shop(total_price, free_price, price, commission_rate, coupon_total_count, coupon_info, coupon_remain_count, coupon_click_url, photo_url, shop_title, shop_nick, item_description, shop_id, title, shop_from, free_start_time, free_end_time, goods_sum, shop_type) " +
                          "VALUES (#{total_price}, #{free_price}, #{price},  #{commission_rate}, #{coupon_total_count}, #{coupon_info}, #{coupon_remain_count}, #{coupon_click_url}, #{photo_url}, #{shop_title}, #{shop_nick}, #{item_description}, #{shop_id}, #{title}, #{shop_from}, #{free_start_time}, #{free_end_time}, #{goods_sum}, #{shop_type});")
    int insert(Shop shop);

    List<Shop> selectById(int id);


}
