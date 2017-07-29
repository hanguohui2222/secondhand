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
import com.iread.pojo.Theme;
import com.iread.pojo.ThemeWithBLOBs;
import com.iread.service.ThemeService;
import com.iread.utils.FileUitil;
import com.iread.utils.Status;

/**
 * 专栏的相关操作
 * 
 * @author zjl
 * 
 */
@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/theme")
public class ThemeController {

	// 自动注入service
	@Autowired
	private ThemeService themeService;

	// 接收带文件的推荐数据
	@RequestMapping(value = "/publihThemeWithImg")
	public @ResponseBody
	Status publihThemeWithImg(ThemeWithBLOBs theme, MultipartFile file)
			throws Exception {

		// 设置theme的路径，默认为空
		theme.setThemeImg(null);
		// 上传图片
		if (file != null && file.getOriginalFilename() != null
				&& file.getOriginalFilename().length() > 0) {

			// 存储图片的物理路径
			String pic_path = "F:\\develop\\upload\\temp\\";

			// 取出图片原始名称
			// String originalFimeName = file.getOriginalFilename();
			// 根据文件内容获取文件类型
			String type = FileUitil.checkType(file.getContentType(),
					file.getInputStream());

			// 新的图片名称
			String newFileName = UUID.randomUUID() + "." + type;

			// 新的图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			file.transferTo(newFile);

			// 文件上传成功，将新路径写入数据库,客户端访问时，IP地址:8080/pic/文件名
			theme.setThemeImg(newFileName);
		}
		// 调用service保存数据库到数据库
		themeService.saveTheme(theme);
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}

	// 接收专栏数据,不带文件
	@RequestMapping(value = "/publishTheme")
	public @ResponseBody
	Status publishTheme(@RequestBody ThemeWithBLOBs theme)
			throws Exception {

		System.out.println("publishTheme");
		// 调用service保存数据库到数据库
		themeService.saveTheme(theme); 
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}
	
	/**
	 * 分页查询推荐数据
	 * @param pageSize
	 * @param offset
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/findAllList")
	public @ResponseBody
	PageInfo findAllList(Integer pageNum, Integer pageSize) throws Exception {
		
		return themeService.findAllByPage(pageNum, pageSize);
	}
	
	/**
	 * 获取专栏详情
	 * @param articleId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getThemeDetail")
	public @ResponseBody
	ThemeWithBLOBs getThemeDetail(String themeId) throws Exception {
		
		return themeService.findThemeById(themeId);
	}
	
}
