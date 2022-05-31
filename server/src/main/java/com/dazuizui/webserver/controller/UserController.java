package com.dazuizui.webserver.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.support.ExcelTypeEnum;

import com.dazuizui.webserver.config.ExhcelStudentDtoListener;

import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;
import com.dazuizui.webserver.serivce.Impl.UserServiceImpl;
import com.dazuizui.webserver.serivce.UserService;
import com.dazuizui.webserver.utils.JwtUtil;

import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8080")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/galln")
    public int selectAdminAllnumber(){
        return userService.selectAdminAllnumber();
    }

    /**
     * 查询全部数据
     */
    @GetMapping("/user/selectAll")
    public String selectAll(@RequestParam("start")String start){
        return userService.selectAll((Integer.valueOf(start)-1) + "");
    }

    /**
     * 删除一个学生
     */
    @GetMapping("/user/deletestudent")
    public String deleteStudent(@RequestParam("id")String id){
        return userService.deleteStudent(id);
    }

    /**
     * 从Excel读取数据
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping("/uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam("files") MultipartFile file) throws Exception {

            try {
                EasyExcel.read(file.getInputStream(), Students.class, new ExhcelStudentDtoListener()).sheet().doRead();
                List<Students> list = ExhcelStudentDtoListener.list;

                for (Students dto : list) {
                    //写入mysql
                    userService.addStudent(dto);
                }

                list.clear();

            }catch(Exception e){
                e.printStackTrace();
            }

        return "true";
    }

    /**
     * 登入成功生成jwt
     * @param user
     * @return
     */
    @PostMapping("/user/login")
    public String login(@RequestBody User user){
        String json = userService.queryDateOfUserByUsernameAndPassowrd(user);
        return json;
    }

    /**
     * 解析jwt
     * @param token
     * @return
     */
    @GetMapping("/user/jiexiJWT")
    public String jwixijwt(@RequestParam("token") String token){
        String username = JwtUtil.analysisJWT(token);
        return username;
    }

    @PostMapping("/user/addStudent")
    public String addStudent(@RequestBody User user){
        return "";
    }
}
