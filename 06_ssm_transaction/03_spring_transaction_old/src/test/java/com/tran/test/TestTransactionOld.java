package com.tran.test;


import com.tran.pojo.Transaction;
import com.tran.service.TransferAccountsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

//@RunWith是JUnit的一个注解, 用来告诉JUnit不要使用内置的方式进行单元测试, 而应该使用指定的类做单元测试 对于Spring单元测试
// 总是要使用SpringJUnit4ClassRunner.class
@RunWith(SpringJUnit4ClassRunner.class)

//告诉junit spring配置文件
//如果有多个配置文件他的value是接受一个String数组 String支持通配符
//@ContextConfiguration({"classpath:application.xml","classpath:spring-mvc.xml"})
//@ContextConfiguration("classpath:spring-*.xml")
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransactionOld {

    @Autowired
    private TransferAccountsService accountsService;

    @Test
    public void test1(){
        List<Transaction> list = accountsService.findAll();
        System.out.println(list);
    }

    //测试减少钱
    @Test
    public void testDecreate(){
        accountsService.transfer();
    }

}
