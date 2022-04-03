package com.atguigu.mvc.dao.mapper;

import com.atguigu.mvc.dao.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 1. 映射文件的namespace要和mapper接口的全类名保持一致
     * 2. 映射文件中SQL语句的id要和mapper接口中的方法名一致
     *
     */
    List<User> getAllUser();
    /**
     * 验证登录
     */
    User checkLogin(String username, String password);

    User insertUser(String username, String password);


}
