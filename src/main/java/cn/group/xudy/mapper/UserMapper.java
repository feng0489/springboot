package cn.group.xudy.mapper;

import cn.group.xudy.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user;")
    List<Map<String,Object>> selectAll();

    @Select("select *from user where id = #{id};")
    List<User> selectById(int id);


    @Insert("INSERT INTO user (username,password,phone,weixin,father,create_time,referral_link,user_grade,user_nick,user_photo,last_login,user_ip,dervice) " +
            "values (#{username},#{password},#{phone},#{weixin},#{father},#{create_time},#{referral_link},#{user_grade},#{user_nick},#{user_photo},#{last_login},#{user_ip},#{dervice})")
    int insert(User user);

    @Select("select * from user where #{where};")
    List<Map<String,Object>> select(String where);
}
