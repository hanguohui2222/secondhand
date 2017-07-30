package com.iread.pojo;

import java.util.Date;

public class Collect extends CollectKey {
	private Integer type;

	private Date createTime;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}