package com.dazuizui.webserver.serivce.Impl;

import com.dazuizui.webserver.mapper.GonggaoMapper;
import com.dazuizui.webserver.pojo.BaoDao;
import com.dazuizui.webserver.pojo.Gonggao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class GonggaoServiceImpl {
    @Autowired
    private GonggaoMapper gonggaoMapper;

    public void ud(@RequestBody Gonggao gonggao){
        gonggaoMapper.ud(gonggao);
        return;
    }

    /**
     * 插入报道
     * @param baoDao
     */
    public void insertdata(Gonggao baoDao){
        gonggaoMapper.insertdata(baoDao);
    }

    public ArrayList<Gonggao> getlimitdate(int start){
        return gonggaoMapper.getlimitdate(start);
    }

    public int getallnumber(){
        return gonggaoMapper.getallnumber();
    }

    public void deltegongao(String id){
        gonggaoMapper.deltegongao(id);
        return;
    }

    public Gonggao sgongao(@Param("id")String id){

         return  gonggaoMapper.sgongao(id);
    }
}
