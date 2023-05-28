package com.example.todolist;

import java.util.UUID;

public class Todo {
    private String id;
    private String title;
    private String detail;
    private String pic;
    private String date;

    public Todo(){}

    public Todo(String title, String detail, String pic, String date){
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.title = title;
        this.detail = detail;
        this.pic = pic;
        this.date = date;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail(){
        return this.detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public String getPic(){
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }

    @Override
    public String toString(){
        return String.format("Id: %s, Title: %s, Detail: %s, Pic: %s, Date: %s", this.id, this.title, this.title, this.pic, this.date);
    }
}
