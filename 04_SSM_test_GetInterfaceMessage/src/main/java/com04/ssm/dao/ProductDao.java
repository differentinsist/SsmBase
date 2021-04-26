package com04.ssm.dao;


import com04.ssm.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {


    @Select("select * from product")
    List<Product> queryAllProduct();
}
