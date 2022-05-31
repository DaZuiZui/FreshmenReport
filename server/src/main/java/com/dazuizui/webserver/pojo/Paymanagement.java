package com.dazuizui.webserver.pojo;

import java.io.Serializable;

public class Paymanagement implements Serializable {
    private int id;
    private String studentid;
    private double money;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Paymanagement() {
    }

    public Paymanagement(int id, String studentid, double money, String state) {
        this.id = id;
        this.studentid = studentid;
        this.money = money;
        this.state = state;
    }
}
