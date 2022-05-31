package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.mapper.StudentsMapper;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.serivce.StudentsSerivce;
import com.dazuizui.webserver.utils.Sjwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsSerivce {
    @Autowired
    private StudentsMapper studentsMapper;

    public List<Students> getall(){
        return studentsMapper.getall();
    }

    /**
     * 通过studentid查询用户
     * @param studentid
     * @return
     */
    public String queryTheDateOfStundentsBystudentid(String studentid){
        return JSONArray.toJSONString(studentsMapper.queryTheDateOfStundentsBystudentid(studentid));
    }

    @Override
    public String getallconunt() {
        return studentsMapper.getallconunt();
    }

    /**
     * 通过Id查询指定用户
     * @param id
     * @return
     */
    @Override
    public String queryTheDateOfStundentsById(String id) {
        return JSONArray.toJSONString(studentsMapper.queryTheDateOfStundentsById(id));
    }

    /**
     * 修改用户信息
     */
    @Override
    public String updatetheuser(Students students){
        studentsMapper.updatetheuser(students);
        return "true";
    }

    public String selectStu(Students students){
        System.out.println(studentsMapper.selectStu(students));
        if (studentsMapper.selectStu(students)!=null) {
            String jwt = Sjwt.createJWT(students);
            return jwt;
        }else{
            return "false";
        }
    }
}
