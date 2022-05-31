package com.dazuizui.webserver.controller;

import com.alibaba.excel.EasyExcel;
import com.dazuizui.webserver.config.ExhcelStudentDtoListener;
import com.dazuizui.webserver.config.User.UserExhcelStudentDtoListener;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;
import com.dazuizui.webserver.serivce.AdminSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminSerivce adminSerivce;
    /**
     * 将学生信息导出
     * @retur
     * */
    @GetMapping("/admin/daochu")
    public void daochu(){
        String fileName = "D:\\private job\\03162022 newstudenttoschool\\webserver\\src\\main\\resources\\static\\adminbeifen.xlsx"; //需要提前新建目录
        EasyExcel.write(fileName, User.class).sheet("模板").doWrite(data());
    }
    private List data(){
        List<User> list = adminSerivce.getall();
        return list;
    }

    @PostMapping("/user/addoneuser")
    public String addoneAdmin(@RequestBody User user){
        adminSerivce.addAdmin(user);
        return "true";
    }

    @GetMapping("/user/selectalladmin")
    public String selectAdminAll(@RequestParam("start")String start){
        return adminSerivce.selectAdminAll(start);
    }

    @GetMapping("/user/deltetheadmin")
    public String deleteAdmin(@RequestParam("username")String username){
        adminSerivce.deleteAdmin(username);
        return "true";
    }

    @GetMapping("/user/deletestudentid")
    public void deleteStudentid(String studentid) {
        System.out.println("删除");
        adminSerivce.deleteAdmin(studentid);
    }
    /**
     * add date by excel
     * @param file
     * @return
     */
    @PostMapping("/user/addAdmin")
    public String addAdmin(@RequestParam("files") MultipartFile file){
        try {
            EasyExcel.read(file.getInputStream(), User.class, new UserExhcelStudentDtoListener()).sheet().doRead();
            List<User> list = UserExhcelStudentDtoListener.list;
            System.out.println(list.size());
            for (User dto : list) {
                //写入mysql
                adminSerivce.addAdmin(dto);
            }

            list.clear();
        }catch(Exception e){
            UserExhcelStudentDtoListener.list.clear();
            e.printStackTrace();
        }


        return  "true";
    }

}