package com.iread.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.iread.mapper.CommentMapper;
import com.iread.mapper.RecommendMapper;
import com.iread.mapperExtend.CommentExtendMapper;
import com.iread.pojo.Comment;
import com.iread.pojoExtend.CommentCustom;
import com.iread.pojoExtend.CommentExtend;
import com.iread.service.CommentService;

public class CommentServiceImpl implements CommentService {

	// 扫描，自动注入usermapper
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private CommentExtendMapper extendMapper;

	@Override
	public List<CommentCustom> findCommentsBySubjectId(String subjectId)
			throws Exception {
		List<CommentCustom> list = extendMapper.findCommentsByFK(subjectId);
		return list;
	}

	@Override
	public void insertComment(CommentExtend extend) throws Exception {
		
		Comment record = new Comment();
		BeanUtils.copyProperties(extend, record);
		record.setCreateTime(new Date());
		record.setIsReplay(true);
		record.setId(UUID.randomUUID().toString());
		record.setIsVisible(true);
		//调用mapper添加评论信息
		commentMapper.insert(record);
	}
	
	

}
