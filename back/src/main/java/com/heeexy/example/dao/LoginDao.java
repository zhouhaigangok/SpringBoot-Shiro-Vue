package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @description: 登录相关dao
 */
@Repository
public interface LoginDao {
	/**
	 * 根据用户名和密码查询对应的用户
	 */
	JSONObject getUser(@Param("username") String username, @Param("password") String password);
}
