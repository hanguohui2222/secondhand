package com.iread.pojoExtend;

import java.util.List;

import com.iread.pojo.Article;
import com.iread.pojo.User;

public class ArticleCustom extends Article {

	// 用户信息
	private User user;

	// 评论列表
	private List<CommentCustom> commentList;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CommentCustom> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentCustom> commentList) {
		this.commentList = commentList;
	}


}
