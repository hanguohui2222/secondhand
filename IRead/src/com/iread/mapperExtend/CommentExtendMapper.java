package com.iread.mapperExtend;

import java.util.List;

import com.iread.pojoExtend.CommentCustom;

/**
 * 评论内容复杂查询映射
 * @author zjl
 *
 */
public interface CommentExtendMapper {

	//根据外键查询评论列表
	public List<CommentCustom> findCommentsByFK(String subjet);
}
