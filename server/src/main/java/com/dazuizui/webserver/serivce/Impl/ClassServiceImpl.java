package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.mapper.ClassMapper;
import com.dazuizui.webserver.pojo.ClassT;
import com.dazuizui.webserver.pojo.Students;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassServiceImpl {
    @Autowired
    private ClassMapper classMapper;

    public ArrayList<ClassT> getAll(){
        return classMapper.getAll();
    }

    public String getTheClassOftheStundet(@Param("studentid") String studentid){
        List<ClassT> arr = new ArrayList<>();
        arr.add(classMapper.getTheClassOftheStundet(studentid));
        return JSONArray.toJSONString(arr);
    }

    /**
     * 修改班级信息
     * @param students
     */
    public void Updatethestudentclass(Students students){
        classMapper.Updatethestudentclass(students);
    }

    public void deleteStudentid(String studentid){
        System.out.println("阐述id"+studentid);
        classMapper.deleteStudentid(studentid);
    }
}
