package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.Students;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentsMapper {

    @Select("select *from students where studentid = #{studentid} and password = #{password}")
    public Students selectStu(Students students);

    @Select("SELECT s.id,s.name,s.sex,s.studentid,s.year,s.mouth,s.room,s.builder,s.`password`,c.zhuanye,c.bclass from students s INNER join classT c where s.studentid = c.studentid")
    public List<Students> getall();

    @Select("SELECT COUNT(*) from students")
    public String getallconunt();

    @Select("select * from students where id = #{id}")
    public Students queryTheDateOfStundentsById(String id);

    @Select("select * from students where studentid = #{studentid}")
    public Students queryTheDateOfStundentsBystudentid(@Param("studentid") String studentid);

    /**
     * 修改用户信息
     */
    @Update("update students set name = #{name},sex=#{sex},studentid = #{studentid},year=#{year},mouth=#{mouth},room=#{room},builder=#{builder} where id = #{id}")
    public void updatetheuser(Students students);
}
