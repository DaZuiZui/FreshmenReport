package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.LYB;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Mapper
public interface LyMapper {
    @Insert("insert into lyb value(null,#{ly})")
    public void ly(@RequestBody LYB lyb);

    @Select("select *from lyb")
    public ArrayList<LYB> sall();
}
