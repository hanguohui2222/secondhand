package com.iread.mapperExtend;

import java.util.List;

import com.iread.pojoExtend.ArticleCustom;

/**
 * 文章复杂查询
 * 
 * @author zjl
 *
 */
public interface ArticleExtendMapper {

	// 获取文章列表
	public List<ArticleCustom> findArticleList();
}
