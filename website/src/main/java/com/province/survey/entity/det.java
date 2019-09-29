package com.province.survey.entity;


public class det {

    //选项描述
    private String opt ;
    //选项编号
    private int id ;
    //题目编号
    private int num ;
    //选项个数
    private int value ;
    private String username ;

    public String getOpt()  {
        return opt;
    }

    public void setOpt(String opt)  {
        this.opt =opt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
