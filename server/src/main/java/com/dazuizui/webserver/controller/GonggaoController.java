package com.dazuizui.webserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.pojo.Gonggao;
import com.dazuizui.webserver.serivce.Impl.GonggaoServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class GonggaoController {
    @Autowired
    private GonggaoServiceImpl gonggaoService;

    /**
     * 获取分页数据
     * @param start
     * @return
     */
    @GetMapping("/gg/getfenye")
    public String getlimitdate(int start){
        return JSONArray.toJSONString(gonggaoService.getlimitdate((start-1)*10));
    }

    @PostMapping("/gg/insertdemo")
    public void insertdemo(@RequestBody Gonggao gonggao){
        gonggaoService.insertdata(gonggao);
        return;
    }

    @GetMapping("/GG/getallnumber")
    public int getallnumber(){
        return gonggaoService.getallnumber();
    }

    @GetMapping("/gg/deletedemo")
    public void deltegongao(@RequestParam("id") String id){
        System.out.println("删除 ");
        gonggaoService.deltegongao(id);
        return;
    }

    @GetMapping("/gg/gtu")
    public String sgongao(@RequestParam("id")String id){
        return JSONArray.toJSONString(gonggaoService.sgongao(id));
    }

    @PostMapping("/gg/ud")
    public void ud(@RequestBody Gonggao gonggao){
        gonggaoService.ud(gonggao);
        return;
    }
}
