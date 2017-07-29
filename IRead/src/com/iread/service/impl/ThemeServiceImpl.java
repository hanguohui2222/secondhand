package com.iread.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iread.mapper.ThemeMapper;
import com.iread.mapperExtend.ThemeExtendMapper;
import com.iread.pojo.Theme;
import com.iread.pojo.ThemeWithBLOBs;
import com.iread.pojoExtend.RecommendCustom;
import com.iread.pojoExtend.ThemeCustom;
import com.iread.service.ThemeService;

public class ThemeServiceImpl implements ThemeService {

	// 扫描，自动注入themeMapper
	@Autowired
	private ThemeMapper themeMapper;

	@Autowired
	private ThemeExtendMapper themeExtendMapper;

	@Override
	public void saveTheme(ThemeWithBLOBs theme) throws Exception {

		theme.setId(UUID.randomUUID().toString());
		theme.setCreateTime(new Date());
		theme.setHot(0);
		themeMapper.insertSelective(theme);
	}

	@Override
	public void updateTheme(String id,ThemeWithBLOBs theme) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteThemeById(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ThemeWithBLOBs> findThemesByUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ThemeWithBLOBs findThemeById(String id) throws Exception {
		
		return themeMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo findAllByPage(int pageNum, int pageSize) throws Exception {
		
		// 调用pageHelper进行分页查询
		PageHelper.startPage(pageNum, pageSize, true);

		List<ThemeCustom> list = themeExtendMapper.findAllList();

		// 用PageInfo对结果集进行封装
		PageInfo page = new PageInfo(list);

		return page;
	}

	@Override
	public PageInfo findOrdersByPage(int pageNum, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
