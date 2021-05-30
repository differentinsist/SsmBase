package com.dao;

import com.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository   为什么dao层不用也可以，因为在xml中配置了配置SqlSessionFactory工厂吗？？？
public interface UserDao {

    public abstract List<Department> findAllMessage();
}
