package com.yun.domain;

//测试成员方法到底是使用子类的还是父类的
public class Fu {

    public int num = 10;

    public String strFu = "dfsabc";

    public String fiction1(){
        return "父类的方法,子类也有同名函数";
    }
}
