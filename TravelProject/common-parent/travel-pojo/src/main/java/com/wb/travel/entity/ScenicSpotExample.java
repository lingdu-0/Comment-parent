package com.wb.travel.entity;

import java.util.ArrayList;
import java.util.List;

public class ScenicSpotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicSpotExample() {
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

        public Criteria andScenicSpotIdIsNull() {
            addCriterion("scenic_spot_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdIsNotNull() {
            addCriterion("scenic_spot_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdEqualTo(Integer value) {
            addCriterion("scenic_spot_id =", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotEqualTo(Integer value) {
            addCriterion("scenic_spot_id <>", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdGreaterThan(Integer value) {
            addCriterion("scenic_spot_id >", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_id >=", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdLessThan(Integer value) {
            addCriterion("scenic_spot_id <", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_id <=", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdIn(List<Integer> values) {
            addCriterion("scenic_spot_id in", values, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotIn(List<Integer> values) {
            addCriterion("scenic_spot_id not in", values, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_id between", value1, value2, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_id not between", value1, value2, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIsNull() {
            addCriterion("scenic_spot_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIsNotNull() {
            addCriterion("scenic_spot_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameEqualTo(String value) {
            addCriterion("scenic_spot_name =", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotEqualTo(String value) {
            addCriterion("scenic_spot_name <>", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameGreaterThan(String value) {
            addCriterion("scenic_spot_name >", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_name >=", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLessThan(String value) {
            addCriterion("scenic_spot_name <", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_name <=", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLike(String value) {
            addCriterion("scenic_spot_name like", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotLike(String value) {
            addCriterion("scenic_spot_name not like", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIn(List<String> values) {
            addCriterion("scenic_spot_name in", values, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotIn(List<String> values) {
            addCriterion("scenic_spot_name not in", values, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameBetween(String value1, String value2) {
            addCriterion("scenic_spot_name between", value1, value2, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_name not between", value1, value2, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeIsNull() {
            addCriterion("scenic_spot_grade is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeIsNotNull() {
            addCriterion("scenic_spot_grade is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeEqualTo(Integer value) {
            addCriterion("scenic_spot_grade =", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeNotEqualTo(Integer value) {
            addCriterion("scenic_spot_grade <>", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeGreaterThan(Integer value) {
            addCriterion("scenic_spot_grade >", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_grade >=", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeLessThan(Integer value) {
            addCriterion("scenic_spot_grade <", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_grade <=", value, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeIn(List<Integer> values) {
            addCriterion("scenic_spot_grade in", values, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeNotIn(List<Integer> values) {
            addCriterion("scenic_spot_grade not in", values, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_grade between", value1, value2, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_grade not between", value1, value2, "scenicSpotGrade");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressIsNull() {
            addCriterion("scenic_spot_address is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressIsNotNull() {
            addCriterion("scenic_spot_address is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressEqualTo(String value) {
            addCriterion("scenic_spot_address =", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressNotEqualTo(String value) {
            addCriterion("scenic_spot_address <>", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressGreaterThan(String value) {
            addCriterion("scenic_spot_address >", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_address >=", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressLessThan(String value) {
            addCriterion("scenic_spot_address <", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_address <=", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressLike(String value) {
            addCriterion("scenic_spot_address like", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressNotLike(String value) {
            addCriterion("scenic_spot_address not like", value, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressIn(List<String> values) {
            addCriterion("scenic_spot_address in", values, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressNotIn(List<String> values) {
            addCriterion("scenic_spot_address not in", values, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressBetween(String value1, String value2) {
            addCriterion("scenic_spot_address between", value1, value2, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotAddressNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_address not between", value1, value2, "scenicSpotAddress");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelIsNull() {
            addCriterion("scenic_spot_tel is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelIsNotNull() {
            addCriterion("scenic_spot_tel is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelEqualTo(String value) {
            addCriterion("scenic_spot_tel =", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelNotEqualTo(String value) {
            addCriterion("scenic_spot_tel <>", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelGreaterThan(String value) {
            addCriterion("scenic_spot_tel >", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_tel >=", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelLessThan(String value) {
            addCriterion("scenic_spot_tel <", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_tel <=", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelLike(String value) {
            addCriterion("scenic_spot_tel like", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelNotLike(String value) {
            addCriterion("scenic_spot_tel not like", value, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelIn(List<String> values) {
            addCriterion("scenic_spot_tel in", values, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelNotIn(List<String> values) {
            addCriterion("scenic_spot_tel not in", values, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelBetween(String value1, String value2) {
            addCriterion("scenic_spot_tel between", value1, value2, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotTelNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_tel not between", value1, value2, "scenicSpotTel");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateIsNull() {
            addCriterion("scenic_spot_date is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateIsNotNull() {
            addCriterion("scenic_spot_date is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateEqualTo(String value) {
            addCriterion("scenic_spot_date =", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateNotEqualTo(String value) {
            addCriterion("scenic_spot_date <>", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateGreaterThan(String value) {
            addCriterion("scenic_spot_date >", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_date >=", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateLessThan(String value) {
            addCriterion("scenic_spot_date <", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_date <=", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateLike(String value) {
            addCriterion("scenic_spot_date like", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateNotLike(String value) {
            addCriterion("scenic_spot_date not like", value, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateIn(List<String> values) {
            addCriterion("scenic_spot_date in", values, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateNotIn(List<String> values) {
            addCriterion("scenic_spot_date not in", values, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateBetween(String value1, String value2) {
            addCriterion("scenic_spot_date between", value1, value2, "scenicSpotDate");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDateNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_date not between", value1, value2, "scenicSpotDate");
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