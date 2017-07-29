package com.gionee.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gionee.dao.IUserDao;
import com.gionee.dto.User;
import com.gionee.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		return userDao.queryByPrimaryKey(userId);
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
