package com.iread.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.iread.pojo.Recommend;
import com.iread.pojo.User;
import com.iread.pojoExtend.RecommendCustom;
import com.iread.pojoExtend.RecommendExtend;

public interface RecommendService {

	//保存推荐信息
	public void saveRecommend(RecommendExtend recommend) throws Exception;
	
	//更新推荐信息
	public void updateRecommend(String id, Recommend recommend) throws Exception;
	
	//删除推荐信息
	public void deleteRecommendById(String id) throws Exception;
	
	//分页查询推荐信息
	public PageInfo findRecommendsByPage(int pageNum, int pageSize) throws Exception;
	
	//查询用户发布的推荐
	public List<Recommend> findRecommendsByUser(User user) throws Exception;
	
	//根据id查询推荐信息
	public Recommend findRecommendsById(String id) throws Exception;
	
}
