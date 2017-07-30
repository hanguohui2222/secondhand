package com.iread.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iread.pojo.User;
import com.iread.pojoExtend.UserExtend;
import com.iread.service.UserService;
import com.iread.utils.Status;

/**
 * 用户操作的controller
 * 
 * @author zjl
 *
 */
@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/user")
public class UserController {

	// 自动注入service
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/regist")
	public @ResponseBody Status regist(@RequestBody UserExtend user) throws Exception {

		System.out.println(user.getId() + "..." + user.getPassword() + "..." + user.getUsername());
		Status status = new Status();
		// 查询是否有重复用户
		User temp = userService.findUserById(user.getId());
		if (temp != null) {
			status.setStatus(Status.regiestIdIsRepeat);
		} else {
			userService.insertUser(user);
			status.setStatus(Status.regiestOK);
		}

		return status;
	}

	@RequestMapping(value = "/loginCheck")
	public @ResponseBody Status loginCheck(String id, String password) throws Exception {
		// public @ResponseBody Status loginCheck(String id, String password, String
		// username) throws Exception {

		System.out.println(id + "..." + password);
		Status status = new Status();
		if (id != null) {
			User user = userService.findUserById(id);
			// 用户是否存在
			if (user != null) {
				// 验证密码
				if (user.getPassword().equals(password)) {
					status.setStatus(status.loginOK);
				} else {
					status.setStatus(status.loginPwdError);
				}
			} else {
				status.setStatus(status.loginIdError);
			}
		}
		return status;
	}

	@RequestMapping(value = "/loginCheckByJson")
	public @ResponseBody Status loginCheckByJson(@RequestBody UserExtend user) throws Exception {

		System.out.println(user.getId() + "..." + user.getPassword());
		Status status = new Status();
		/*
		 * if (extend != null && extend.getId() != null) { User user =
		 * userService.findUserById(extend.getId()); //用户是否存在 if (user != null) { //验证密码
		 * if (user.getPassword().equals(extend.getPassword())) { status.status =
		 * status.loginOK; } else { status.status = status.loginPwdError; } } else {
		 * status.status = status.loginIdError; } }
		 */
		return status;
	}
}
