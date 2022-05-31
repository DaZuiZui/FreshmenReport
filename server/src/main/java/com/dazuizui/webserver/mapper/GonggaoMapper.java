package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.BaoDao;
import com.dazuizui.webserver.pojo.Gonggao;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mapper
public interface GonggaoMapper {
    @Select("select *from gonggao")
    public ArrayList<Gonggao> getallgonggao();

    @Select("select count(*) from gonggao")
    public int getallnumber();

    @Select("select *from gonggao limit #{start},10")
    public ArrayList<Gonggao> getlimitdate(@Param("start")int start);

    @Insert("insert into gonggao value(null,#{title},#{context})")
    public void insertdata(Gonggao baoDao);

    @Delete("delete from gonggao where id = #{id}")
    public void deltegongao(@Param("id")String id);

    @Select("select *from gonggao where id = #{id}")
    public Gonggao sgongao(@Param("id")String id);

    @Update("update gonggao set title = #{title},context = #{context} where id = #{id}")
    public void ud(@RequestBody Gonggao gonggao);
}
