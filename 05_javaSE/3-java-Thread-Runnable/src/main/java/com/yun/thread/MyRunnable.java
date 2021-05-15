package com.yun.thread;

public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable==="+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
