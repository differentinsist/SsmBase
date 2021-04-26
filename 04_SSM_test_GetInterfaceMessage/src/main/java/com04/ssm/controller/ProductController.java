package com04.ssm.controller;

import com04.ssm.pojo.Product;
import com04.ssm.service.ProductService;
import com04.ssm.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    public List<Product> findAllProduct(){
        System.out.println("执行controller层了吗");
        List<Product> productList = this.productService.findAllProduct();
        return productList;
    }

}
