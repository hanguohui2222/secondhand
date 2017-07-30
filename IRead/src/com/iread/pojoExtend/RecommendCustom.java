package com.iread.pojoExtend;

import java.util.List;

import com.iread.pojo.Comment;
import com.iread.pojo.Recommend;
import com.iread.pojo.User;

/**
 * 推荐数据扩展类
 * 
 * @author zjl
 *
 */
public class RecommendCustom extends Recommend {

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
