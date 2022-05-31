package com.dazuizui.webserver.serivce;

import com.dazuizui.webserver.pojo.Students;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public interface StudentsSerivce {
    /**
     * 通过id查询数据
     */
    public String queryTheDateOfStundentsById(String id);

    /**
     * 修改用户信息
     */
    public String updatetheuser(Students students);

    /**
     * 通过studentid查询用户
     * @param studentid
     * @return
     */
    public String queryTheDateOfStundentsBystudentid(String studentid);

    public String getallconunt();

    public List<Students> getall();

    public String selectStu(Students students);
}
