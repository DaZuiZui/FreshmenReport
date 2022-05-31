package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM students LIMIT #{start},10")
    public ArrayList<Students> selectAllStudent(@Param("start")int start);

    @Select("select count(*) from user")
    public  int selectAdminAllnumber();

    @Select("select *from user where username =#{username} and password = #{password}")
    public User queryDataOfUserByUsernameAndPassword(User user);


    @Insert("insert into students value(null,#{name},#{sex},#{studentid},#{year},#{mouth},#{room},#{builder},#{password})")
    public void insertStudents(Students student);

    @Select("select * from students where studentid = #{studentid}")
    public Students queryTheDateOfStundentsBystudentid(@Param("studentid") String studentid);

    /**
     * 删除一个学生
     */
    @Delete("delete from students where id = #{id}")
    public void deleteStudent(String id);
}
