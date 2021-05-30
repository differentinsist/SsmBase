package com.ssm.yun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class ProviderClient
{
    public static void main( String[] args ){

        //手动加载配置文件，spring的时候你学过
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-provider.xml");

        context.start();

        //会一直读取，等待你输入
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
