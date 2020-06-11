package com.commerce.shop.dataobject;

import java.util.ArrayList;
import java.util.List;

public class UserDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("user_info.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("user_info.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("user_info.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("user_info.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("user_info.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_info.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("user_info.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_info.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("user_info.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("user_info.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("user_info.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_info.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("user_info.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("user_info.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("user_info.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("user_info.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("user_info.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_info.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("user_info.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("user_info.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("user_info.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("user_info.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("user_info.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("user_info.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("user_info.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("user_info.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("user_info.gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("user_info.gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("user_info.gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("user_info.gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("user_info.gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_info.gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("user_info.gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("user_info.gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("user_info.gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("user_info.gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("user_info.gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("user_info.gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("user_info.age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("user_info.age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("user_info.age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("user_info.age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("user_info.age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_info.age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("user_info.age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_info.age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("user_info.age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("user_info.age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_info.age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_info.age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("user_info.telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("user_info.telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("user_info.telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("user_info.telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("user_info.telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_info.telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("user_info.telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("user_info.telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("user_info.telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("user_info.telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("user_info.telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("user_info.telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("user_info.telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("user_info.telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andRegisterModeIsNull() {
            addCriterion("user_info.register_mode is null");
            return (Criteria) this;
        }

        public Criteria andRegisterModeIsNotNull() {
            addCriterion("user_info.register_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterModeEqualTo(String value) {
            addCriterion("user_info.register_mode =", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeNotEqualTo(String value) {
            addCriterion("user_info.register_mode <>", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeGreaterThan(String value) {
            addCriterion("user_info.register_mode >", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeGreaterThanOrEqualTo(String value) {
            addCriterion("user_info.register_mode >=", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeLessThan(String value) {
            addCriterion("user_info.register_mode <", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeLessThanOrEqualTo(String value) {
            addCriterion("user_info.register_mode <=", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeLike(String value) {
            addCriterion("user_info.register_mode like", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeNotLike(String value) {
            addCriterion("user_info.register_mode not like", value, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeIn(List<String> values) {
            addCriterion("user_info.register_mode in", values, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeNotIn(List<String> values) {
            addCriterion("user_info.register_mode not in", values, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeBetween(String value1, String value2) {
            addCriterion("user_info.register_mode between", value1, value2, "registerMode");
            return (Criteria) this;
        }

        public Criteria andRegisterModeNotBetween(String value1, String value2) {
            addCriterion("user_info.register_mode not between", value1, value2, "registerMode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNull() {
            addCriterion("user_info.third_party_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNotNull() {
            addCriterion("user_info.third_party_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdEqualTo(String value) {
            addCriterion("user_info.third_party_id =", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotEqualTo(String value) {
            addCriterion("user_info.third_party_id <>", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThan(String value) {
            addCriterion("user_info.third_party_id >", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_info.third_party_id >=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThan(String value) {
            addCriterion("user_info.third_party_id <", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThanOrEqualTo(String value) {
            addCriterion("user_info.third_party_id <=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLike(String value) {
            addCriterion("user_info.third_party_id like", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotLike(String value) {
            addCriterion("user_info.third_party_id not like", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIn(List<String> values) {
            addCriterion("user_info.third_party_id in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotIn(List<String> values) {
            addCriterion("user_info.third_party_id not in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdBetween(String value1, String value2) {
            addCriterion("user_info.third_party_id between", value1, value2, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotBetween(String value1, String value2) {
            addCriterion("user_info.third_party_id not between", value1, value2, "thirdPartyId");
            return (Criteria) this;
        }
    }

    /**
     */
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