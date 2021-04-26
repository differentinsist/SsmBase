package com03.yun.dao;


import com03.yun.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//注解和XML映射文件混合方式使用
public interface ProductDao {

    //这是方法是XML方式
    List<Product> findAllProductMessage();


    //这是方法是注解查询
    @Select("select * from product where id = 1")
    Product findProductById();

}
