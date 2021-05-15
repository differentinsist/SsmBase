package com.yun.thread;

public class MyThread extends Thread {

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("MyThread==="+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
