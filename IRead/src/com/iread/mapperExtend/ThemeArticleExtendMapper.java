package com.iread.mapperExtend;

import java.util.List;

import com.iread.pojo.ThemeArticle;

public interface ThemeArticleExtendMapper {

	public List<ThemeArticle> selectByFkWithLimt(String themeId);

}
