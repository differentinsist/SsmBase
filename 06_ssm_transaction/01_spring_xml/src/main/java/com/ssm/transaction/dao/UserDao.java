package com.ssm.transaction.dao;

import com.ssm.transaction.domain.Department;

import java.util.List;

public interface UserDao {

    public abstract List<Department> queryAll();

    Department findById(Integer id);

}


