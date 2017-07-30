package com.iread.service;

import java.util.List;

import com.iread.pojoExtend.CommentCustom;
import com.iread.pojoExtend.CommentExtend;

public interface CommentService {

	// 根据外键查询评论列表
	public List<CommentCustom> findCommentsBySubjectId(String subjectId) throws Exception;

	// 添加评论
	public void insertComment(CommentExtend extend) throws Exception;
}
