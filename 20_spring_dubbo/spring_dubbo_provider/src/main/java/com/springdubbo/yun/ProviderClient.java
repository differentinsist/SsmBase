package com.springdubbo.yun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//这个类似启动类把，我把App.java改成这样了。
public class ProviderClient {

    public static void main(String[] args) {

        //手动加载配置文件，spring的时候你学过
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-provider.xml");

        context.start();

        //会一直读取，等待你输入
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
