package com.iread.service;

import com.iread.pojo.User;
import com.iread.pojoExtend.UserExtend;

public interface UserService {

	// 插入用户
	public void insertUser(UserExtend user) throws Exception;

	// 测试，根据用户id查询用户信息，这里应该用User的扩展类型来接收
	public User findUserById(String id) throws Exception;

	// 更新用户信息
	public int updateUserinfo(User newUser) throws Exception;
}
