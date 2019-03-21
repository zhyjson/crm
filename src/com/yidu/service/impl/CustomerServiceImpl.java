package com.yidu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.mapper.CustomerMapper;
import com.yidu.pojo.Customer;
import com.yidu.pojo.CustomerExample;
import com.yidu.pojo.CustomerExample.Criteria;
import com.yidu.pojo.CustomerQueryVo;
import com.yidu.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerMapper customerMapper;

	@Override
	public List<Customer> selectCustomerListByQueryVo(CustomerQueryVo custQueryVo) {
		CustomerExample customerExample = this.getCustomerExampleByQueryVo(custQueryVo);
		// 获取页码和页码大小
		Integer limit = custQueryVo.getLimit();
		Integer offset = custQueryVo.getOffset();
		if(limit != null) {
			customerExample.setLimit(limit);
			if(offset != null) {
				customerExample.setOffset(offset);
			}
		}
		return customerMapper.selectByExample(customerExample);
	}
	
	private CustomerExample getCustomerExampleByQueryVo(CustomerQueryVo custQueryVo) {
		CustomerExample customerExample = new CustomerExample();
		// CustomerExample的内部类
		Criteria criteria = customerExample.createCriteria();
		// 判断查询的时候是否使用了名字模糊查询
		if(custQueryVo.getCustName() != null && !"".equals(custQueryVo.getCustName().trim())) {
			criteria.andCustNameLike("%"+custQueryVo.getCustName()+"%");
		}
		// 判断查询的时候是否使用了客户来源
		if(custQueryVo.getCustSource() != null) {
			criteria.andCustSourceEqualTo(custQueryVo.getCustSource());
		}
		// 判断查询的时候是否使用了客户所属行业
		if(custQueryVo.getCustIndustry() != null) {
			criteria.andCustIndustryEqualTo(custQueryVo.getCustIndustry());
		}
		// 判断查询的时候是否使用了客户级别
		if(custQueryVo.getCustLevel() != null) {
			criteria.andCustLevelEqualTo(custQueryVo.getCustLevel());
		}
		return customerExample;
	}
	@Override
	public boolean updateCustomerByCustId(Customer customer) {
		int num =  customerMapper.updateByPrimaryKeySelective(customer);
		if(num >= 1) {
			return true;
		}
		return false;
	}

	@Override
	public Integer SelectCount(CustomerQueryVo custQueryVo) {
		return customerMapper.countByExample(this.getCustomerExampleByQueryVo(custQueryVo));
	}

	@Override
	public boolean deleteCustomerByCustId(Integer custId) {
		int num =  customerMapper.deleteByPrimaryKey(custId);
		if(num >= 1) {
			return true;
		}
		return false;
	}

}
