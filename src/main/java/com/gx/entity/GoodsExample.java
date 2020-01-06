package com.gx.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gtype is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gtype is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(String value) {
            addCriterion("gtype =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(String value) {
            addCriterion("gtype <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(String value) {
            addCriterion("gtype >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(String value) {
            addCriterion("gtype >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(String value) {
            addCriterion("gtype <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(String value) {
            addCriterion("gtype <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLike(String value) {
            addCriterion("gtype like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotLike(String value) {
            addCriterion("gtype not like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<String> values) {
            addCriterion("gtype in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<String> values) {
            addCriterion("gtype not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(String value1, String value2) {
            addCriterion("gtype between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(String value1, String value2) {
            addCriterion("gtype not between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNull() {
            addCriterion("sendtype is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNotNull() {
            addCriterion("sendtype is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeEqualTo(String value) {
            addCriterion("sendtype =", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotEqualTo(String value) {
            addCriterion("sendtype <>", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThan(String value) {
            addCriterion("sendtype >", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThanOrEqualTo(String value) {
            addCriterion("sendtype >=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThan(String value) {
            addCriterion("sendtype <", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThanOrEqualTo(String value) {
            addCriterion("sendtype <=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLike(String value) {
            addCriterion("sendtype like", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotLike(String value) {
            addCriterion("sendtype not like", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIn(List<String> values) {
            addCriterion("sendtype in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotIn(List<String> values) {
            addCriterion("sendtype not in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeBetween(String value1, String value2) {
            addCriterion("sendtype between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotBetween(String value1, String value2) {
            addCriterion("sendtype not between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andGshipperIsNull() {
            addCriterion("gshipper is null");
            return (Criteria) this;
        }

        public Criteria andGshipperIsNotNull() {
            addCriterion("gshipper is not null");
            return (Criteria) this;
        }

        public Criteria andGshipperEqualTo(String value) {
            addCriterion("gshipper =", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperNotEqualTo(String value) {
            addCriterion("gshipper <>", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperGreaterThan(String value) {
            addCriterion("gshipper >", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperGreaterThanOrEqualTo(String value) {
            addCriterion("gshipper >=", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperLessThan(String value) {
            addCriterion("gshipper <", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperLessThanOrEqualTo(String value) {
            addCriterion("gshipper <=", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperLike(String value) {
            addCriterion("gshipper like", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperNotLike(String value) {
            addCriterion("gshipper not like", value, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperIn(List<String> values) {
            addCriterion("gshipper in", values, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperNotIn(List<String> values) {
            addCriterion("gshipper not in", values, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperBetween(String value1, String value2) {
            addCriterion("gshipper between", value1, value2, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGshipperNotBetween(String value1, String value2) {
            addCriterion("gshipper not between", value1, value2, "gshipper");
            return (Criteria) this;
        }

        public Criteria andGsalesIsNull() {
            addCriterion("gsales is null");
            return (Criteria) this;
        }

        public Criteria andGsalesIsNotNull() {
            addCriterion("gsales is not null");
            return (Criteria) this;
        }

        public Criteria andGsalesEqualTo(Integer value) {
            addCriterion("gsales =", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesNotEqualTo(Integer value) {
            addCriterion("gsales <>", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesGreaterThan(Integer value) {
            addCriterion("gsales >", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsales >=", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesLessThan(Integer value) {
            addCriterion("gsales <", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesLessThanOrEqualTo(Integer value) {
            addCriterion("gsales <=", value, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesIn(List<Integer> values) {
            addCriterion("gsales in", values, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesNotIn(List<Integer> values) {
            addCriterion("gsales not in", values, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesBetween(Integer value1, Integer value2) {
            addCriterion("gsales between", value1, value2, "gsales");
            return (Criteria) this;
        }

        public Criteria andGsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("gsales not between", value1, value2, "gsales");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandID is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(String value) {
            addCriterion("brandID =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(String value) {
            addCriterion("brandID <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(String value) {
            addCriterion("brandID >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(String value) {
            addCriterion("brandID >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(String value) {
            addCriterion("brandID <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(String value) {
            addCriterion("brandID <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLike(String value) {
            addCriterion("brandID like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotLike(String value) {
            addCriterion("brandID not like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<String> values) {
            addCriterion("brandID in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<String> values) {
            addCriterion("brandID not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(String value1, String value2) {
            addCriterion("brandID between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(String value1, String value2) {
            addCriterion("brandID not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNull() {
            addCriterion("sizeID is null");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNotNull() {
            addCriterion("sizeID is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidEqualTo(String value) {
            addCriterion("sizeID =", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotEqualTo(String value) {
            addCriterion("sizeID <>", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThan(String value) {
            addCriterion("sizeID >", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThanOrEqualTo(String value) {
            addCriterion("sizeID >=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThan(String value) {
            addCriterion("sizeID <", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThanOrEqualTo(String value) {
            addCriterion("sizeID <=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLike(String value) {
            addCriterion("sizeID like", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotLike(String value) {
            addCriterion("sizeID not like", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidIn(List<String> values) {
            addCriterion("sizeID in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotIn(List<String> values) {
            addCriterion("sizeID not in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidBetween(String value1, String value2) {
            addCriterion("sizeID between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotBetween(String value1, String value2) {
            addCriterion("sizeID not between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andPixelsidIsNull() {
            addCriterion("pixelsID is null");
            return (Criteria) this;
        }

        public Criteria andPixelsidIsNotNull() {
            addCriterion("pixelsID is not null");
            return (Criteria) this;
        }

        public Criteria andPixelsidEqualTo(String value) {
            addCriterion("pixelsID =", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidNotEqualTo(String value) {
            addCriterion("pixelsID <>", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidGreaterThan(String value) {
            addCriterion("pixelsID >", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidGreaterThanOrEqualTo(String value) {
            addCriterion("pixelsID >=", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidLessThan(String value) {
            addCriterion("pixelsID <", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidLessThanOrEqualTo(String value) {
            addCriterion("pixelsID <=", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidLike(String value) {
            addCriterion("pixelsID like", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidNotLike(String value) {
            addCriterion("pixelsID not like", value, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidIn(List<String> values) {
            addCriterion("pixelsID in", values, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidNotIn(List<String> values) {
            addCriterion("pixelsID not in", values, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidBetween(String value1, String value2) {
            addCriterion("pixelsID between", value1, value2, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andPixelsidNotBetween(String value1, String value2) {
            addCriterion("pixelsID not between", value1, value2, "pixelsid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidIsNull() {
            addCriterion("numcoresID is null");
            return (Criteria) this;
        }

        public Criteria andNumcoresidIsNotNull() {
            addCriterion("numcoresID is not null");
            return (Criteria) this;
        }

        public Criteria andNumcoresidEqualTo(String value) {
            addCriterion("numcoresID =", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidNotEqualTo(String value) {
            addCriterion("numcoresID <>", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidGreaterThan(String value) {
            addCriterion("numcoresID >", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidGreaterThanOrEqualTo(String value) {
            addCriterion("numcoresID >=", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidLessThan(String value) {
            addCriterion("numcoresID <", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidLessThanOrEqualTo(String value) {
            addCriterion("numcoresID <=", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidLike(String value) {
            addCriterion("numcoresID like", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidNotLike(String value) {
            addCriterion("numcoresID not like", value, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidIn(List<String> values) {
            addCriterion("numcoresID in", values, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidNotIn(List<String> values) {
            addCriterion("numcoresID not in", values, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidBetween(String value1, String value2) {
            addCriterion("numcoresID between", value1, value2, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNumcoresidNotBetween(String value1, String value2) {
            addCriterion("numcoresID not between", value1, value2, "numcoresid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidIsNull() {
            addCriterion("networktypeID is null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidIsNotNull() {
            addCriterion("networktypeID is not null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidEqualTo(String value) {
            addCriterion("networktypeID =", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidNotEqualTo(String value) {
            addCriterion("networktypeID <>", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidGreaterThan(String value) {
            addCriterion("networktypeID >", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidGreaterThanOrEqualTo(String value) {
            addCriterion("networktypeID >=", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidLessThan(String value) {
            addCriterion("networktypeID <", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidLessThanOrEqualTo(String value) {
            addCriterion("networktypeID <=", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidLike(String value) {
            addCriterion("networktypeID like", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidNotLike(String value) {
            addCriterion("networktypeID not like", value, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidIn(List<String> values) {
            addCriterion("networktypeID in", values, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidNotIn(List<String> values) {
            addCriterion("networktypeID not in", values, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidBetween(String value1, String value2) {
            addCriterion("networktypeID between", value1, value2, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andNetworktypeidNotBetween(String value1, String value2) {
            addCriterion("networktypeID not between", value1, value2, "networktypeid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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