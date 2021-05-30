package com;

import com.pojo.Department;
import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringAndMybatisXML {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService)context.getBean("userServiceImpl");
        List<Department> list = userServiceImpl.findAll();
        System.out.println(list);

    }
}
