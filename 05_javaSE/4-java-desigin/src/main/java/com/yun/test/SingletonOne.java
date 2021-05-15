package com.yun.test;

//单例设计模式的饿汉式   一上来就创建对象
public class SingletonOne {

//    private SingletonOne(){}
//
//    private static SingletonOne sObj = new SingletonOne();
//
//    public static SingletonOne getSingletonObj(){
//        return sObj;
//    }
    public SingletonOne (){}
    public static SingletonOne ss = null ;
    public static SingletonOne getSs(){

        return ss;
    }

}
