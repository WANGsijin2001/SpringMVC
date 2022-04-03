package com.atguigu.mvc.utils;

import com.atguigu.mvc.dao.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    public static SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession = null;
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//           获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//           获取会话对象sqlSession, 设置为true表示自动提交
            sqlSession = sqlSessionFactory.openSession(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSession;
    }
}
