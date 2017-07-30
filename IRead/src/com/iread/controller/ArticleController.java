package com.iread.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.iread.pojo.Article;
import com.iread.pojoExtend.ArticleExtend;
import com.iread.pojoExtend.RecommendExtend;
import com.iread.service.ArticleService;
import com.iread.service.RecommendService;
import com.iread.utils.FileUitil;
import com.iread.utils.Status;

/**
 * 文章的相关操作
 * 
 * @author zjl
 * 
 */
@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/article")
public class ArticleController {

	// 自动注入service
	@Autowired
	private ArticleService articleService;

	// 接收带文件的文章数据
	@RequestMapping(value = "/publichArticleWithImg")
	public @ResponseBody ArticleExtend publichArticleWithImg(ArticleExtend article, MultipartFile file)
			throws Exception {

		// 设置recommend的路径，默认为空
		article.setBookImgPath(null);
		// 上传图片
		if (file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length() > 0) {

			// 存储图片的物理路径
			String pic_path = "F:\\develop\\upload\\temp\\";

			// 取出图片原始名称
			// String originalFimeName = file.getOriginalFilename();
			// 根据文件内容获取文件类型
			String type = FileUitil.checkType(file.getContentType(), file.getInputStream());

			// 新的图片名称
			String newFileName = UUID.randomUUID() + "." + type;

			// 新的图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			file.transferTo(newFile);

			// 文件上传成功，将新路径写入数据库,客户端访问时，IP地址:8080/pic/文件名
			article.setBookImgPath(newFileName);
		}
		// 调用service保存数据库到数据库
		String articleId = articleService.saveArticle(article);
		article.setId(articleId);
		return article;
	}

	// 接收带文件的文章数据
	@RequestMapping(value = "/publichArticle")
	public @ResponseBody ArticleExtend publichArticle(@RequestBody ArticleExtend article) throws Exception {
		System.out.println(".............");
		// 调用service保存数据库到数据库
		String articleId = articleService.saveArticle(article);
		article.setId(articleId);
		return article;
	}

	// 接收带文件的文章数据
	@RequestMapping(value = "/uploadAutio")
	public @ResponseBody Status uploadAutio(ArticleExtend article, MultipartFile file) throws Exception {

		// 设置recommend的路径，默认为空
		article.setAudioPath(null);
		// 上传图片
		if (file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length() > 0) {

			// 存储图片的物理路径
			String pic_path = "F:\\develop\\upload\\audio\\";

			// 取出图片原始名称
			// String originalFimeName = file.getOriginalFilename();
			// 根据文件内容获取文件类型
			String type = FileUitil.checkType(file.getContentType(), file.getInputStream());

			// 新的图片名称
			String newFileName = UUID.randomUUID() + "." + type;

			// 新的图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			file.transferTo(newFile);

			// 文件上传成功，将新路径写入数据库,客户端访问时，IP地址:8080/pic/文件名
			article.setAudioPath(newFileName);
		}

		Article record = new Article();
		record.setId(article.getId());
		record.setAudioPath(article.getAudioPath());
		// 调用service保存数据库到数据库
		articleService.update(article.getId(), record);
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}

	/**
	 * 分页查询文章数据
	 * 
	 * @param pageSize
	 * @param offset
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/findArticleList")
	public @ResponseBody PageInfo findArticleList(Integer pageNum, Integer pageSize) throws Exception {

		return articleService.findArticlesByPage(pageNum, pageSize);
	}

	@RequestMapping(value = "/getArticleContent")
	public @ResponseBody Article getArticleContent(String articleId) throws Exception {

		return articleService.findArticleByIdWithBlob(articleId);
	}

	@RequestMapping(value = "/updateLookNum")
	public @ResponseBody Status updateLookNum(String articleId) throws Exception {
		Article article = articleService.findArticleById(articleId);
		Article record = new Article();
		Status status = new Status();
		record.setId(articleId);
		if (article != null) {
			int lookNum = article.getLookNum() == null ? 0 : article.getLookNum();
			record.setLookNum(lookNum + 1);
			articleService.update(articleId, record);
			status.setStatus(Status.ok);
		} else {
			status.setStatus(Status.fail);
			status.setErrorMessage("没有这条数据" + articleId);
		}
		return status;
	}
}
