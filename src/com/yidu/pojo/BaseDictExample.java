package com.yidu.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaseDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BaseDictExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2019-03-12
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDictIdIsNull() {
            addCriterion("dict_id is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(String value) {
            addCriterion("dict_id =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(String value) {
            addCriterion("dict_id <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(String value) {
            addCriterion("dict_id >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_id >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(String value) {
            addCriterion("dict_id <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(String value) {
            addCriterion("dict_id <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLike(String value) {
            addCriterion("dict_id like", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotLike(String value) {
            addCriterion("dict_id not like", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<String> values) {
            addCriterion("dict_id in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<String> values) {
            addCriterion("dict_id not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(String value1, String value2) {
            addCriterion("dict_id between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(String value1, String value2) {
            addCriterion("dict_id not between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeIsNull() {
            addCriterion("dict_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeIsNotNull() {
            addCriterion("dict_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeEqualTo(String value) {
            addCriterion("dict_type_code =", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeNotEqualTo(String value) {
            addCriterion("dict_type_code <>", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeGreaterThan(String value) {
            addCriterion("dict_type_code >", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_code >=", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeLessThan(String value) {
            addCriterion("dict_type_code <", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_type_code <=", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeLike(String value) {
            addCriterion("dict_type_code like", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeNotLike(String value) {
            addCriterion("dict_type_code not like", value, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeIn(List<String> values) {
            addCriterion("dict_type_code in", values, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeNotIn(List<String> values) {
            addCriterion("dict_type_code not in", values, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeBetween(String value1, String value2) {
            addCriterion("dict_type_code between", value1, value2, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeCodeNotBetween(String value1, String value2) {
            addCriterion("dict_type_code not between", value1, value2, "dictTypeCode");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameIsNull() {
            addCriterion("dict_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameIsNotNull() {
            addCriterion("dict_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameEqualTo(String value) {
            addCriterion("dict_type_name =", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameNotEqualTo(String value) {
            addCriterion("dict_type_name <>", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameGreaterThan(String value) {
            addCriterion("dict_type_name >", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_name >=", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameLessThan(String value) {
            addCriterion("dict_type_name <", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameLessThanOrEqualTo(String value) {
            addCriterion("dict_type_name <=", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameLike(String value) {
            addCriterion("dict_type_name like", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameNotLike(String value) {
            addCriterion("dict_type_name not like", value, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameIn(List<String> values) {
            addCriterion("dict_type_name in", values, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameNotIn(List<String> values) {
            addCriterion("dict_type_name not in", values, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameBetween(String value1, String value2) {
            addCriterion("dict_type_name between", value1, value2, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictTypeNameNotBetween(String value1, String value2) {
            addCriterion("dict_type_name not between", value1, value2, "dictTypeName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameIsNull() {
            addCriterion("dict_item_name is null");
            return (Criteria) this;
        }

        public Criteria andDictItemNameIsNotNull() {
            addCriterion("dict_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemNameEqualTo(String value) {
            addCriterion("dict_item_name =", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameNotEqualTo(String value) {
            addCriterion("dict_item_name <>", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameGreaterThan(String value) {
            addCriterion("dict_item_name >", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_name >=", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameLessThan(String value) {
            addCriterion("dict_item_name <", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameLessThanOrEqualTo(String value) {
            addCriterion("dict_item_name <=", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameLike(String value) {
            addCriterion("dict_item_name like", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameNotLike(String value) {
            addCriterion("dict_item_name not like", value, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameIn(List<String> values) {
            addCriterion("dict_item_name in", values, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameNotIn(List<String> values) {
            addCriterion("dict_item_name not in", values, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameBetween(String value1, String value2) {
            addCriterion("dict_item_name between", value1, value2, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemNameNotBetween(String value1, String value2) {
            addCriterion("dict_item_name not between", value1, value2, "dictItemName");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeIsNull() {
            addCriterion("dict_item_code is null");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeIsNotNull() {
            addCriterion("dict_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeEqualTo(String value) {
            addCriterion("dict_item_code =", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeNotEqualTo(String value) {
            addCriterion("dict_item_code <>", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeGreaterThan(String value) {
            addCriterion("dict_item_code >", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_code >=", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeLessThan(String value) {
            addCriterion("dict_item_code <", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_item_code <=", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeLike(String value) {
            addCriterion("dict_item_code like", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeNotLike(String value) {
            addCriterion("dict_item_code not like", value, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeIn(List<String> values) {
            addCriterion("dict_item_code in", values, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeNotIn(List<String> values) {
            addCriterion("dict_item_code not in", values, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeBetween(String value1, String value2) {
            addCriterion("dict_item_code between", value1, value2, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictItemCodeNotBetween(String value1, String value2) {
            addCriterion("dict_item_code not between", value1, value2, "dictItemCode");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNull() {
            addCriterion("dict_sort is null");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNotNull() {
            addCriterion("dict_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDictSortEqualTo(Integer value) {
            addCriterion("dict_sort =", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotEqualTo(Integer value) {
            addCriterion("dict_sort <>", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThan(Integer value) {
            addCriterion("dict_sort >", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_sort >=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThan(Integer value) {
            addCriterion("dict_sort <", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThanOrEqualTo(Integer value) {
            addCriterion("dict_sort <=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortIn(List<Integer> values) {
            addCriterion("dict_sort in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotIn(List<Integer> values) {
            addCriterion("dict_sort not in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortBetween(Integer value1, Integer value2) {
            addCriterion("dict_sort between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_sort not between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictEnableIsNull() {
            addCriterion("dict_enable is null");
            return (Criteria) this;
        }

        public Criteria andDictEnableIsNotNull() {
            addCriterion("dict_enable is not null");
            return (Criteria) this;
        }

        public Criteria andDictEnableEqualTo(String value) {
            addCriterion("dict_enable =", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableNotEqualTo(String value) {
            addCriterion("dict_enable <>", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableGreaterThan(String value) {
            addCriterion("dict_enable >", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableGreaterThanOrEqualTo(String value) {
            addCriterion("dict_enable >=", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableLessThan(String value) {
            addCriterion("dict_enable <", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableLessThanOrEqualTo(String value) {
            addCriterion("dict_enable <=", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableLike(String value) {
            addCriterion("dict_enable like", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableNotLike(String value) {
            addCriterion("dict_enable not like", value, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableIn(List<String> values) {
            addCriterion("dict_enable in", values, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableNotIn(List<String> values) {
            addCriterion("dict_enable not in", values, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableBetween(String value1, String value2) {
            addCriterion("dict_enable between", value1, value2, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictEnableNotBetween(String value1, String value2) {
            addCriterion("dict_enable not between", value1, value2, "dictEnable");
            return (Criteria) this;
        }

        public Criteria andDictMemoIsNull() {
            addCriterion("dict_memo is null");
            return (Criteria) this;
        }

        public Criteria andDictMemoIsNotNull() {
            addCriterion("dict_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDictMemoEqualTo(String value) {
            addCriterion("dict_memo =", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoNotEqualTo(String value) {
            addCriterion("dict_memo <>", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoGreaterThan(String value) {
            addCriterion("dict_memo >", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoGreaterThanOrEqualTo(String value) {
            addCriterion("dict_memo >=", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoLessThan(String value) {
            addCriterion("dict_memo <", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoLessThanOrEqualTo(String value) {
            addCriterion("dict_memo <=", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoLike(String value) {
            addCriterion("dict_memo like", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoNotLike(String value) {
            addCriterion("dict_memo not like", value, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoIn(List<String> values) {
            addCriterion("dict_memo in", values, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoNotIn(List<String> values) {
            addCriterion("dict_memo not in", values, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoBetween(String value1, String value2) {
            addCriterion("dict_memo between", value1, value2, "dictMemo");
            return (Criteria) this;
        }

        public Criteria andDictMemoNotBetween(String value1, String value2) {
            addCriterion("dict_memo not between", value1, value2, "dictMemo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2019-03-12
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}