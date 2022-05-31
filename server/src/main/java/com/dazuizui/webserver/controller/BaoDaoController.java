package com.dazuizui.webserver.controller;

import com.dazuizui.webserver.pojo.BaoDao;
import com.dazuizui.webserver.serivce.Impl.BaoDaoServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class BaoDaoController {
    @Autowired
    private BaoDaoServiceImpl baoDaoService;
    @GetMapping("/baodao/getall")
    public String getalldaobao(@RequestParam("start")String start){
        String getalldaobao = baoDaoService.getalldaobao(start);
        System.out.println(getalldaobao);
        return  getalldaobao;
    }
    @GetMapping("/baogao/getallnumber")
    public String getquanbu(){
        return baoDaoService.getquanbu();
    }

    @PostMapping("/baodao/tianjiabaodao")
    public String insertDateDaobao(@RequestBody BaoDao baoDao){
        baoDaoService.insertDateDaobao(baoDao);
        return "true";
    }

    /**
     * 通过准考证号删除
     * @param studentid
     */
    @GetMapping("/baodao/deletedate")
    public void deletedatebystudentid(@RequestParam("studentid")String studentid){
        baoDaoService.deletedatebystudentid(studentid);
        return;
    }

    /**
     * 更新
     * @param baoDao
     */
    @PostMapping("/baodao/updatedate")
    public void updateBystudentid(@RequestBody BaoDao baoDao){
        baoDaoService.updateBystudentid(baoDao);
    }

    /**
     * 通过username
     */
    @GetMapping("/baodao/gettheusername")
    public String selectDateBystudentid(@RequestParam("studentid")String studentid) {
      return   baoDaoService.getbaodaobystundentid(studentid);
    }
}
