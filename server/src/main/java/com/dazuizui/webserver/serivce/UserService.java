package com.dazuizui.webserver.serivce;


import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface UserService {
    public  int selectAdminAllnumber();
    /**
     * 查询全部学生的数据
     * @return
     */
    public String selectAll(String start);
    /**
     * 删除一个学生
     */
    public String deleteStudent(@RequestParam("id")String id);

    /**
     *  查询账号密码是否正确
     */
    public String queryDateOfUserByUsernameAndPassowrd(User user);

    /**
     * 添加一个学士
     * @param student
     * @return
     */
    public String addStudent(@RequestBody Students student);
}
