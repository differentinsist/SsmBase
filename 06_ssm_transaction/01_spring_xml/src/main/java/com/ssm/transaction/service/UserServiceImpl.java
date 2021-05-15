package com.ssm.transaction.service;

import com.ssm.transaction.dao.UserDao;
import com.ssm.transaction.domain.Department;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Department> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public Department findById(Integer id) {
        return null;
    }
}
