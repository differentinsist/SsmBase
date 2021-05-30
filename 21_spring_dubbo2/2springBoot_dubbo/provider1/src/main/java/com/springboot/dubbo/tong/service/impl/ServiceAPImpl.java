package com.springboot.dubbo.tong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.tong.service.ServiceAPI;
import org.springframework.stereotype.Component;


@Component  //注册成绩bean交给spring管理
@Service(interfaceClass = ServiceAPI.class)    //com.alibaba.dubbo.config.annotation.Service(注意是dubbo的注解)
//@Service是为了对外暴露服务(暴露接口是吧)
public class ServiceAPImpl implements ServiceAPI {

    @Override
    public String getMessage() {
        return "我是提供方-你不加我的pom依赖亦可以调用我";
    }
}
