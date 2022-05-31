package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.mapper.PayMapper;
import com.dazuizui.webserver.pojo.Paymanagement;
import com.dazuizui.webserver.serivce.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;

    @Override
    public ArrayList<Paymanagement> getallpay(@RequestParam("start")int start) {

        return payMapper.getallpay(start);
    }

    /**
     * 保存图片地址
     * @param studentid
     * @param iamgeurl
     */
    @Override
    public void imageurl(String studentid, String iamgeurl) {
        payMapper.addimageurl(studentid,iamgeurl);
    }

    /**
     * 通过准好证获取图片集合
     * @param studentid
     * @return
     */
    @Override
    public String getimagelistbystudentid(@RequestParam("studentid")String studentid){
        System.out.println(studentid);
        return JSONArray.toJSONString(payMapper.getimagelistbystudentid(studentid));
    }


    /**
     *
     * @return
     */
    public int getpaynumber(){
        return payMapper.getpaynumber();
    }

    /**
     * 更改状态
     * @param studentid
     * @param state
     * @return
     */
    @Override
    public String updatestatebystudetid(String studentid, String state) {
        payMapper.updatestatebystudetid(studentid, state);
        return "true";
    }
}
