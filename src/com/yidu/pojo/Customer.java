package com.yidu.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-03-12
 */
public class Customer implements Serializable {
    /**
     * 客户编号(主键)
     */
    private Integer custId;

    /**
     * 客户名称(公司名称)
     */
    private String custName;

    /**
     * 负责人id
     */
    private Integer custUserId;

    /**
     * 创建人id
     */
    private Integer custCreateId;

    /**
     * 客户信息来源
     */
    private Integer custSource;

    /**
     * 客户所属行业
     */
    private Integer custIndustry;

    /**
     * 客户级别
     */
    private Integer custLevel;

    /**
     * 联系人
     */
    private String custLinkman;

    /**
     * 固定电话
     */
    private String custPhone;

    /**
     * 移动电话
     */
    private String custMobile;

    /**
     * 邮政编码
     */
    private String custZipcode;

    /**
     * 联系地址
     */
    private String custAddress;

    /**
     * 创建时间
     */
    private Date custCreatetime;

    private static final long serialVersionUID = 1L;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public Integer getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Integer custUserId) {
        this.custUserId = custUserId;
    }

    public Integer getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Integer custCreateId) {
        this.custCreateId = custCreateId;
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

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman == null ? null : custLinkman.trim();
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile == null ? null : custMobile.trim();
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode == null ? null : custZipcode.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public Date getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(Date custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custUserId=").append(custUserId);
        sb.append(", custCreateId=").append(custCreateId);
        sb.append(", custSource=").append(custSource);
        sb.append(", custIndustry=").append(custIndustry);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custLinkman=").append(custLinkman);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", custMobile=").append(custMobile);
        sb.append(", custZipcode=").append(custZipcode);
        sb.append(", custAddress=").append(custAddress);
        sb.append(", custCreatetime=").append(custCreatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}