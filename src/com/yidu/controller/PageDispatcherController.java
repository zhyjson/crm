package com.yidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yidu.service.BaseDictService;
/**
 * 
* <p>Title: PageDispatcherController</p>  
* <p>Description: 负责转发子页面模块</p>  
* @author zhy  
* @date 2019年3月11日
 */
@Controller
public class PageDispatcherController {
	@Autowired
	BaseDictService baseDictService;
	
	@Value("${baseDict.custSourceDictTypeCode}")
	private String custSourceDictTypeCode;
	
	@Value("${baseDict.custIndustryDictTypeCode}")
	private String custIndustryDictTypeCode;
	
	@Value("${baseDict.custLevelDictTypeCode}")
	private String custLevelDictTypeCode;
	/**
	 * 
	 * <p>Title: getCustomerManagerment</p>  
	 * <p>Description: 客户管理页面</p>  
	 * @return
	 */
	@RequestMapping("/CustomerManagerment")
	public String getCustomerManagerment(Model model) {
		model.addAttribute("custSourceBaseDictList", baseDictService.selectBydictTypeCode(custSourceDictTypeCode));
		model.addAttribute("custIndustryBaseDictList", baseDictService.selectBydictTypeCode(custIndustryDictTypeCode));
		model.addAttribute("custLevelBaseDictList", baseDictService.selectBydictTypeCode(custLevelDictTypeCode));
		return "customerManagerment";
	}

}
