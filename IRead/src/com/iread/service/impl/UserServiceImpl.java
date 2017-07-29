package com.iread.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.iread.mapper.UserMapper;
import com.iread.pojo.User;
import com.iread.pojo.UserExample;
import com.iread.pojoExtend.UserExtend;
import com.iread.service.UserService;
import com.iread.utils.Status;

/**
 * 用户service的实现类
 * @author zjl
 *
 */
public class UserServiceImpl implements UserService{

	//扫描，自动注入usermapper
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public void insertUser(UserExtend user) throws Exception {
		User newUser = new User();
		newUser.setId(user.getId());
		newUser.setPassword(user.getPassword());
		newUser.setUsername(user.getUsername());
		newUser.setRegistTime(new Date());
		newUser.setLastLoginTime(new Date());
		
		userMapper.insertSelective(newUser);
		
	}

	@Override
	public User findUserById(String id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateUserinfo(User newUser) throws Exception {
		// TODO Auto-generated method stub
		User originUser = userMapper.selectByPrimaryKey(newUser.getId());
		if (originUser != null) {
			newUser.setId(originUser.getId());
			UserExample example = new UserExample();
			return userMapper.updateByExampleSelective(newUser, example);
		}
		return -1;
	}
}
