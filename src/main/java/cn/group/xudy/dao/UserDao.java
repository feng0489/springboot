package cn.group.xudy.dao;

import cn.group.xudy.Vo.CollectionVo;
import cn.group.xudy.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

//    @Select("select * from user;")
//    List<CollectionVo> findAllUser();
//
//
//    @Select("SELECT * FROM user WHERE id = #{id}")
//    List<CollectionVo> findUserById(int id);
//
//
//    @Insert("INSERT INTO user (username,password,phone,weixin,father,create_time,referral_link,user_grade,user_nick,user_photo,last_login,user_ip,dervice) " +
//            "values (#{username},#{password},#{phone},#{weixin},#{father},#{create_time},#{referral_link},#{user_grade},#{user_nick},#{user_photo},#{last_login},#{user_ip},#{dervice})")
//    int insertUser(User user);
//
//    @Update("UPDATE user SET  username = #{username}, password = #{password}," +
//            "message = #{message} weixin = #{weixin} where id = #{id}")
//    int updateUserByid(User user);
}
