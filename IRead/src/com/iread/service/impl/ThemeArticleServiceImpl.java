package com.iread.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iread.mapperExtend.ThemeArticleExtendMapper;
import com.iread.pojo.ThemeArticle;
import com.iread.service.ThemeArticleService;

public class ThemeArticleServiceImpl implements ThemeArticleService {

	@Autowired
	ThemeArticleExtendMapper tArticleMapper;

	@Override
	public List<ThemeArticle> findLastUpdate(String themeId) throws Exception {
		List<ThemeArticle> list = tArticleMapper.selectByFkWithLimt(themeId);
		for (ThemeArticle article : list) {
			String content = article.getContent().length() > 30 ? article.getContent().substring(0, 31)
					: article.getContent();
			article.setContent(content);
		}
		return list;
	}

}
