package com.dazuizui.webserver.controller;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.pojo.LYB;
import com.dazuizui.webserver.serivce.Impl.LyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LyController {
    @Autowired
    private LyService lyService;

    @GetMapping("/ly/sall")
    public String sall(){
        return JSONArray.toJSONString(lyService.sall());
    }

    @GetMapping("/ly/add")
    public String ly(@RequestParam("ly") String ly){
            LYB lyb =new LYB();
            lyb.setLy(ly);
        System.out.println(lyb);
        lyService.ly(lyb);
        return "true";
    }
}
