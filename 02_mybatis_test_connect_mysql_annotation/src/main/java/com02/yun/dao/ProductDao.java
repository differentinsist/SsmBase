package com02.yun.dao;

import com02.yun.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//使用纯注解方式；没有xml映射文件
public interface ProductDao {

    @Select("select * from product")
    public abstract List<Product> findAllProduct();

}
