package com.yun.threadWait;

public class Printer {

    private int flag = 1;
//    Object obj = new Object();  不用这个也行,直接用this，用这个作为锁对象的话就把所有this改为obj
//    下面两个方法的锁对象不同的话就会有问题。
    public void print1() throws InterruptedException {
        synchronized(this){
            if(flag != 1){
                this.wait();  //等待
            }
            System.out.println("1");
            Thread.currentThread().sleep(200);
            System.out.println("2");
            System.out.println("3");
            Thread.currentThread().sleep(200);
            System.out.println("4");
            System.out.println("5");
            flag = 2 ;
            this.notify();  //随机唤醒单个等待的线程    是Object里面的方法？
        }
    }

    public void print2() throws InterruptedException {
        synchronized(this){
            if(flag != 2){
                this.wait();
            }
            System.out.println("aaaa");
            Thread.currentThread().sleep(200);
            System.out.println("bbbb");
            System.out.println("cccc");
            Thread.currentThread().sleep(200);
            System.out.println("dddd");
            System.out.println("eeee");
            flag = 1;
            this.notify();
        }
    }
}
