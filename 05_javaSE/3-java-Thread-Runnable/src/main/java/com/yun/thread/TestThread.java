package com.yun.thread;

public class TestThread {

    public static void main(String[] args) throws Exception {
        //如果是第一阶段就这样获取Class对象，但是有什么用呢
        Class cls1 = Class.forName("com.yun.thread.Student");
        System.out.println(cls1); //class com.yun.thread.Student
        //2、
        Class cls2 = Student.class;
        System.out.println(cls2); //class com.yun.thread.Student
        //3、
        Class<? extends Student> cls3 = new Student().getClass();
        System.out.println(cls3); //class com.yun.thread.Student


//        TicketRunnable ticketRunnable = new TicketRunnable();
//        Thread t1 = new Thread(ticketRunnable);
//        t1.start();
//        Thread t2 = new Thread(ticketRunnable);
//        t2.start();


        //继承Thread类的多线程
//        MyThread myThread = new MyThread();
//        myThread.start();


        //实现接口的多线程
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//
//
//        //main线程的代码
//        for (int b=0; b<50; b++){
//            System.out.println("main:"+b);
//            Thread.sleep(100);
//        }
    }
}
