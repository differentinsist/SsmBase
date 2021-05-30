package com.ssm.yun;

import com.ssm.yun.server.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ComsumerClient {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        context.start();

        //获取接口  就是通过XML配置文件配置的bean里面的id来获取到对象，他是Object所以要转换一下
        ServiceAPI serviceAPI = (ServiceAPI)context.getBean("consumerService");
        System.out.println(serviceAPI.getTheMessage());

    }
}
