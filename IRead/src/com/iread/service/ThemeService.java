package com.iread.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.iread.pojo.Theme;
import com.iread.pojo.ThemeWithBLOBs;

public interface ThemeService {

	// 保存推荐信息
	public void saveTheme(ThemeWithBLOBs theme) throws Exception;

	// 更新推荐信息
	public void updateTheme(String id, ThemeWithBLOBs theme) throws Exception;

	// 删除推荐信息
	public void deleteThemeById(String id) throws Exception;

	// 分页查询推荐信息
	public PageInfo findAllByPage(int pageNum, int pageSize) throws Exception;

	// 分页查询推荐信息
	public PageInfo findOrdersByPage(int pageNum, int pageSize) throws Exception;

	// 查询用户发布的推荐
	public List<ThemeWithBLOBs> findThemesByUser(String userId) throws Exception;

	// 根据id查询推荐信息
	public ThemeWithBLOBs findThemeById(String id) throws Exception;

}
