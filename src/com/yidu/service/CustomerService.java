package com.yidu.service;

import java.util.List;


import com.yidu.pojo.Customer;
import com.yidu.pojo.CustomerQueryVo;

public interface CustomerService {
	/**
	 * 
	 * <p>Title: selectCustomerListByQueryVo</p>  
	 * <p>Description: 通过分页数据和过滤条件查询</p>  
	 * @param custQueryVo
	 * @return
	 */
	List<Customer> selectCustomerListByQueryVo(CustomerQueryVo custQueryVo);
	/**
	 * 
	 * <p>Title: updateCustomerByCust</p>  
	 * <p>Description: 根据custId选择性修改对象</p>  
	 * @param customer
	 * @return
	 */
	boolean updateCustomerByCustId(Customer customer);
	/**
	 * 
	 * <p>Title: updateCustomerByCust</p>  
	 * <p>Description: 根据custId删除对象</p>  
	 * @param customer
	 * @return
	 */
	boolean deleteCustomerByCustId(Integer custId);
	/**
	 * 
	 * <p>Title: SelectCount</p>  
	 * <p>Description: 查询数据库内总条数</p>  
	 * @return
	 */
	Integer SelectCount(CustomerQueryVo custQueryVo);
}
