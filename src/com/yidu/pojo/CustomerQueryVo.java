package com.yidu.pojo;

import java.io.Serializable;

public class CustomerQueryVo implements Serializable{
	/** serialVersionUID*/  
	private static final long serialVersionUID = 1L;
	/**
	 * 客户名称
	 */
	private String custName;
	/**
	 * 客户来源
	 */
	private Integer custSource;
	/**
	 * 所属行业
	 */
	private Integer custIndustry;
	/**
	 * 客户级别
	 */
	private Integer custLevel;
	/**
	 * 页码
	 */
	private Integer offset;
	/**
	 * 页面大小
	 */
	private Integer limit;
	
	public CustomerQueryVo(String custName, Integer custSource, Integer custIndustry, Integer custLevel, Integer offset,
			Integer limit) {
		this.custName = custName;
		this.custSource = custSource;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.offset = offset;
		this.limit = limit;
	}
	public CustomerQueryVo() {}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Integer getCustSource() {
		return custSource;
	}
	public void setCustSource(Integer custSource) {
		this.custSource = custSource;
	}
	public Integer getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(Integer custIndustry) {
		this.custIndustry = custIndustry;
	}
	public Integer getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(Integer custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "CustomerQueryVo [custName=" + custName + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", offset=" + offset + ", limit=" + limit + "]";
	}
}
