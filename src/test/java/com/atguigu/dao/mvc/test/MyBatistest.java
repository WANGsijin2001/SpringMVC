package com.atguigu.dao.mvc.test;

import com.atguigu.mvc.dao.mapper.GoodsMapper;
import com.atguigu.mvc.dao.pojo.Goods;
import com.atguigu.mvc.utils.SqlSessionUtils;
import com.atguigu.mvc.dao.mapper.UserMapper;
import com.atguigu.mvc.dao.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MyBatistest {
    @Test
    public void testCheckogin() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin", "1234");
        System.out.println(user);
    }
    @Test
    public void testMyBatis() throws IOException {
//        测试功能
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
        /**
         *
         *         手动提交事务
         *         sqlSession.commit();
         */
    }
    @Test
    public void testGoods() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> list = mapper.get_goods_list();
        list.forEach(user -> System.out.println(user));
    }
}
