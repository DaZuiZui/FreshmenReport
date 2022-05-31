package com.dazuizui.webserver.pojo;

import java.io.Serializable;

public class Students implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String studentid;
    private String year;
    private String mouth;
    private String bclass;
    private String room;
    private String builder;

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", studentid='" + studentid + '\'' +
                ", year='" + year + '\'' +
                ", mouth='" + mouth + '\'' +
                ", bclass='" + bclass + '\'' +
                ", room='" + room + '\'' +
                ", builder='" + builder + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getBclass() {
        return bclass;
    }

    public void setBclass(String bclass) {
        this.bclass = bclass;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Students() {
    }

    public Students(int id, String name, String sex, String studentid, String year, String mouth, String bclass, String room, String builder, String zhuanye, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.studentid = studentid;
        this.year = year;
        this.mouth = mouth;
        this.bclass = bclass;
        this.room = room;
        this.builder = builder;
        this.zhuanye = zhuanye;
        this.password = password;
    }

    private String zhuanye;
    private String password;
}
