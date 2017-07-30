package com.iread.pojoExtend;

import java.util.Date;

import com.iread.pojo.Theme;
import com.iread.pojo.ThemeArticle;

public class ThemeCustom extends Theme {

	private ThemeArticle lastArticle;

	public ThemeArticle getLastArticle() {
		return lastArticle;
	}

	public void setLastArticle(ThemeArticle lastArticle) {
		this.lastArticle = lastArticle;
	}

}
