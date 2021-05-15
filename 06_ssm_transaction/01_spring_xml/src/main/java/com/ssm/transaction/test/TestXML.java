package com.ssm.transaction.test;

import com.ssm.transaction.domain.Department;
import com.ssm.transaction.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestXML {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        UserService userServiceImpl2 = (UserService) context.getBean("userServiceImpl2");
//        UserService userServiceImpl = (UserService) context.getBean("ser");
//        System.out.println(userServiceImpl);
        List<Department> list = userServiceImpl.queryAll();
        System.out.println(list);
        Department user = userServiceImpl2.findById(1);
        System.out.println(user);
//        try{
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }

    }
}
