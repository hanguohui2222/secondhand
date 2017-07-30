package com.iread.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.iread.pojoExtend.CommentCustom;
import com.iread.pojoExtend.CommentExtend;
import com.iread.service.CommentService;
import com.iread.utils.Status;

/**
 * 评论的相关操作controller
 * 
 * @author zjl
 * 
 */
@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/comment")
public class CommentController {

	// 自动注入service
	@Autowired
	private CommentService commentService;

	@RequestMapping(value = "/findCommentList")
	public @ResponseBody List<CommentCustom> findCommentList(Integer type, String subjectId) throws Exception {

		// 调用service查询对应的评论数据，以及评论对应的用户
		return commentService.findCommentsBySubjectId(subjectId);
	}

	@RequestMapping(value = "/publishComment")
	public @ResponseBody Status publishComment(@RequestBody CommentExtend comment) throws Exception {

		// 调用service查询对应的评论数据，以及评论对应的用户
		commentService.insertComment(comment);
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}
}
