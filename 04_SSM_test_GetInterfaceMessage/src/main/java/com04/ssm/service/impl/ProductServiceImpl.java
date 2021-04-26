package com04.ssm.service.impl;


import com04.ssm.dao.ProductDao;
import com04.ssm.pojo.Product;
import com04.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    public List<Product> findAllProduct(){
        System.out.println("执行service层了吗");
        List<Product> products = this.productDao.queryAllProduct();
        return  products;
    }
}
