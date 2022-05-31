package com.dazuizui.webserver.serivce.Impl;

import com.dazuizui.webserver.mapper.LyMapper;
import com.dazuizui.webserver.pojo.LYB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class LyService {
    @Autowired
    private LyMapper lyMapper;

    public String ly(@RequestBody LYB lyb){
         lyMapper.ly(lyb);
         return "tr";
    }

    public ArrayList<LYB> sall(){
       return lyMapper.sall();
    }
}
