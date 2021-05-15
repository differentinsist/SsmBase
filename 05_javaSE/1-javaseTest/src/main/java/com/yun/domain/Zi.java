package com.yun.domain;

public class Zi extends Fu {

    public Zi(){

    }
    public Zi(String name){
        this.name = name;
    }

    public String name;

    public int num = 2000;

    public String strZi = "abc";

    public String fiction1(){
        return "这是子类的方法,父也有同名函数";
    }
}
