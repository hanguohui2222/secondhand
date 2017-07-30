package com.iread.pojoExtend;

public class ThemeExtend {

	private String id;

	private String userId;

	private String title;

	private String subtitle;

	private String suitSb;

	private String themeImg;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSuitSb() {
		return suitSb;
	}

	public void setSuitSb(String suitSb) {
		this.suitSb = suitSb;
	}

	public String getThemeImg() {
		return themeImg;
	}

	public void setThemeImg(String themeImg) {
		this.themeImg = themeImg;
	}

}
