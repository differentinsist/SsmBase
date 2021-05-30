package com.service.impl;

import com.dao.UserDao;
import com.pojo.Department;
import com.service.UserService;

import java.util.List;


//不使用注解,纯xml
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao){    //必须提供set方法
        this.userDao = userDao;
    }

    @Override
    public List<Department> findAll() {
        return userDao.findAll();
    }
}
