package com.springboot.dubbo.tong.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component   //Component也就是把对象(当前类)加入spring，那bean的id就是类名,首字母小写
public class QuickstartConsumer {

    @Reference(url = "dubbo://localhost:20880")
    private ServiceAPI serviceAPI;

    public String sendMessage(){
        System.out.println(serviceAPI.getMessage());//调用提供方的接口
        return "xxxx";
    }

}
