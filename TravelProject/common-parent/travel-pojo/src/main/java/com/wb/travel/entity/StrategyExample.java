package com.wb.travel.entity;

import java.util.ArrayList;
import java.util.List;

public class StrategyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StrategyExample() {
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

        public Criteria andStrategyIdIsNull() {
            addCriterion("strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdEqualTo(Integer value) {
            addCriterion("strategy_id =", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotEqualTo(Integer value) {
            addCriterion("strategy_id <>", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThan(Integer value) {
            addCriterion("strategy_id >", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("strategy_id >=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThan(Integer value) {
            addCriterion("strategy_id <", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("strategy_id <=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIn(List<Integer> values) {
            addCriterion("strategy_id in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotIn(List<Integer> values) {
            addCriterion("strategy_id not in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id not between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleIsNull() {
            addCriterion("strategy_title is null");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleIsNotNull() {
            addCriterion("strategy_title is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleEqualTo(String value) {
            addCriterion("strategy_title =", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleNotEqualTo(String value) {
            addCriterion("strategy_title <>", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleGreaterThan(String value) {
            addCriterion("strategy_title >", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_title >=", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleLessThan(String value) {
            addCriterion("strategy_title <", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleLessThanOrEqualTo(String value) {
            addCriterion("strategy_title <=", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleLike(String value) {
            addCriterion("strategy_title like", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleNotLike(String value) {
            addCriterion("strategy_title not like", value, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleIn(List<String> values) {
            addCriterion("strategy_title in", values, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleNotIn(List<String> values) {
            addCriterion("strategy_title not in", values, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleBetween(String value1, String value2) {
            addCriterion("strategy_title between", value1, value2, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTitleNotBetween(String value1, String value2) {
            addCriterion("strategy_title not between", value1, value2, "strategyTitle");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIsNull() {
            addCriterion("strategy_type is null");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIsNotNull() {
            addCriterion("strategy_type is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeEqualTo(String value) {
            addCriterion("strategy_type =", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotEqualTo(String value) {
            addCriterion("strategy_type <>", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeGreaterThan(String value) {
            addCriterion("strategy_type >", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_type >=", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLessThan(String value) {
            addCriterion("strategy_type <", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLessThanOrEqualTo(String value) {
            addCriterion("strategy_type <=", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeLike(String value) {
            addCriterion("strategy_type like", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotLike(String value) {
            addCriterion("strategy_type not like", value, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeIn(List<String> values) {
            addCriterion("strategy_type in", values, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotIn(List<String> values) {
            addCriterion("strategy_type not in", values, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeBetween(String value1, String value2) {
            addCriterion("strategy_type between", value1, value2, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyTypeNotBetween(String value1, String value2) {
            addCriterion("strategy_type not between", value1, value2, "strategyType");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressIsNull() {
            addCriterion("strategy_address is null");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressIsNotNull() {
            addCriterion("strategy_address is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressEqualTo(String value) {
            addCriterion("strategy_address =", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressNotEqualTo(String value) {
            addCriterion("strategy_address <>", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressGreaterThan(String value) {
            addCriterion("strategy_address >", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_address >=", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressLessThan(String value) {
            addCriterion("strategy_address <", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressLessThanOrEqualTo(String value) {
            addCriterion("strategy_address <=", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressLike(String value) {
            addCriterion("strategy_address like", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressNotLike(String value) {
            addCriterion("strategy_address not like", value, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressIn(List<String> values) {
            addCriterion("strategy_address in", values, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressNotIn(List<String> values) {
            addCriterion("strategy_address not in", values, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressBetween(String value1, String value2) {
            addCriterion("strategy_address between", value1, value2, "strategyAddress");
            return (Criteria) this;
        }

        public Criteria andStrategyAddressNotBetween(String value1, String value2) {
            addCriterion("strategy_address not between", value1, value2, "strategyAddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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