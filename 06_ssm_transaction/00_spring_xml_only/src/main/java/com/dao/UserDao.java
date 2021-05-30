package com.dao;

import com.pojo.Department;

import java.util.List;

public interface UserDao {

    public abstract List<Department> findAll();
}
