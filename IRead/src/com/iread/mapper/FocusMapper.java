package com.iread.mapper;

import com.iread.pojo.Focus;
import com.iread.pojo.FocusExample;
import com.iread.pojo.FocusKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FocusMapper {
	int countByExample(FocusExample example);

	int deleteByExample(FocusExample example);

	int deleteByPrimaryKey(FocusKey key);

	int insert(Focus record);

	int insertSelective(Focus record);

	List<Focus> selectByExample(FocusExample example);

	Focus selectByPrimaryKey(FocusKey key);

	int updateByExampleSelective(@Param("record") Focus record, @Param("example") FocusExample example);

	int updateByExample(@Param("record") Focus record, @Param("example") FocusExample example);

	int updateByPrimaryKeySelective(Focus record);

	int updateByPrimaryKey(Focus record);
}