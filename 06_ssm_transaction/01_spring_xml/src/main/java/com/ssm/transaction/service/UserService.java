package com.ssm.transaction.service;


import com.ssm.transaction.domain.Department;

import java.util.List;

public interface UserService {

    public List<Department> queryAll();

    public Department findById(Integer id);


}
