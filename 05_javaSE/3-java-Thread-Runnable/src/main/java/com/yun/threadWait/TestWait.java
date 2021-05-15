package com.yun.threadWait;

public class TestWait {

    public static void main(String[] args){

        final Printer printer = new Printer();

        new Thread(){
            @Override
            public void run(){
                try {
                    for(int i=0; i<5; i++){
                        printer.print1();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                try {
                    for(int i=0; i<5; i++){
                        printer.print2();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable).start();
    }


}
