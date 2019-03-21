package com.yidu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.pojo.Customer;
import com.yidu.pojo.CustomerQueryVo;
import com.yidu.service.CustomerService;

/**
 * 
* <p>Title: CustomerManagerment</p>  
* <p>Description: 客户管理子模块</p>  
* @author zhy  
* @date 2019年3月11日
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	/**
	 * 
	 * <p>Title: getCustomerList</p>  
	 * <p>Description: 获取数据--> 带分页功能和条件过滤</p>
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getCustomerList(CustomerQueryVo queryVo) {
        Map<String, Object> customerPageMap = new HashMap<>();
        customerPageMap.put("rows", customerService.selectCustomerListByQueryVo(queryVo));
        customerPageMap.put("total", customerService.SelectCount(queryVo));
		return customerPageMap;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Map<String, String> updateCustomerByCustId(Customer customer) {
        Map<String, String> messageMap = new HashMap<>();
		if(customerService.updateCustomerByCustId(customer)) {
			// 返回一条message为 修改成功 ,status为 0 的json格式数据提示用户
			messageMap.put("message", "修改成功");
			messageMap.put("status", "0");
		}else {
			// 返回一条message为 修改失败 ,status为 1 的json格式数据提示用户
			messageMap.put("message", "修改失败");
			messageMap.put("status", "1");
		}
		return messageMap;
	}
	@RequestMapping(value="/{custId}",method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String, String> deleteCustomerByCustId(@PathVariable Integer custId) {
        Map<String, String> messageMap = new HashMap<>();
		if(customerService.deleteCustomerByCustId(custId)) {
			// 返回一条message为 修改成功 ,status为 0 的json格式数据提示用户
			messageMap.put("message", "删除成功");
			messageMap.put("status", "0");
		}else {
			// 返回一条message为 修改失败 ,status为 1 的json格式数据提示用户
			messageMap.put("message", "删除失败");
			messageMap.put("status", "1");
		}
		return messageMap;
	}
}
