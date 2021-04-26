package com04.ssm.test;

import com04.ssm.controller.ProductController;
import com04.ssm.pojo.Product;
import com04.ssm.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


//@RunWith是JUnit的一个注解, 用来告诉JUnit不要使用内置的方式进行单元测试, 而应该使用指定的类做单元测试 对于Spring单元测试
// 总是要使用SpringJUnit4ClassRunner.class
@RunWith(SpringJUnit4ClassRunner.class)

//告诉junit spring配置文件
//如果有多个配置文件他的value是接受一个String数组 String支持通配符
//@ContextConfiguration({"classpath:application.xml","classpath:spring-mvc.xml"})
//@ContextConfiguration("classpath:spring-*.xml")
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSM {

    //这样就可以使用以来注入来导入对象了；如果你是创建main的方式，因为是静态了，不能使用非静态的东西，只能手动new对象

    @Autowired
    private ProductServiceImpl productService;

    //下面这个可以拿到数据了。
    @Test
    public void testSsmMybatisConnectotMysql(){
        List<Product> allProduct = this.productService.findAllProduct();
        System.out.println("=========="+allProduct);
    }
}
