package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.mapper.ClassMapper;
import com.dazuizui.webserver.mapper.PayMapper;
import com.dazuizui.webserver.mapper.UserMapper;

import com.dazuizui.webserver.pojo.ClassT;
import com.dazuizui.webserver.pojo.Paymanagement;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;
import com.dazuizui.webserver.serivce.UserService;
import com.dazuizui.webserver.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PayMapper payMapper;
    @Autowired
    private ClassMapper classMapper;

    @Override
    public int selectAdminAllnumber() {
        return userMapper.selectAdminAllnumber();
    }

    /**
     * 查询全部学生的数据
     * @return
     */
    public String selectAll(String start){
        System.out.println(start);
        ArrayList<Students> students = userMapper.selectAllStudent((Integer.valueOf(start)*10));
        System.out.println(students);
        return JSONArray.toJSONString(students);
    }
    /**
     * 删除一个学生
     */
    @Override
    public String deleteStudent(String id) {
        userMapper.deleteStudent(id);
        return  "true";
    }

    /**
     *  查询账号密码是否正确
     */
    @Override
    public String queryDateOfUserByUsernameAndPassowrd(User user) {
        User user1 = userMapper.queryDataOfUserByUsernameAndPassword(user);
        String returnson = "false";
        if (user1 != null){
            //生成JWT
            returnson = JwtUtil.createJWT(user);
        }
        return JSONArray.toJSONString(returnson);
    }

    /**
     * 添加一个学生
     * @param student
     * @return
     */
    @Override
    public String addStudent(Students student) {
        System.out.println(student);
        if (userMapper.queryTheDateOfStundentsBystudentid(student.getStudentid()) == null) {
            userMapper.insertStudents(student);
            Paymanagement paymanagement = new Paymanagement();
            paymanagement.setStudentid(student.getStudentid());
            payMapper.addStudent(paymanagement);

            ClassT classT = new ClassT();
            classT.setStudentid(student.getStudentid());
            classT.setName(student.getName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            classT.setYear(format);
            classT.setZhuanye(student.getZhuanye());
            classMapper.insert(classT);
        }else{
            System.out.println("添加失败");
        }

        return null;
    }
}
