package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.BaoDao;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Mapper
public interface DaobaoMapper {
    @Select("select *from baodao limit #{start},10")
    public ArrayList<BaoDao> getalldaobao(@Param("start") int start);

    /**
     * 通过studentid删除数据
     */
    @Update("delete from baodao where studentid = #{studentid}")
    public void deletedatebystudentid(@Param("studentid")String studentid);

    /**
     * 通过studentid修改数据
     */
    @Update("update baodao set name = #{name},baodaoshijian = #{baodaoshijian} where studentid = #{studentid} ")
    public void updateBystudentid(BaoDao baoDao);

    @Select("SELECT COUNT(*) from baodao")
    public int getquanbu();

    /**
     * 通过studentid查询报道
     */
    @Select("select *from baodao where studentid = #{studentid}")
    public BaoDao getbaodaobystundentid(@Param("studentid")String studentid );

    /**
     * 添加报道数据
     */
    @Insert("insert into baodao value(null,#{studentid},#{baodaoshijian},#{name})")
    public void insertDateDaobao(BaoDao baoDao);
}
