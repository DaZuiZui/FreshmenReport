package com.dazuizui.webserver.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.serivce.StudentsSerivce;
import com.dazuizui.webserver.serivce.UserService;
import com.dazuizui.webserver.utils.JwtUtil;
import com.dazuizui.webserver.utils.Sjwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8080")
@RestController
public class StudentsController {
    @Autowired
    private StudentsSerivce studentsSerivce;
    @Autowired
    private UserService userService;

    /**
     * 将学生信息导出
     * @return
     */
    @GetMapping("/stu/daochu")
    public void daochu(){
        String fileName = "D:\\private job\\03162022 newstudenttoschool\\webserver\\src\\main\\resources\\static\\beifen.xlsx"; //需要提前新建目录
        EasyExcel.write(fileName, Students.class).sheet("模板").doWrite(data());
    }
    private List data(){
        List<Students> list = studentsSerivce.getall();

        return list;
    }



    @GetMapping("/stu/fenyechangdu")
    public String getfenlength(){
        return "";
    }

    @GetMapping("/sut/getallconunt")
    public String getallconunt(){
        return JSONArray.toJSONString(studentsSerivce.getallconunt());
    }

    @GetMapping("/stu/getthedatebystuid")
    public String queryTheDateOfStundentsBystudentid(@RequestParam("studentid") String studentid){
        return studentsSerivce.queryTheDateOfStundentsBystudentid(studentid);
    }

    /**
     * 通过id查询数据
     */
    @GetMapping("/user/selectthedatabyid")
    public String queryTheDateOfStundentsById(@RequestParam("id")String id){
        return studentsSerivce.queryTheDateOfStundentsById(id);
    }

    /**
     * 添加一个学生
     */
    @PostMapping("/user/adduser")
    public String addthestudnet(@RequestBody Students students){

        userService.addStudent(students);
        return "";
    }

    /**
     * 修改用户信息
     */
    @PostMapping("/user/updateOfTheStudent")
    public String updatetheuser(@RequestBody  Students students){
        System.out.println(students);
        studentsSerivce.updatetheuser(students);
        return "true";
    }

    /**
     * 学生登入
     * @param students
     * @return
     */
    @PostMapping("/user/su")
    public String selectStu(@RequestBody Students students){
        System.out.println("okkk");
        return studentsSerivce.selectStu(students);
    }

    /**
     * 解析jwt
     * @param token
     * @return
     */
    @GetMapping("/st/jiexiJWT")
    public String jwixijwt(@RequestParam("token") String token){
        String studentid = Sjwt.analysisJWT(token);
        return studentid;
    }
}
