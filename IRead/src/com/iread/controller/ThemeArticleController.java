package com.iread.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iread.pojo.ThemeArticle;
import com.iread.service.ThemeArticleService;


@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/t_article")
public class ThemeArticleController {

	// 自动注入service
	@Autowired
	private ThemeArticleService tArticleService;
	
	@RequestMapping(value = "/getLastUpdateListByFk")
	public @ResponseBody List<ThemeArticle> getLastUpdateListByFk(String themeId) throws Exception {
		return tArticleService.findLastUpdate(themeId);
	}
}
