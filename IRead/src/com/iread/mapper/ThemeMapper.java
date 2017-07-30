package com.iread.mapper;

import com.iread.pojo.Theme;
import com.iread.pojo.ThemeExample;
import com.iread.pojo.ThemeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeMapper {
	int countByExample(ThemeExample example);

	int deleteByExample(ThemeExample example);

	int deleteByPrimaryKey(String id);

	int insert(ThemeWithBLOBs record);

	int insertSelective(ThemeWithBLOBs record);

	List<ThemeWithBLOBs> selectByExampleWithBLOBs(ThemeExample example);

	List<Theme> selectByExample(ThemeExample example);

	ThemeWithBLOBs selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") ThemeWithBLOBs record, @Param("example") ThemeExample example);

	int updateByExampleWithBLOBs(@Param("record") ThemeWithBLOBs record, @Param("example") ThemeExample example);

	int updateByExample(@Param("record") Theme record, @Param("example") ThemeExample example);

	int updateByPrimaryKeySelective(ThemeWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(ThemeWithBLOBs record);

	int updateByPrimaryKey(Theme record);
}