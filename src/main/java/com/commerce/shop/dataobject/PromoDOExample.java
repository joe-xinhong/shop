package com.commerce.shop.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromoDOExample() {
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
            addCriterion("promo.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("promo.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("promo.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("promo.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("promo.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("promo.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("promo.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("promo.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("promo.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("promo.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promo.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNull() {
            addCriterion("promo.promo_name is null");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNotNull() {
            addCriterion("promo.promo_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromoNameEqualTo(String value) {
            addCriterion("promo.promo_name =", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotEqualTo(String value) {
            addCriterion("promo.promo_name <>", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThan(String value) {
            addCriterion("promo.promo_name >", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThanOrEqualTo(String value) {
            addCriterion("promo.promo_name >=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThan(String value) {
            addCriterion("promo.promo_name <", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThanOrEqualTo(String value) {
            addCriterion("promo.promo_name <=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLike(String value) {
            addCriterion("promo.promo_name like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotLike(String value) {
            addCriterion("promo.promo_name not like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameIn(List<String> values) {
            addCriterion("promo.promo_name in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotIn(List<String> values) {
            addCriterion("promo.promo_name not in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameBetween(String value1, String value2) {
            addCriterion("promo.promo_name between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotBetween(String value1, String value2) {
            addCriterion("promo.promo_name not between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("promo.start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("promo.start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("promo.start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("promo.start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("promo.start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("promo.start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("promo.start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("promo.start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("promo.start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("promo.start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("promo.start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("promo.start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("promo.end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("promo.end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("promo.end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("promo.end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("promo.end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("promo.end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("promo.end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("promo.end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("promo.end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("promo.end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("promo.end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("promo.end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("promo.item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("promo.item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("promo.item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("promo.item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("promo.item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo.item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("promo.item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("promo.item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("promo.item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("promo.item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("promo.item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promo.item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceIsNull() {
            addCriterion("promo.promo_item_price is null");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceIsNotNull() {
            addCriterion("promo.promo_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceEqualTo(Double value) {
            addCriterion("promo.promo_item_price =", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceNotEqualTo(Double value) {
            addCriterion("promo.promo_item_price <>", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceGreaterThan(Double value) {
            addCriterion("promo.promo_item_price >", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("promo.promo_item_price >=", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceLessThan(Double value) {
            addCriterion("promo.promo_item_price <", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceLessThanOrEqualTo(Double value) {
            addCriterion("promo.promo_item_price <=", value, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceIn(List<Double> values) {
            addCriterion("promo.promo_item_price in", values, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceNotIn(List<Double> values) {
            addCriterion("promo.promo_item_price not in", values, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceBetween(Double value1, Double value2) {
            addCriterion("promo.promo_item_price between", value1, value2, "promoItemPrice");
            return (Criteria) this;
        }

        public Criteria andPromoItemPriceNotBetween(Double value1, Double value2) {
            addCriterion("promo.promo_item_price not between", value1, value2, "promoItemPrice");
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