package com.wb.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GuideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuideExample() {
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

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(Integer value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(Integer value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(Integer value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(Integer value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(Integer value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<Integer> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<Integer> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(Integer value1, Integer value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNull() {
            addCriterion("guide_name is null");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNotNull() {
            addCriterion("guide_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuideNameEqualTo(String value) {
            addCriterion("guide_name =", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotEqualTo(String value) {
            addCriterion("guide_name <>", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThan(String value) {
            addCriterion("guide_name >", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThanOrEqualTo(String value) {
            addCriterion("guide_name >=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThan(String value) {
            addCriterion("guide_name <", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThanOrEqualTo(String value) {
            addCriterion("guide_name <=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLike(String value) {
            addCriterion("guide_name like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotLike(String value) {
            addCriterion("guide_name not like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameIn(List<String> values) {
            addCriterion("guide_name in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotIn(List<String> values) {
            addCriterion("guide_name not in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameBetween(String value1, String value2) {
            addCriterion("guide_name between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotBetween(String value1, String value2) {
            addCriterion("guide_name not between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideSexIsNull() {
            addCriterion("guide_sex is null");
            return (Criteria) this;
        }

        public Criteria andGuideSexIsNotNull() {
            addCriterion("guide_sex is not null");
            return (Criteria) this;
        }

        public Criteria andGuideSexEqualTo(Integer value) {
            addCriterion("guide_sex =", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexNotEqualTo(Integer value) {
            addCriterion("guide_sex <>", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexGreaterThan(Integer value) {
            addCriterion("guide_sex >", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_sex >=", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexLessThan(Integer value) {
            addCriterion("guide_sex <", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexLessThanOrEqualTo(Integer value) {
            addCriterion("guide_sex <=", value, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexIn(List<Integer> values) {
            addCriterion("guide_sex in", values, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexNotIn(List<Integer> values) {
            addCriterion("guide_sex not in", values, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexBetween(Integer value1, Integer value2) {
            addCriterion("guide_sex between", value1, value2, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideSexNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_sex not between", value1, value2, "guideSex");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayIsNull() {
            addCriterion("guide_brithday is null");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayIsNotNull() {
            addCriterion("guide_brithday is not null");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayEqualTo(Date value) {
            addCriterionForJDBCDate("guide_brithday =", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("guide_brithday <>", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayGreaterThan(Date value) {
            addCriterionForJDBCDate("guide_brithday >", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("guide_brithday >=", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayLessThan(Date value) {
            addCriterionForJDBCDate("guide_brithday <", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("guide_brithday <=", value, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayIn(List<Date> values) {
            addCriterionForJDBCDate("guide_brithday in", values, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("guide_brithday not in", values, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("guide_brithday between", value1, value2, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideBrithdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("guide_brithday not between", value1, value2, "guideBrithday");
            return (Criteria) this;
        }

        public Criteria andGuideAddressIsNull() {
            addCriterion("guide_address is null");
            return (Criteria) this;
        }

        public Criteria andGuideAddressIsNotNull() {
            addCriterion("guide_address is not null");
            return (Criteria) this;
        }

        public Criteria andGuideAddressEqualTo(String value) {
            addCriterion("guide_address =", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressNotEqualTo(String value) {
            addCriterion("guide_address <>", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressGreaterThan(String value) {
            addCriterion("guide_address >", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressGreaterThanOrEqualTo(String value) {
            addCriterion("guide_address >=", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressLessThan(String value) {
            addCriterion("guide_address <", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressLessThanOrEqualTo(String value) {
            addCriterion("guide_address <=", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressLike(String value) {
            addCriterion("guide_address like", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressNotLike(String value) {
            addCriterion("guide_address not like", value, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressIn(List<String> values) {
            addCriterion("guide_address in", values, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressNotIn(List<String> values) {
            addCriterion("guide_address not in", values, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressBetween(String value1, String value2) {
            addCriterion("guide_address between", value1, value2, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideAddressNotBetween(String value1, String value2) {
            addCriterion("guide_address not between", value1, value2, "guideAddress");
            return (Criteria) this;
        }

        public Criteria andGuideCityIsNull() {
            addCriterion("guide_city is null");
            return (Criteria) this;
        }

        public Criteria andGuideCityIsNotNull() {
            addCriterion("guide_city is not null");
            return (Criteria) this;
        }

        public Criteria andGuideCityEqualTo(String value) {
            addCriterion("guide_city =", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityNotEqualTo(String value) {
            addCriterion("guide_city <>", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityGreaterThan(String value) {
            addCriterion("guide_city >", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityGreaterThanOrEqualTo(String value) {
            addCriterion("guide_city >=", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityLessThan(String value) {
            addCriterion("guide_city <", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityLessThanOrEqualTo(String value) {
            addCriterion("guide_city <=", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityLike(String value) {
            addCriterion("guide_city like", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityNotLike(String value) {
            addCriterion("guide_city not like", value, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityIn(List<String> values) {
            addCriterion("guide_city in", values, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityNotIn(List<String> values) {
            addCriterion("guide_city not in", values, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityBetween(String value1, String value2) {
            addCriterion("guide_city between", value1, value2, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideCityNotBetween(String value1, String value2) {
            addCriterion("guide_city not between", value1, value2, "guideCity");
            return (Criteria) this;
        }

        public Criteria andGuideYearIsNull() {
            addCriterion("guide_year is null");
            return (Criteria) this;
        }

        public Criteria andGuideYearIsNotNull() {
            addCriterion("guide_year is not null");
            return (Criteria) this;
        }

        public Criteria andGuideYearEqualTo(Double value) {
            addCriterion("guide_year =", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearNotEqualTo(Double value) {
            addCriterion("guide_year <>", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearGreaterThan(Double value) {
            addCriterion("guide_year >", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearGreaterThanOrEqualTo(Double value) {
            addCriterion("guide_year >=", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearLessThan(Double value) {
            addCriterion("guide_year <", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearLessThanOrEqualTo(Double value) {
            addCriterion("guide_year <=", value, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearIn(List<Double> values) {
            addCriterion("guide_year in", values, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearNotIn(List<Double> values) {
            addCriterion("guide_year not in", values, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearBetween(Double value1, Double value2) {
            addCriterion("guide_year between", value1, value2, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideYearNotBetween(Double value1, Double value2) {
            addCriterion("guide_year not between", value1, value2, "guideYear");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityIsNull() {
            addCriterion("guide_identity is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityIsNotNull() {
            addCriterion("guide_identity is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityEqualTo(Integer value) {
            addCriterion("guide_identity =", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityNotEqualTo(Integer value) {
            addCriterion("guide_identity <>", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityGreaterThan(Integer value) {
            addCriterion("guide_identity >", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_identity >=", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityLessThan(Integer value) {
            addCriterion("guide_identity <", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("guide_identity <=", value, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityIn(List<Integer> values) {
            addCriterion("guide_identity in", values, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityNotIn(List<Integer> values) {
            addCriterion("guide_identity not in", values, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityBetween(Integer value1, Integer value2) {
            addCriterion("guide_identity between", value1, value2, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_identity not between", value1, value2, "guideIdentity");
            return (Criteria) this;
        }

        public Criteria andGuideIscarIsNull() {
            addCriterion("guide_isCar is null");
            return (Criteria) this;
        }

        public Criteria andGuideIscarIsNotNull() {
            addCriterion("guide_isCar is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIscarEqualTo(Integer value) {
            addCriterion("guide_isCar =", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarNotEqualTo(Integer value) {
            addCriterion("guide_isCar <>", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarGreaterThan(Integer value) {
            addCriterion("guide_isCar >", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_isCar >=", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarLessThan(Integer value) {
            addCriterion("guide_isCar <", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarLessThanOrEqualTo(Integer value) {
            addCriterion("guide_isCar <=", value, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarIn(List<Integer> values) {
            addCriterion("guide_isCar in", values, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarNotIn(List<Integer> values) {
            addCriterion("guide_isCar not in", values, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarBetween(Integer value1, Integer value2) {
            addCriterion("guide_isCar between", value1, value2, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideIscarNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_isCar not between", value1, value2, "guideIscar");
            return (Criteria) this;
        }

        public Criteria andGuideTelIsNull() {
            addCriterion("guide_tel is null");
            return (Criteria) this;
        }

        public Criteria andGuideTelIsNotNull() {
            addCriterion("guide_tel is not null");
            return (Criteria) this;
        }

        public Criteria andGuideTelEqualTo(String value) {
            addCriterion("guide_tel =", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelNotEqualTo(String value) {
            addCriterion("guide_tel <>", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelGreaterThan(String value) {
            addCriterion("guide_tel >", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelGreaterThanOrEqualTo(String value) {
            addCriterion("guide_tel >=", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelLessThan(String value) {
            addCriterion("guide_tel <", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelLessThanOrEqualTo(String value) {
            addCriterion("guide_tel <=", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelLike(String value) {
            addCriterion("guide_tel like", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelNotLike(String value) {
            addCriterion("guide_tel not like", value, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelIn(List<String> values) {
            addCriterion("guide_tel in", values, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelNotIn(List<String> values) {
            addCriterion("guide_tel not in", values, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelBetween(String value1, String value2) {
            addCriterion("guide_tel between", value1, value2, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideTelNotBetween(String value1, String value2) {
            addCriterion("guide_tel not between", value1, value2, "guideTel");
            return (Criteria) this;
        }

        public Criteria andGuideQqIsNull() {
            addCriterion("guide_qq is null");
            return (Criteria) this;
        }

        public Criteria andGuideQqIsNotNull() {
            addCriterion("guide_qq is not null");
            return (Criteria) this;
        }

        public Criteria andGuideQqEqualTo(String value) {
            addCriterion("guide_qq =", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqNotEqualTo(String value) {
            addCriterion("guide_qq <>", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqGreaterThan(String value) {
            addCriterion("guide_qq >", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqGreaterThanOrEqualTo(String value) {
            addCriterion("guide_qq >=", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqLessThan(String value) {
            addCriterion("guide_qq <", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqLessThanOrEqualTo(String value) {
            addCriterion("guide_qq <=", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqLike(String value) {
            addCriterion("guide_qq like", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqNotLike(String value) {
            addCriterion("guide_qq not like", value, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqIn(List<String> values) {
            addCriterion("guide_qq in", values, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqNotIn(List<String> values) {
            addCriterion("guide_qq not in", values, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqBetween(String value1, String value2) {
            addCriterion("guide_qq between", value1, value2, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideQqNotBetween(String value1, String value2) {
            addCriterion("guide_qq not between", value1, value2, "guideQq");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinIsNull() {
            addCriterion("guide_weixin is null");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinIsNotNull() {
            addCriterion("guide_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinEqualTo(String value) {
            addCriterion("guide_weixin =", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinNotEqualTo(String value) {
            addCriterion("guide_weixin <>", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinGreaterThan(String value) {
            addCriterion("guide_weixin >", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("guide_weixin >=", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinLessThan(String value) {
            addCriterion("guide_weixin <", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinLessThanOrEqualTo(String value) {
            addCriterion("guide_weixin <=", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinLike(String value) {
            addCriterion("guide_weixin like", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinNotLike(String value) {
            addCriterion("guide_weixin not like", value, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinIn(List<String> values) {
            addCriterion("guide_weixin in", values, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinNotIn(List<String> values) {
            addCriterion("guide_weixin not in", values, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinBetween(String value1, String value2) {
            addCriterion("guide_weixin between", value1, value2, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideWeixinNotBetween(String value1, String value2) {
            addCriterion("guide_weixin not between", value1, value2, "guideWeixin");
            return (Criteria) this;
        }

        public Criteria andGuideEmilIsNull() {
            addCriterion("guide_emil is null");
            return (Criteria) this;
        }

        public Criteria andGuideEmilIsNotNull() {
            addCriterion("guide_emil is not null");
            return (Criteria) this;
        }

        public Criteria andGuideEmilEqualTo(String value) {
            addCriterion("guide_emil =", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilNotEqualTo(String value) {
            addCriterion("guide_emil <>", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilGreaterThan(String value) {
            addCriterion("guide_emil >", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilGreaterThanOrEqualTo(String value) {
            addCriterion("guide_emil >=", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilLessThan(String value) {
            addCriterion("guide_emil <", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilLessThanOrEqualTo(String value) {
            addCriterion("guide_emil <=", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilLike(String value) {
            addCriterion("guide_emil like", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilNotLike(String value) {
            addCriterion("guide_emil not like", value, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilIn(List<String> values) {
            addCriterion("guide_emil in", values, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilNotIn(List<String> values) {
            addCriterion("guide_emil not in", values, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilBetween(String value1, String value2) {
            addCriterion("guide_emil between", value1, value2, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideEmilNotBetween(String value1, String value2) {
            addCriterion("guide_emil not between", value1, value2, "guideEmil");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIsNull() {
            addCriterion("guide_url is null");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIsNotNull() {
            addCriterion("guide_url is not null");
            return (Criteria) this;
        }

        public Criteria andGuideUrlEqualTo(String value) {
            addCriterion("guide_url =", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotEqualTo(String value) {
            addCriterion("guide_url <>", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlGreaterThan(String value) {
            addCriterion("guide_url >", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlGreaterThanOrEqualTo(String value) {
            addCriterion("guide_url >=", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLessThan(String value) {
            addCriterion("guide_url <", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLessThanOrEqualTo(String value) {
            addCriterion("guide_url <=", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLike(String value) {
            addCriterion("guide_url like", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotLike(String value) {
            addCriterion("guide_url not like", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIn(List<String> values) {
            addCriterion("guide_url in", values, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotIn(List<String> values) {
            addCriterion("guide_url not in", values, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlBetween(String value1, String value2) {
            addCriterion("guide_url between", value1, value2, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotBetween(String value1, String value2) {
            addCriterion("guide_url not between", value1, value2, "guideUrl");
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