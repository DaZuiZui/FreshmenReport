package com.dazuizui.webserver.controller;

import com.alibaba.fastjson.JSON;
import com.dazuizui.webserver.pojo.ClassT;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.serivce.Impl.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class ClassController {
    @Autowired
    private ClassServiceImpl classService;


    @PostMapping("/clas/updatethedata")
    public String Updatethestudentclass(@RequestBody Students students){
        classService.Updatethestudentclass(students);
        return "true";
    }

    /**
     *
     * @param studentid
     */
    @GetMapping("/clas/dele")
    public void deleteStudentid(@RequestParam("studentid") String studentid){
        System.out.println("sss");
        classService.deleteStudentid(studentid);
    }

    @GetMapping("/class/getalldate")
    public String getAll(){
        return JSON.toJSONString(classService.getAll());
    }

    @GetMapping("/class/getTheClassOftheStundet")
    public String getTheClassOftheStundet(@RequestParam("studentid") String studentid){

        return classService.getTheClassOftheStundet(studentid);
    }
}
