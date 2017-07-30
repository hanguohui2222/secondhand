package com.iread.service;

import com.github.pagehelper.PageInfo;
import com.iread.pojo.Article;
import com.iread.pojoExtend.ArticleExtend;

public interface ArticleService {

	public String saveArticle(ArticleExtend article) throws Exception;

	public void update(String articleId, Article article) throws Exception;

	// 分页查询推荐信息
	public PageInfo findArticlesByPage(int pageNum, int pageSize) throws Exception;

	// 根据id查询文章内容
	public Article findArticleByIdWithBlob(String articleId) throws Exception;

	public Article findArticleById(String articleId) throws Exception;
}
