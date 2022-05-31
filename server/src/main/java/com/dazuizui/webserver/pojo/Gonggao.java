package com.dazuizui.webserver.pojo;

public class Gonggao {
    private int id =0;
    private String title ="";
    private String context="";
    @Override
    public String toString() {
        return "Gonggao{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Gonggao() {
    }

    public Gonggao(int id, String title, String context) {
        this.id = id;
        this.title = title;
        this.context = context;
    }


}
