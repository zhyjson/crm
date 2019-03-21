package com.yidu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.mapper.BaseDictMapper;
import com.yidu.pojo.BaseDict;
import com.yidu.pojo.BaseDictExample;
import com.yidu.service.BaseDictService;
@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	BaseDictMapper baseDictMapper;
	@Override
	public List<BaseDict> selectBydictTypeCode(String dictTypeCode) {
		BaseDictExample baseDictExample = new BaseDictExample();
		baseDictExample.createCriteria().andDictTypeCodeEqualTo(dictTypeCode);
		return baseDictMapper.selectByExample(baseDictExample);
	}

}
