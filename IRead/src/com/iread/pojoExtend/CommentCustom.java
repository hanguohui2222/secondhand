package com.iread.pojoExtend;

import com.iread.pojo.Comment;
import com.iread.pojo.User;

/**
 * 评论数据扩展类
 * @author zjl
 *
 */
public class CommentCustom extends Comment{

	//评论者
	private User user;
	
	//父评论
	private Comment pComment;
	
	//父评论作者
	private User pUser;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment getPComment() {
		return pComment;
	}

	public void setPComment(Comment pComment) {
		this.pComment = pComment;
	}

	public User getPUser() {
		return pUser;
	}

	public void setPUser(User pUser) {
		this.pUser = pUser;
	}
	
}
