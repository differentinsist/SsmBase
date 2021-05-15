package com.yun.test;

public class SingletonTwo {

    private SingletonTwo(){}

    private static SingletonTwo slt2;

    public static SingletonTwo getSlt2(){
        return slt2;
    }

}
