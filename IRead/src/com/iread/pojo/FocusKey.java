package com.iread.pojo;

public class FocusKey {
	private String user1Id;

	private String user2Id;

	public String getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(String user1Id) {
		this.user1Id = user1Id == null ? null : user1Id.trim();
	}

	public String getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(String user2Id) {
		this.user2Id = user2Id == null ? null : user2Id.trim();
	}
}