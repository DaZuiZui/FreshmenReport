package com.dazuizui.webserver.pojo;

public class ClassT {
    private int id;
    private String studentid;
    private String name;
    private String year;
    private String zhuanye;
    private String bclass;

    @Override
    public String toString() {
        return "ClassT{" +
                "id=" + id +
                ", studentid='" + studentid + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", bclass='" + bclass + '\'' +
                '}';
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getBclass() {
        return bclass;
    }

    public void setBclass(String bclass) {
        this.bclass = bclass;
    }

    public ClassT(int id, String studentid, String name, String year, String zhuanye, String bclass) {
        this.id = id;
        this.studentid = studentid;
        this.name = name;
        this.year = year;
        this.zhuanye = zhuanye;
        this.bclass = bclass;
    }

    public ClassT() {
    }
}
