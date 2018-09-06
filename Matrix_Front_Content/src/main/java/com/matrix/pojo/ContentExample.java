package com.matrix.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andCodingtypeIsNull() {
            addCriterion("codingtype is null");
            return (Criteria) this;
        }

        public Criteria andCodingtypeIsNotNull() {
            addCriterion("codingtype is not null");
            return (Criteria) this;
        }

        public Criteria andCodingtypeEqualTo(Integer value) {
            addCriterion("codingtype =", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeNotEqualTo(Integer value) {
            addCriterion("codingtype <>", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeGreaterThan(Integer value) {
            addCriterion("codingtype >", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("codingtype >=", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeLessThan(Integer value) {
            addCriterion("codingtype <", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeLessThanOrEqualTo(Integer value) {
            addCriterion("codingtype <=", value, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeIn(List<Integer> values) {
            addCriterion("codingtype in", values, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeNotIn(List<Integer> values) {
            addCriterion("codingtype not in", values, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeBetween(Integer value1, Integer value2) {
            addCriterion("codingtype between", value1, value2, "codingtype");
            return (Criteria) this;
        }

        public Criteria andCodingtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("codingtype not between", value1, value2, "codingtype");
            return (Criteria) this;
        }

        public Criteria andLinktoIsNull() {
            addCriterion("linkto is null");
            return (Criteria) this;
        }

        public Criteria andLinktoIsNotNull() {
            addCriterion("linkto is not null");
            return (Criteria) this;
        }

        public Criteria andLinktoEqualTo(String value) {
            addCriterion("linkto =", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoNotEqualTo(String value) {
            addCriterion("linkto <>", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoGreaterThan(String value) {
            addCriterion("linkto >", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoGreaterThanOrEqualTo(String value) {
            addCriterion("linkto >=", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoLessThan(String value) {
            addCriterion("linkto <", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoLessThanOrEqualTo(String value) {
            addCriterion("linkto <=", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoLike(String value) {
            addCriterion("linkto like", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoNotLike(String value) {
            addCriterion("linkto not like", value, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoIn(List<String> values) {
            addCriterion("linkto in", values, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoNotIn(List<String> values) {
            addCriterion("linkto not in", values, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoBetween(String value1, String value2) {
            addCriterion("linkto between", value1, value2, "linkto");
            return (Criteria) this;
        }

        public Criteria andLinktoNotBetween(String value1, String value2) {
            addCriterion("linkto not between", value1, value2, "linkto");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("authorid is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("authorid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Long value) {
            addCriterion("authorid =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Long value) {
            addCriterion("authorid <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Long value) {
            addCriterion("authorid >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Long value) {
            addCriterion("authorid >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Long value) {
            addCriterion("authorid <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Long value) {
            addCriterion("authorid <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Long> values) {
            addCriterion("authorid in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Long> values) {
            addCriterion("authorid not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Long value1, Long value2) {
            addCriterion("authorid between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Long value1, Long value2) {
            addCriterion("authorid not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoripIsNull() {
            addCriterion("authorip is null");
            return (Criteria) this;
        }

        public Criteria andAuthoripIsNotNull() {
            addCriterion("authorip is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoripEqualTo(String value) {
            addCriterion("authorip =", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripNotEqualTo(String value) {
            addCriterion("authorip <>", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripGreaterThan(String value) {
            addCriterion("authorip >", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripGreaterThanOrEqualTo(String value) {
            addCriterion("authorip >=", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripLessThan(String value) {
            addCriterion("authorip <", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripLessThanOrEqualTo(String value) {
            addCriterion("authorip <=", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripLike(String value) {
            addCriterion("authorip like", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripNotLike(String value) {
            addCriterion("authorip not like", value, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripIn(List<String> values) {
            addCriterion("authorip in", values, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripNotIn(List<String> values) {
            addCriterion("authorip not in", values, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripBetween(String value1, String value2) {
            addCriterion("authorip between", value1, value2, "authorip");
            return (Criteria) this;
        }

        public Criteria andAuthoripNotBetween(String value1, String value2) {
            addCriterion("authorip not between", value1, value2, "authorip");
            return (Criteria) this;
        }

        public Criteria andWriternameIsNull() {
            addCriterion("writername is null");
            return (Criteria) this;
        }

        public Criteria andWriternameIsNotNull() {
            addCriterion("writername is not null");
            return (Criteria) this;
        }

        public Criteria andWriternameEqualTo(String value) {
            addCriterion("writername =", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotEqualTo(String value) {
            addCriterion("writername <>", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameGreaterThan(String value) {
            addCriterion("writername >", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameGreaterThanOrEqualTo(String value) {
            addCriterion("writername >=", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLessThan(String value) {
            addCriterion("writername <", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLessThanOrEqualTo(String value) {
            addCriterion("writername <=", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLike(String value) {
            addCriterion("writername like", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotLike(String value) {
            addCriterion("writername not like", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameIn(List<String> values) {
            addCriterion("writername in", values, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotIn(List<String> values) {
            addCriterion("writername not in", values, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameBetween(String value1, String value2) {
            addCriterion("writername between", value1, value2, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotBetween(String value1, String value2) {
            addCriterion("writername not between", value1, value2, "writername");
            return (Criteria) this;
        }

        public Criteria andWriteremailIsNull() {
            addCriterion("writeremail is null");
            return (Criteria) this;
        }

        public Criteria andWriteremailIsNotNull() {
            addCriterion("writeremail is not null");
            return (Criteria) this;
        }

        public Criteria andWriteremailEqualTo(String value) {
            addCriterion("writeremail =", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailNotEqualTo(String value) {
            addCriterion("writeremail <>", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailGreaterThan(String value) {
            addCriterion("writeremail >", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailGreaterThanOrEqualTo(String value) {
            addCriterion("writeremail >=", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailLessThan(String value) {
            addCriterion("writeremail <", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailLessThanOrEqualTo(String value) {
            addCriterion("writeremail <=", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailLike(String value) {
            addCriterion("writeremail like", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailNotLike(String value) {
            addCriterion("writeremail not like", value, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailIn(List<String> values) {
            addCriterion("writeremail in", values, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailNotIn(List<String> values) {
            addCriterion("writeremail not in", values, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailBetween(String value1, String value2) {
            addCriterion("writeremail between", value1, value2, "writeremail");
            return (Criteria) this;
        }

        public Criteria andWriteremailNotBetween(String value1, String value2) {
            addCriterion("writeremail not between", value1, value2, "writeremail");
            return (Criteria) this;
        }

        public Criteria andOrderflagIsNull() {
            addCriterion("orderflag is null");
            return (Criteria) this;
        }

        public Criteria andOrderflagIsNotNull() {
            addCriterion("orderflag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderflagEqualTo(Integer value) {
            addCriterion("orderflag =", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotEqualTo(Integer value) {
            addCriterion("orderflag <>", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagGreaterThan(Integer value) {
            addCriterion("orderflag >", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderflag >=", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagLessThan(Integer value) {
            addCriterion("orderflag <", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagLessThanOrEqualTo(Integer value) {
            addCriterion("orderflag <=", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagIn(List<Integer> values) {
            addCriterion("orderflag in", values, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotIn(List<Integer> values) {
            addCriterion("orderflag not in", values, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagBetween(Integer value1, Integer value2) {
            addCriterion("orderflag between", value1, value2, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotBetween(Integer value1, Integer value2) {
            addCriterion("orderflag not between", value1, value2, "orderflag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVoteupIsNull() {
            addCriterion("voteup is null");
            return (Criteria) this;
        }

        public Criteria andVoteupIsNotNull() {
            addCriterion("voteup is not null");
            return (Criteria) this;
        }

        public Criteria andVoteupEqualTo(Integer value) {
            addCriterion("voteup =", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupNotEqualTo(Integer value) {
            addCriterion("voteup <>", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupGreaterThan(Integer value) {
            addCriterion("voteup >", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupGreaterThanOrEqualTo(Integer value) {
            addCriterion("voteup >=", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupLessThan(Integer value) {
            addCriterion("voteup <", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupLessThanOrEqualTo(Integer value) {
            addCriterion("voteup <=", value, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupIn(List<Integer> values) {
            addCriterion("voteup in", values, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupNotIn(List<Integer> values) {
            addCriterion("voteup not in", values, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupBetween(Integer value1, Integer value2) {
            addCriterion("voteup between", value1, value2, "voteup");
            return (Criteria) this;
        }

        public Criteria andVoteupNotBetween(Integer value1, Integer value2) {
            addCriterion("voteup not between", value1, value2, "voteup");
            return (Criteria) this;
        }

        public Criteria andVotedownIsNull() {
            addCriterion("votedown is null");
            return (Criteria) this;
        }

        public Criteria andVotedownIsNotNull() {
            addCriterion("votedown is not null");
            return (Criteria) this;
        }

        public Criteria andVotedownEqualTo(Integer value) {
            addCriterion("votedown =", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownNotEqualTo(Integer value) {
            addCriterion("votedown <>", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownGreaterThan(Integer value) {
            addCriterion("votedown >", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownGreaterThanOrEqualTo(Integer value) {
            addCriterion("votedown >=", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownLessThan(Integer value) {
            addCriterion("votedown <", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownLessThanOrEqualTo(Integer value) {
            addCriterion("votedown <=", value, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownIn(List<Integer> values) {
            addCriterion("votedown in", values, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownNotIn(List<Integer> values) {
            addCriterion("votedown not in", values, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownBetween(Integer value1, Integer value2) {
            addCriterion("votedown between", value1, value2, "votedown");
            return (Criteria) this;
        }

        public Criteria andVotedownNotBetween(Integer value1, Integer value2) {
            addCriterion("votedown not between", value1, value2, "votedown");
            return (Criteria) this;
        }

        public Criteria andCommentvalveIsNull() {
            addCriterion("commentvalve is null");
            return (Criteria) this;
        }

        public Criteria andCommentvalveIsNotNull() {
            addCriterion("commentvalve is not null");
            return (Criteria) this;
        }

        public Criteria andCommentvalveEqualTo(Integer value) {
            addCriterion("commentvalve =", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveNotEqualTo(Integer value) {
            addCriterion("commentvalve <>", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveGreaterThan(Integer value) {
            addCriterion("commentvalve >", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentvalve >=", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveLessThan(Integer value) {
            addCriterion("commentvalve <", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveLessThanOrEqualTo(Integer value) {
            addCriterion("commentvalve <=", value, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveIn(List<Integer> values) {
            addCriterion("commentvalve in", values, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveNotIn(List<Integer> values) {
            addCriterion("commentvalve not in", values, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveBetween(Integer value1, Integer value2) {
            addCriterion("commentvalve between", value1, value2, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andCommentvalveNotBetween(Integer value1, Integer value2) {
            addCriterion("commentvalve not between", value1, value2, "commentvalve");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewcount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewcount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewcount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewcount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewcount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewcount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewcount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewcount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewcount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewcount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewcount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewcount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifitimeIsNull() {
            addCriterion("modifitime is null");
            return (Criteria) this;
        }

        public Criteria andModifitimeIsNotNull() {
            addCriterion("modifitime is not null");
            return (Criteria) this;
        }

        public Criteria andModifitimeEqualTo(Date value) {
            addCriterion("modifitime =", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotEqualTo(Date value) {
            addCriterion("modifitime <>", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeGreaterThan(Date value) {
            addCriterion("modifitime >", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifitime >=", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeLessThan(Date value) {
            addCriterion("modifitime <", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeLessThanOrEqualTo(Date value) {
            addCriterion("modifitime <=", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeIn(List<Date> values) {
            addCriterion("modifitime in", values, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotIn(List<Date> values) {
            addCriterion("modifitime not in", values, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeBetween(Date value1, Date value2) {
            addCriterion("modifitime between", value1, value2, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotBetween(Date value1, Date value2) {
            addCriterion("modifitime not between", value1, value2, "modifitime");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsIsNull() {
            addCriterion("metakeywords is null");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsIsNotNull() {
            addCriterion("metakeywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsEqualTo(String value) {
            addCriterion("metakeywords =", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsNotEqualTo(String value) {
            addCriterion("metakeywords <>", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsGreaterThan(String value) {
            addCriterion("metakeywords >", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("metakeywords >=", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsLessThan(String value) {
            addCriterion("metakeywords <", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsLessThanOrEqualTo(String value) {
            addCriterion("metakeywords <=", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsLike(String value) {
            addCriterion("metakeywords like", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsNotLike(String value) {
            addCriterion("metakeywords not like", value, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsIn(List<String> values) {
            addCriterion("metakeywords in", values, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsNotIn(List<String> values) {
            addCriterion("metakeywords not in", values, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsBetween(String value1, String value2) {
            addCriterion("metakeywords between", value1, value2, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetakeywordsNotBetween(String value1, String value2) {
            addCriterion("metakeywords not between", value1, value2, "metakeywords");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionIsNull() {
            addCriterion("metadescription is null");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionIsNotNull() {
            addCriterion("metadescription is not null");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionEqualTo(String value) {
            addCriterion("metadescription =", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionNotEqualTo(String value) {
            addCriterion("metadescription <>", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionGreaterThan(String value) {
            addCriterion("metadescription >", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("metadescription >=", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionLessThan(String value) {
            addCriterion("metadescription <", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionLessThanOrEqualTo(String value) {
            addCriterion("metadescription <=", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionLike(String value) {
            addCriterion("metadescription like", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionNotLike(String value) {
            addCriterion("metadescription not like", value, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionIn(List<String> values) {
            addCriterion("metadescription in", values, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionNotIn(List<String> values) {
            addCriterion("metadescription not in", values, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionBetween(String value1, String value2) {
            addCriterion("metadescription between", value1, value2, "metadescription");
            return (Criteria) this;
        }

        public Criteria andMetadescriptionNotBetween(String value1, String value2) {
            addCriterion("metadescription not between", value1, value2, "metadescription");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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