package com.yidu.service.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yidu.pojo.Customer;
import com.yidu.pojo.CustomerQueryVo;
import com.yidu.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerServiceTest {
	@Autowired
	CustomerService customerService;
	@Test
	public void test() {
		CustomerQueryVo queryVo = new CustomerQueryVo();
		queryVo.setOffset(10);
		queryVo.setLimit(10);
		List<Customer> customerList = customerService.selectCustomerListByQueryVo(queryVo);
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
