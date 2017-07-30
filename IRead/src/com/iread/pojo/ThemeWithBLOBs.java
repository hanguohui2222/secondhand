package com.iread.pojo;

public class ThemeWithBLOBs extends Theme {
	private String describe;

	private String subscribeInfo;

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe == null ? null : describe.trim();
	}

	public String getSubscribeInfo() {
		return subscribeInfo;
	}

	public void setSubscribeInfo(String subscribeInfo) {
		this.subscribeInfo = subscribeInfo == null ? null : subscribeInfo.trim();
	}
}