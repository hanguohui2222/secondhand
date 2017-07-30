package com.iread.service;

import java.util.List;

import com.iread.pojo.ThemeArticle;

public interface ThemeArticleService {

	public List<ThemeArticle> findLastUpdate(String themeId) throws Exception;

}
