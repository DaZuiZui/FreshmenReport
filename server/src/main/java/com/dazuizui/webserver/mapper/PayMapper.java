package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.Paymanagement;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Mapper
public interface PayMapper {

    @Select("select count(*) from paymanagement")
    public int getpaynumber();

    @Update("update paymanagement set state = #{state} where studentid = #{studentid}")
    public void updatestatebystudetid(@Param("studentid")String studentid,@Param("state") String state);

    @Select("select (imageurl)from payimage where studentid = #{studentid}")
    public ArrayList<String> getimagelistbystudentid(@Param("studentid")String studentid);

    @Insert("insert into payimage value(null,#{studentid},#{imageurl})")
    public void addimageurl(@Param("studentid") String studentid, @Param("imageurl") String imageurl);

    @Insert("insert into paymanagement value(null,#{studentid},555.55,'待审核')")
    public void addStudent(Paymanagement paymanagement);

    @Select("select *from paymanagement LIMIT #{start},10")
    public ArrayList<Paymanagement> getallpay(@Param("start")int start);
}
