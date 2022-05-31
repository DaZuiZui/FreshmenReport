package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Mapper
public interface AdminMapper {
    @Select("select *from user where username = #{username}")
    public User selectStudentByUsername(@Param("username") String username);

    @Select("select *from user LIMIT #{start},10")
    public ArrayList<User> selectAdminAll(@Param("start") int start);


    @Select("select *from user")
    public ArrayList<User> getall();

    @Insert("insert into user value(null,#{username},#{password},'admin')")
    public void addAdmin(@RequestBody User user);

    @Delete("delete from user where username = #{username}")
    public void deleteAdmin(@Param("username") String username);
}
