package com.dazuizui.webserver.controller;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.pojo.Paymanagement;
import com.dazuizui.webserver.serivce.PayService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


@CrossOrigin
@RestController
public class PayManagementController {
    @Autowired
    private PayService payService;
    //获取yaml中配置的上传路径属性
    @Value(("${web.upload-path}"))
    private String uploadPath;


    @GetMapping("/pay/number")
    public int getpaynumber(){
        return payService.getpaynumber();
    }

    /**
     * 更改状态
     * @param studentid
     * @param state
     * @return
     */
    @GetMapping("/pay/updatestateze")
    public String updatestatebystudetid(@RequestParam("studentid")String studentid,@RequestParam("state")String state){
        return payService.updatestatebystudetid(studentid,state);
    }

    /**
     * 通过准好证获取图片集合
     * @param studentid
     * @return
     */
    @GetMapping("/pay/getpyimagelist")
    public String getimagelistbystudentid(@RequestParam("studentid")String studentid){

        return payService.getimagelistbystudentid(studentid);
    }


    @GetMapping(value ="/getimage",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto(@RequestParam("imgUrl") String imgUrl) throws IOException {

        File file = new File(uploadPath+"/"+imgUrl);

        FileInputStream inputStream = new FileInputStream(file);

        byte[] bytes = new byte[inputStream.available()];

        inputStream.read(bytes, 0, inputStream.available());

        return bytes;

    }



    @PostMapping("/uploadimage")
    public String upload(@RequestPart("files") MultipartFile file,@RequestParam("studentid")String studentid) throws IOException {
        if (studentid.length() == 0){
            return "error";
        }
        String fileName = file.getOriginalFilename();                //获取文件原名
        String visibleUri="/"+fileName;                              //拼接访问图片的地址
        String saveUri=uploadPath+"/"+studentid+"/"+fileName;        //拼接保存图片的真实地址



        File saveFile = new File(saveUri);
        //判断是否存在文件夹，不存在就创建，但其实可以直接手动确定创建好，这样不用每次保存都检测
        if (!saveFile.exists()){
            saveFile.mkdirs();
        }
        try {
            file.transferTo(saveFile);  //保存文件到真实存储路径下
        } catch (IOException e) {
            e.printStackTrace();
        }

        saveUri = "http://127.0.0.1/getimage?imgUrl="+"/"+studentid+"/"+fileName;
        //写入数据库
        payService.imageurl(studentid,saveUri);
        return visibleUri;
    }


    @GetMapping("/user/getAllPay")
    public String getallpay(@RequestParam("start")int start)
    {
        return JSONArray.toJSONString(payService.getallpay((start-1)*10));
    }

}
