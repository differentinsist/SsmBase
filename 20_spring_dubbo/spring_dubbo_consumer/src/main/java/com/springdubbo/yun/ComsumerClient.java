package com.springdubbo.yun;

import com.springdubbo.yun.server.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**思路：
 * 此模块是消费方，我们在消费方输入东西，相当于处理事情，然后实现调用到提供方的接口
 *
 */
public class ComsumerClient
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        context.start();
        while(true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            //获取接口  就是通过XML配置文件配置的bean里面的id来获取到对象，他是Object所以要转换一下
            ServiceAPI serviceAPI = (ServiceAPI)context.getBean("consumerService");

            System.out.println(serviceAPI.sendMessage(message));
        }
    }
}
