package com.dazuizui.webserver.pojo;


public class LYB {
    private int id;
    private String ly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    @Override
    public String toString() {
        return "LYB{" +
                "id=" + id +
                ", ly='" + ly + '\'' +
                '}';
    }

    public LYB() {
    }

    public LYB(int id, String ly) {
        this.id = id;
        this.ly = ly;
    }
}
