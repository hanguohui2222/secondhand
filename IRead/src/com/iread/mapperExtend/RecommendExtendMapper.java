package com.iread.mapperExtend;

import java.util.List;

import com.iread.pojo.User;
import com.iread.pojoExtend.RecommendCustom;

/**
 * recommend的复杂查询
 * @author zjl
 *
 */
public interface RecommendExtendMapper {

	//获取推荐列表
	public List<RecommendCustom> findRcdList();
	
	//获取用户创建的推荐列表
	public List<RecommendCustom> selectByUser(User user);
	
}
