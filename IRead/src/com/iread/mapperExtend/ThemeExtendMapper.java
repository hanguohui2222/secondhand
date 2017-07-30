package com.iread.mapperExtend;

import java.util.List;

import com.iread.pojo.Theme;
import com.iread.pojoExtend.ThemeCustom;

/**
 * 专栏的复杂查询
 * 
 * @author zjl
 *
 */
public interface ThemeExtendMapper {

	public List<ThemeCustom> findAllList();

}
