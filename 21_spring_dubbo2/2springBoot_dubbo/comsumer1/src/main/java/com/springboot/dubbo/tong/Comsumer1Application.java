package com.springboot.dubbo.tong;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.springboot.dubbo.tong.service.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//注意是添加什么注解
@SpringBootApplication
@EnableDubboConfiguration
public class Comsumer1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Comsumer1Application.class, args);意思是相当于开启容器
		ConfigurableApplicationContext run = SpringApplication.run(Comsumer1Application.class, args);
		QuickstartConsumer comsumer = (QuickstartConsumer)run.getBean("quickstartConsumer");
		comsumer.sendMessage();
	}

}
