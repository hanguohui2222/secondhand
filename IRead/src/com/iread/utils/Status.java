package com.iread.utils;

/**
 * 返回状态
 * 
 * @author zjl
 *
 */
public class Status {
	private int status;

	private String errorMessage;

	public static final int ok = 1;// 操作成功
	public static final int fail = 0;// 操作失败

	public static final int loginOK = 1;// 登录成功
	public static final int loginPwdError = 0;// 登录密码错误
	public static final int loginIdError = -1;// 不存在此用户

	public static final int regiestIdIsRepeat = 0;
	public static final int regiestOK = 1;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
