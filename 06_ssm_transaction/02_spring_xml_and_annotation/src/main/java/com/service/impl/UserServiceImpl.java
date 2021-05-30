package com.service.impl;

import com.dao.UserDao;
import com.pojo.Department;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired   //这里不用写useDao属性的set方法了
    private UserDao userDao;


    @Override
    public List<Department> findAllMessage() {
        return userDao.findAllMessage();
    }
}
