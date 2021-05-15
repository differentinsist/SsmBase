package com.yun.thread;

public class TicketRunnable implements Runnable {

    private int num = 50;

    @Override
    public void run() {

    }

//    public void run() {
//        while(num > 0){
//            System.out.println("线程"+Thread.currentThread().getName()+":"+ num--);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
}
