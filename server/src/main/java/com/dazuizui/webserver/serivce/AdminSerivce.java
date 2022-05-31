package com.dazuizui.webserver.serivce;

import com.dazuizui.webserver.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
public interface AdminSerivce {
    /**
     * 查询全部的管理员
     */
    public String selectAdminAll(String start);
    public ArrayList<User> getall();
    /**
     * 添加一个管理员
     * @param user
     * @return
     */
    public String addAdmin(@RequestBody User user);

    /**
     * 删除一个管理员
     * @param username
     * @return
     */
    public String deleteAdmin(@RequestParam("username")String username);
}
