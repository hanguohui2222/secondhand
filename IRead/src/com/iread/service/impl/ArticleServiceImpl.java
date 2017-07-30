package com.iread.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iread.mapper.ArticleMapper;
import com.iread.mapper.RecommendMapper;
import com.iread.mapperExtend.ArticleExtendMapper;
import com.iread.pojo.Article;
import com.iread.pojo.ArticleExample;
import com.iread.pojo.Recommend;
import com.iread.pojoExtend.ArticleCustom;
import com.iread.pojoExtend.ArticleExtend;
import com.iread.pojoExtend.RecommendCustom;
import com.iread.service.ArticleService;
import com.iread.utils.HtmlToCodeUtil;

public class ArticleServiceImpl implements ArticleService {

	// 扫描，自动注入usermapper
	@Autowired
	private ArticleMapper articleMapper;

	@Autowired
	private ArticleExtendMapper articleExtendMapper;

	@Override
	public String saveArticle(ArticleExtend article) throws Exception {

		String contentStr = HtmlToCodeUtil.codeToHtml(article.getContent());
		Article record = new Article();
		// 将RecommendExtend中的属性拷贝到Recommend类型的变量中
		BeanUtils.copyProperties(article, record);
		article.setContent(contentStr);
		record.setId(UUID.randomUUID().toString());
		record.setUserId(article.getUserId());
		record.setCreateTime(new Date());
		articleMapper.insert(record);
		return record.getId();
	}

	@Override
	public void update(String articleId, Article article) throws Exception {
		article.setId(articleId);
		articleMapper.updateByPrimaryKeySelective(article);
	}

	@Override
	public PageInfo findArticlesByPage(int pageNum, int pageSize) throws Exception {
		// 调用pageHelper进行分页查询
		// 获取第pageNum页，pageSize条内容，true查询总数count
		PageHelper.startPage(pageNum, pageSize, true);

		List<ArticleCustom> list = articleExtendMapper.findArticleList();
		for (ArticleCustom article : list) {
			String contentHtml = HtmlToCodeUtil.codeToHtml(article.getContent());
			article.setContent(contentHtml);
		}
		// 用PageInfo对结果集进行封装
		PageInfo page = new PageInfo(list);

		return page;
	}

	// 根据id查询文章内容(大文本字段)
	@Override
	public Article findArticleByIdWithBlob(String articleId) throws Exception {
		Article record = articleMapper.selectByPrimaryKey(articleId);

		// 获取查询出的content和id字段
		Article article = new Article();
		article.setId(record.getId());
		article.setContent(HtmlToCodeUtil.codeToHtml(record.getContent()));
		return article;
	}

	// 根据id查询文章
	@Override
	public Article findArticleById(String articleId) throws Exception {
		if (articleId == null)
			return null;
		return articleMapper.selectByPrimaryKey(articleId);
	}

}
