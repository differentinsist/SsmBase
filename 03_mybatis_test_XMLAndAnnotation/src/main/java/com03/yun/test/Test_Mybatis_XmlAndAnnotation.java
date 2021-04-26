package com03.yun.test;


import com03.yun.dao.ProductDao;
import com03.yun.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//测试注解+XML映射文件混合使用
public class Test_Mybatis_XmlAndAnnotation {


    public static void main(String[] args) throws IOException {
        //1、读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resourceAsStream);
        //3、使用工厂生厂SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        ProductDao productDao = sqlSession.getMapper(ProductDao.class);
        //使用代理对象执行方法

        //测试注解方式
        Product product1 = productDao.findProductById();
        System.out.println("纯注解查询结果===="+product1);
        System.out.println("================下面是XML方式=======================");
        List<Product> productList = productDao.findAllProductMessage();
        for (Product product : productList){
            System.out.println(product);
        }
        //释放资源(先开后关)
        sqlSession.close();
        resourceAsStream.close();

    }

}
