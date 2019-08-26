package com.wb.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderBeginIsNull() {
            addCriterion("order_begin is null");
            return (Criteria) this;
        }

        public Criteria andOrderBeginIsNotNull() {
            addCriterion("order_begin is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBeginEqualTo(Date value) {
            addCriterionForJDBCDate("order_begin =", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_begin <>", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("order_begin >", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_begin >=", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginLessThan(Date value) {
            addCriterionForJDBCDate("order_begin <", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_begin <=", value, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginIn(List<Date> values) {
            addCriterionForJDBCDate("order_begin in", values, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_begin not in", values, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_begin between", value1, value2, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_begin not between", value1, value2, "orderBegin");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNull() {
            addCriterion("order_end is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNotNull() {
            addCriterion("order_end is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndEqualTo(Date value) {
            addCriterionForJDBCDate("order_end =", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_end <>", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThan(Date value) {
            addCriterionForJDBCDate("order_end >", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_end >=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThan(Date value) {
            addCriterionForJDBCDate("order_end <", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_end <=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndIn(List<Date> values) {
            addCriterionForJDBCDate("order_end in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_end not in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_end between", value1, value2, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_end not between", value1, value2, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andAdultNumberIsNull() {
            addCriterion("adult_number is null");
            return (Criteria) this;
        }

        public Criteria andAdultNumberIsNotNull() {
            addCriterion("adult_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdultNumberEqualTo(Integer value) {
            addCriterion("adult_number =", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberNotEqualTo(Integer value) {
            addCriterion("adult_number <>", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberGreaterThan(Integer value) {
            addCriterion("adult_number >", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("adult_number >=", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberLessThan(Integer value) {
            addCriterion("adult_number <", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberLessThanOrEqualTo(Integer value) {
            addCriterion("adult_number <=", value, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberIn(List<Integer> values) {
            addCriterion("adult_number in", values, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberNotIn(List<Integer> values) {
            addCriterion("adult_number not in", values, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberBetween(Integer value1, Integer value2) {
            addCriterion("adult_number between", value1, value2, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andAdultNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("adult_number not between", value1, value2, "adultNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberIsNull() {
            addCriterion("child_number is null");
            return (Criteria) this;
        }

        public Criteria andChildNumberIsNotNull() {
            addCriterion("child_number is not null");
            return (Criteria) this;
        }

        public Criteria andChildNumberEqualTo(Integer value) {
            addCriterion("child_number =", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberNotEqualTo(Integer value) {
            addCriterion("child_number <>", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberGreaterThan(Integer value) {
            addCriterion("child_number >", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_number >=", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberLessThan(Integer value) {
            addCriterion("child_number <", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberLessThanOrEqualTo(Integer value) {
            addCriterion("child_number <=", value, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberIn(List<Integer> values) {
            addCriterion("child_number in", values, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberNotIn(List<Integer> values) {
            addCriterion("child_number not in", values, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberBetween(Integer value1, Integer value2) {
            addCriterion("child_number between", value1, value2, "childNumber");
            return (Criteria) this;
        }

        public Criteria andChildNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("child_number not between", value1, value2, "childNumber");
            return (Criteria) this;
        }

        public Criteria andOrderCityIsNull() {
            addCriterion("order_city is null");
            return (Criteria) this;
        }

        public Criteria andOrderCityIsNotNull() {
            addCriterion("order_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCityEqualTo(String value) {
            addCriterion("order_city =", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotEqualTo(String value) {
            addCriterion("order_city <>", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityGreaterThan(String value) {
            addCriterion("order_city >", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityGreaterThanOrEqualTo(String value) {
            addCriterion("order_city >=", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLessThan(String value) {
            addCriterion("order_city <", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLessThanOrEqualTo(String value) {
            addCriterion("order_city <=", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLike(String value) {
            addCriterion("order_city like", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotLike(String value) {
            addCriterion("order_city not like", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityIn(List<String> values) {
            addCriterion("order_city in", values, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotIn(List<String> values) {
            addCriterion("order_city not in", values, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityBetween(String value1, String value2) {
            addCriterion("order_city between", value1, value2, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotBetween(String value1, String value2) {
            addCriterion("order_city not between", value1, value2, "orderCity");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(Integer value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(Integer value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(Integer value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(Integer value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<Integer> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<Integer> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(Integer value1, Integer value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
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