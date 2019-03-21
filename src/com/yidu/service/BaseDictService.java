package com.yidu.service;

import java.util.List;

import com.yidu.pojo.BaseDict;

public interface BaseDictService {
	/**
	 * 
	 * <p>Title: deleteByPrimaryKey</p>  
	 * <p>Description: 通过数据字典类别代码查询字典集合</p>  
	 * @param dictId
	 * @return
	 */
	List<BaseDict> selectBydictTypeCode(String dictTypeCode);
}
