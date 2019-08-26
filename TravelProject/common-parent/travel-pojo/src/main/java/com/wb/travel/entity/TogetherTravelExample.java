package com.wb.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TogetherTravelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TogetherTravelExample() {
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

        public Criteria andTogetherTravelIdIsNull() {
            addCriterion("together_travel_id is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdIsNotNull() {
            addCriterion("together_travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdEqualTo(Integer value) {
            addCriterion("together_travel_id =", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdNotEqualTo(Integer value) {
            addCriterion("together_travel_id <>", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdGreaterThan(Integer value) {
            addCriterion("together_travel_id >", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("together_travel_id >=", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdLessThan(Integer value) {
            addCriterion("together_travel_id <", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("together_travel_id <=", value, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdIn(List<Integer> values) {
            addCriterion("together_travel_id in", values, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdNotIn(List<Integer> values) {
            addCriterion("together_travel_id not in", values, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_id between", value1, value2, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_id not between", value1, value2, "togetherTravelId");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressIsNull() {
            addCriterion("together_travel_start_address is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressIsNotNull() {
            addCriterion("together_travel_start_address is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressEqualTo(String value) {
            addCriterion("together_travel_start_address =", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressNotEqualTo(String value) {
            addCriterion("together_travel_start_address <>", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressGreaterThan(String value) {
            addCriterion("together_travel_start_address >", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("together_travel_start_address >=", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressLessThan(String value) {
            addCriterion("together_travel_start_address <", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressLessThanOrEqualTo(String value) {
            addCriterion("together_travel_start_address <=", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressLike(String value) {
            addCriterion("together_travel_start_address like", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressNotLike(String value) {
            addCriterion("together_travel_start_address not like", value, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressIn(List<String> values) {
            addCriterion("together_travel_start_address in", values, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressNotIn(List<String> values) {
            addCriterion("together_travel_start_address not in", values, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressBetween(String value1, String value2) {
            addCriterion("together_travel_start_address between", value1, value2, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartAddressNotBetween(String value1, String value2) {
            addCriterion("together_travel_start_address not between", value1, value2, "togetherTravelStartAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressIsNull() {
            addCriterion("together_travel_end_address is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressIsNotNull() {
            addCriterion("together_travel_end_address is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressEqualTo(String value) {
            addCriterion("together_travel_end_address =", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressNotEqualTo(String value) {
            addCriterion("together_travel_end_address <>", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressGreaterThan(String value) {
            addCriterion("together_travel_end_address >", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("together_travel_end_address >=", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressLessThan(String value) {
            addCriterion("together_travel_end_address <", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressLessThanOrEqualTo(String value) {
            addCriterion("together_travel_end_address <=", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressLike(String value) {
            addCriterion("together_travel_end_address like", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressNotLike(String value) {
            addCriterion("together_travel_end_address not like", value, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressIn(List<String> values) {
            addCriterion("together_travel_end_address in", values, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressNotIn(List<String> values) {
            addCriterion("together_travel_end_address not in", values, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressBetween(String value1, String value2) {
            addCriterion("together_travel_end_address between", value1, value2, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndAddressNotBetween(String value1, String value2) {
            addCriterion("together_travel_end_address not between", value1, value2, "togetherTravelEndAddress");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateIsNull() {
            addCriterion("together_travel_start_date is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateIsNotNull() {
            addCriterion("together_travel_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_start_date =", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_start_date <>", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("together_travel_start_date >", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_start_date >=", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateLessThan(Date value) {
            addCriterionForJDBCDate("together_travel_start_date <", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_start_date <=", value, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("together_travel_start_date in", values, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("together_travel_start_date not in", values, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("together_travel_start_date between", value1, value2, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("together_travel_start_date not between", value1, value2, "togetherTravelStartDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateIsNull() {
            addCriterion("together_travel_end_date is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateIsNotNull() {
            addCriterion("together_travel_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_end_date =", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_end_date <>", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("together_travel_end_date >", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_end_date >=", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateLessThan(Date value) {
            addCriterionForJDBCDate("together_travel_end_date <", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("together_travel_end_date <=", value, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("together_travel_end_date in", values, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("together_travel_end_date not in", values, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("together_travel_end_date between", value1, value2, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("together_travel_end_date not between", value1, value2, "togetherTravelEndDate");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeIsNull() {
            addCriterion("\"together_travel_contact _type\" is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeIsNotNull() {
            addCriterion("\"together_travel_contact _type\" is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeEqualTo(Integer value) {
            addCriterion("\"together_travel_contact _type\" =", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeNotEqualTo(Integer value) {
            addCriterion("\"together_travel_contact _type\" <>", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeGreaterThan(Integer value) {
            addCriterion("\"together_travel_contact _type\" >", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"together_travel_contact _type\" >=", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeLessThan(Integer value) {
            addCriterion("\"together_travel_contact _type\" <", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"together_travel_contact _type\" <=", value, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeIn(List<Integer> values) {
            addCriterion("\"together_travel_contact _type\" in", values, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeNotIn(List<Integer> values) {
            addCriterion("\"together_travel_contact _type\" not in", values, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"together_travel_contact _type\" between", value1, value2, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"together_travel_contact _type\" not between", value1, value2, "togetherTravelContactType");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailIsNull() {
            addCriterion("\"together_travel_contact _detail\" is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailIsNotNull() {
            addCriterion("\"together_travel_contact _detail\" is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailEqualTo(String value) {
            addCriterion("\"together_travel_contact _detail\" =", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailNotEqualTo(String value) {
            addCriterion("\"together_travel_contact _detail\" <>", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailGreaterThan(String value) {
            addCriterion("\"together_travel_contact _detail\" >", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailGreaterThanOrEqualTo(String value) {
            addCriterion("\"together_travel_contact _detail\" >=", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailLessThan(String value) {
            addCriterion("\"together_travel_contact _detail\" <", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailLessThanOrEqualTo(String value) {
            addCriterion("\"together_travel_contact _detail\" <=", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailLike(String value) {
            addCriterion("\"together_travel_contact _detail\" like", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailNotLike(String value) {
            addCriterion("\"together_travel_contact _detail\" not like", value, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailIn(List<String> values) {
            addCriterion("\"together_travel_contact _detail\" in", values, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailNotIn(List<String> values) {
            addCriterion("\"together_travel_contact _detail\" not in", values, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailBetween(String value1, String value2) {
            addCriterion("\"together_travel_contact _detail\" between", value1, value2, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelContactDetailNotBetween(String value1, String value2) {
            addCriterion("\"together_travel_contact _detail\" not between", value1, value2, "togetherTravelContactDetail");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberIsNull() {
            addCriterion("together_travel_number is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberIsNotNull() {
            addCriterion("together_travel_number is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberEqualTo(Integer value) {
            addCriterion("together_travel_number =", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberNotEqualTo(Integer value) {
            addCriterion("together_travel_number <>", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberGreaterThan(Integer value) {
            addCriterion("together_travel_number >", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("together_travel_number >=", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberLessThan(Integer value) {
            addCriterion("together_travel_number <", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberLessThanOrEqualTo(Integer value) {
            addCriterion("together_travel_number <=", value, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberIn(List<Integer> values) {
            addCriterion("together_travel_number in", values, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberNotIn(List<Integer> values) {
            addCriterion("together_travel_number not in", values, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_number between", value1, value2, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_number not between", value1, value2, "togetherTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusIsNull() {
            addCriterion("together_travel_status is null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusIsNotNull() {
            addCriterion("together_travel_status is not null");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusEqualTo(Integer value) {
            addCriterion("together_travel_status =", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusNotEqualTo(Integer value) {
            addCriterion("together_travel_status <>", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusGreaterThan(Integer value) {
            addCriterion("together_travel_status >", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("together_travel_status >=", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusLessThan(Integer value) {
            addCriterion("together_travel_status <", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("together_travel_status <=", value, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusIn(List<Integer> values) {
            addCriterion("together_travel_status in", values, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusNotIn(List<Integer> values) {
            addCriterion("together_travel_status not in", values, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_status between", value1, value2, "togetherTravelStatus");
            return (Criteria) this;
        }

        public Criteria andTogetherTravelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("together_travel_status not between", value1, value2, "togetherTravelStatus");
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