package com.iread.mapper;

import com.iread.pojo.ThemeArticle;
import com.iread.pojo.ThemeArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeArticleMapper {
    int countByExample(ThemeArticleExample example);

    int deleteByExample(ThemeArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(ThemeArticle record);

    int insertSelective(ThemeArticle record);

    List<ThemeArticle> selectByExampleWithBLOBs(ThemeArticleExample example);

    List<ThemeArticle> selectByExample(ThemeArticleExample example);

    ThemeArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ThemeArticle record, @Param("example") ThemeArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") ThemeArticle record, @Param("example") ThemeArticleExample example);

    int updateByExample(@Param("record") ThemeArticle record, @Param("example") ThemeArticleExample example);

    int updateByPrimaryKeySelective(ThemeArticle record);

    int updateByPrimaryKeyWithBLOBs(ThemeArticle record);

    int updateByPrimaryKey(ThemeArticle record);
}