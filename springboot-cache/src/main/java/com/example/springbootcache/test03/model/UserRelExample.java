package com.example.springbootcache.test03.model;

import java.util.ArrayList;
import java.util.List;

/**
*UserRelExample
* @author Shein Generator
* @since 2019/10/21
*/
public class UserRelExample {
    /**
    *orderByClause
    */
    protected String orderByClause;

    /**
    *distinct
    */
    protected boolean distinct;

    /**
    *oredCriteria
    */
    protected List<Criteria> oredCriteria;

    /**
    *limit
    */
    private Integer limit;

    /**
    *offset
    */
    private Long offset;

    /**
    * UserRelExample
    */
    public UserRelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
    * setOrderByClause
    * @param orderByClause orderByClause
    */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
    * getOrderByClause
    * @return String String
    */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
    * setDistinct
    * @param distinct distinct
    */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
    * isDistinct
    * @return boolean boolean
    */
    public boolean isDistinct() {
        return distinct;
    }

    /**
    * getOredCriteria
    * @return List<Criteria> List<Criteria>
    */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
    * or
    * @param criteria criteria
    */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
    * or
    * @return Criteria Criteria
    */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
    * createCriteria
    * @return Criteria Criteria
    */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
    * createCriteriaInternal
    * @return Criteria Criteria
    */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
    * clear
    */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
    * setLimit
    * @param limit limit
    */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
    * getLimit
    * @return Integer Integer
    */
    public Integer getLimit() {
        return limit;
    }

    /**
    * setOffset
    * @param offset offset
    */
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
    * getOffset
    * @return Long Long
    */
    public Long getOffset() {
        return offset;
    }

    /**
    *AbstractGeneratedCriteria
    * @author Shein Generator
    * @since 2019/10/21
    */
    protected abstract static class AbstractGeneratedCriteria {
        /**
        *criteria
        */
        protected List<Criterion> criteria;

        /**
        * AbstractGeneratedCriteria
        */
        protected AbstractGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
        * isValid
        * @return boolean boolean
        */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
        * getAllCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
        * getCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
        * addCriterion
        * @param condition condition
        */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value value
        * @param property property
        */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value1 value1
        * @param value2 value2
        * @param property property
        */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
        * andIdIsNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        /**
        * andIdIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        /**
        * andIdEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andUserIdIsNull
        * @return Criteria Criteria
        */
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        /**
        * andUserIdIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        /**
        * andUserIdEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
        * andUserIdNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    /**
    *Criteria
    * @author Shein Generator
    * @since 2019/10/21
    */
    public static class Criteria extends AbstractGeneratedCriteria {

        /**
        * Criteria
        */
        protected Criteria() {
            super();
        }
    }

    /**
    *Criterion
    * @author Shein Generator
    * @since 2019/10/21
    */
    public static class Criterion {
        /**
        *condition
        */
        private String condition;

        /**
        *value
        */
        private Object value;

        /**
        *secondValue
        */
        private Object secondValue;

        /**
        *noValue
        */
        private boolean noValue;

        /**
        *singleValue
        */
        private boolean singleValue;

        /**
        *betweenValue
        */
        private boolean betweenValue;

        /**
        *listValue
        */
        private boolean listValue;

        /**
        *typeHandler
        */
        private String typeHandler;

        /**
        * getCondition
        * @return String String
        */
        public String getCondition() {
            return condition;
        }

        /**
        * getValue
        * @return Object Object
        */
        public Object getValue() {
            return value;
        }

        /**
        * getSecondValue
        * @return Object Object
        */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
        * isNoValue
        * @return boolean boolean
        */
        public boolean isNoValue() {
            return noValue;
        }

        /**
        * isSingleValue
        * @return boolean boolean
        */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
        * isBetweenValue
        * @return boolean boolean
        */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
        * isListValue
        * @return boolean boolean
        */
        public boolean isListValue() {
            return listValue;
        }

        /**
        * getTypeHandler
        * @return String String
        */
        public String getTypeHandler() {
            return typeHandler;
        }

        /**
        * Criterion
        * @param condition condition
        */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param typeHandler typeHandler
        */
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

        /**
        * Criterion
        * @param condition condition
        * @param value value
        */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        * @param typeHandler typeHandler
        */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}