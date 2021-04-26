package com04.ssm;

import com04.ssm.controller.ProductController;
import com04.ssm.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestSSMController {

//    @Autowired
//    private ProductController productController;

    public static void main(String[] args){
        System.out.println("===========================");
        ProductController productController = new ProductController();
        List<Product> productList = productController.findAllProduct();
        System.out.println("结果====="+productList);
    }
}
