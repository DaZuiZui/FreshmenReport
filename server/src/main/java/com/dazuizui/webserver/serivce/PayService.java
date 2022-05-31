package com.dazuizui.webserver.serivce;

import com.dazuizui.webserver.pojo.Paymanagement;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
public interface PayService {
    public int getpaynumber();

    public ArrayList<Paymanagement> getallpay(@RequestParam("start")int start);

    public void imageurl(String studentid,String iamgeurl);

    @GetMapping("/pay/getpyimagelist")
    public String getimagelistbystudentid(@RequestParam("studentid")String studentid);

    /**
     * 更改状态
     * @param studentid
     * @param state
     * @return
     */
    public String updatestatebystudetid(@RequestParam("studentid")String studentid,@RequestParam("state")String state);
}
