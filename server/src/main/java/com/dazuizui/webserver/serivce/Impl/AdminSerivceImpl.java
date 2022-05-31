package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.dazuizui.webserver.mapper.AdminMapper;
import com.dazuizui.webserver.pojo.User;
import com.dazuizui.webserver.serivce.AdminSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
public class AdminSerivceImpl implements AdminSerivce {
    @Autowired
    private AdminMapper adminMapper;
    /**
     * 查询全部的管理员
     */
    @Override
    public String selectAdminAll(String start) {
        return JSONArray.toJSONString(adminMapper.selectAdminAll((Integer.valueOf(start)-1)*10));
    }

    @Override
    public String deleteAdmin(String username){
        adminMapper.deleteAdmin(username);
        return "true";
    }

    @Override
    public ArrayList<User> getall() {
        return adminMapper.getall();
    }

    /**
     * 添加一个管理员
     * @param user
     * @return
     */
    public String addAdmin(@RequestBody User user){
        User user1 = adminMapper.selectStudentByUsername(user.getUsername());
        if (user1 == null){
            adminMapper.addAdmin(user);
        }

        return "true";
    }
}
