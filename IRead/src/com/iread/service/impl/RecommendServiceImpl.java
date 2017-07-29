package com.iread.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iread.mapper.RecommendMapper;
import com.iread.mapperExtend.RecommendExtendMapper;
import com.iread.pojo.Recommend;
import com.iread.pojo.RecommendExample;
import com.iread.pojo.User;
import com.iread.pojoExtend.RecommendCustom;
import com.iread.pojoExtend.RecommendExtend;
import com.iread.service.RecommendService;

/**
 * 推荐service实现类，调用mapper进行数据库操作
 * 
 * @author zjl
 * 
 */
public class RecommendServiceImpl implements RecommendService {

	// 扫描，自动注入usermapper
	@Autowired
	private RecommendMapper rcdMapper;
	
	@Autowired
	private RecommendExtendMapper rcdExtendMapper;

	@Override
	public void saveRecommend(RecommendExtend recommend) throws Exception {
		Recommend record = new Recommend();
		//将RecommendExtend中的属性拷贝到Recommend类型的变量中
		BeanUtils.copyProperties(recommend, record);
		record.setId(UUID.randomUUID().toString());
		record.setUserId(recommend.getUserId());
		record.setCreateTime(new Date());
		rcdMapper.insert(record);
	}

	@Override
	public void updateRecommend(String id, Recommend recommend) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRecommendById(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public PageInfo findRecommendsByPage(int pageNum, int pageSize) throws Exception {
		// 调用pageHelper进行分页查询
		//获取第pageNum页，pageSize条内容，true查询总数count
		PageHelper.startPage(pageNum, pageSize, true);
		
		List<RecommendCustom> list = rcdExtendMapper.findRcdList();
		
		//用PageInfo对结果集进行封装
		PageInfo page = new PageInfo(list);
		
		return page;
	}

	@Override
	public List<Recommend> findRecommendsByUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recommend findRecommendsById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
