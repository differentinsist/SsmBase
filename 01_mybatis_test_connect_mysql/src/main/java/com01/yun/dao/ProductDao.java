package com01.yun.dao;

import com01.yun.pojo.Product;

import java.util.List;

public interface ProductDao {

    //查询所有商品
    public abstract List<Product> queryAllProduct();
}
