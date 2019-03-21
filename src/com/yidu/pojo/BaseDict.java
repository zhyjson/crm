package com.yidu.pojo;

import java.io.Serializable;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-03-12
 */
public class BaseDict implements Serializable {
    /**
     * 数据字典id(主键)
     */
    private String dictId;

    /**
     * 数据字典类别代码
     */
    private String dictTypeCode;

    /**
     * 数据字典类别名称
     */
    private String dictTypeName;

    /**
     * 数据字典项目名称
     */
    private String dictItemName;

    /**
     * 数据字典项目代码(可为空)
     */
    private String dictItemCode;

    /**
     * 排序字段
     */
    private Integer dictSort;

    /**
     * 1:使用 0:停用
     */
    private String dictEnable;

    /**
     * 备注
     */
    private String dictMemo;

    private static final long serialVersionUID = 1L;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId == null ? null : dictId.trim();
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode == null ? null : dictTypeCode.trim();
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName == null ? null : dictTypeName.trim();
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName == null ? null : dictItemName.trim();
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode == null ? null : dictItemCode.trim();
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable == null ? null : dictEnable.trim();
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo == null ? null : dictMemo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictId=").append(dictId);
        sb.append(", dictTypeCode=").append(dictTypeCode);
        sb.append(", dictTypeName=").append(dictTypeName);
        sb.append(", dictItemName=").append(dictItemName);
        sb.append(", dictItemCode=").append(dictItemCode);
        sb.append(", dictSort=").append(dictSort);
        sb.append(", dictEnable=").append(dictEnable);
        sb.append(", dictMemo=").append(dictMemo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}