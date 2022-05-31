package com.dazuizui.webserver.pojo;

import java.io.Serializable;

public class BaoDao implements Serializable {
    private int id;
    private String name;
    private String baodaoshijian;
    private String studentid;

    @Override
    public String toString() {
        return "BaoDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baodaoshijian='" + baodaoshijian + '\'' +
                ", studentid='" + studentid + '\'' +
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

    public String getBaodaoshijian() {
        return baodaoshijian;
    }

    public void setBaodaoshijian(String baodaoshijian) {
        this.baodaoshijian = baodaoshijian;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public BaoDao() {
    }

    public BaoDao(int id, String name, String baodaoshijian, String studentid) {
        this.id = id;
        this.name = name;
        this.baodaoshijian = baodaoshijian;
        this.studentid = studentid;
    }
}
