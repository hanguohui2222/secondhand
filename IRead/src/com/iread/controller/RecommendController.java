package com.iread.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.iread.pojo.Recommend;
import com.iread.pojoExtend.RecommendCustom;
import com.iread.pojoExtend.RecommendExtend;
import com.iread.service.RecommendService;
import com.iread.utils.FileUitil;
import com.iread.utils.Status;

/**
 * 推荐
 * 
 * @author zjl
 * 
 */
@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/recommend")
public class RecommendController {

	// 自动注入service
	@Autowired
	private RecommendService recommendService;

	// 接收带文件的推荐数据
	@RequestMapping(value = "/publihRecommendWithImg")
	public @ResponseBody Status publihRecommendWithImg(RecommendExtend recommend, MultipartFile file) throws Exception {

		// 设置recommend的路径，默认为空
		recommend.setBookImg(null);
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
			recommend.setBookImg(newFileName);
		}
		// 调用service保存数据库到数据库
		recommendService.saveRecommend(recommend);
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}

	// 接收普通推荐数据,不带文件
	@RequestMapping(value = "/publihRecommend")
	public @ResponseBody Status publihRecommend(@RequestBody RecommendExtend recommend) throws Exception {

		System.out.println("publihRecommend");
		// 调用service保存数据库到数据库
		recommendService.saveRecommend(recommend);
		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}

	/**
	 * 分页查询推荐数据
	 * 
	 * @param pageSize
	 * @param offset
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/findRcdList")
	public @ResponseBody PageInfo findRcdList(Integer pageNum, Integer pageSize) throws Exception {

		return recommendService.findRecommendsByPage(pageNum, pageSize);
	}

}
