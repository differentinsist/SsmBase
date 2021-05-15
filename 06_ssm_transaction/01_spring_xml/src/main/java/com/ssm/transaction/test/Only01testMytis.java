package com.ssm.transaction.test;

import com.ssm.transaction.dao.UserDao;
import com.ssm.transaction.domain.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//单独测试Mybatis
public class Only01testMytis {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession sqlSession = factory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<Department> list = userDao.queryAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        sqlSession.close();
        inputStream.close();
    }
}
