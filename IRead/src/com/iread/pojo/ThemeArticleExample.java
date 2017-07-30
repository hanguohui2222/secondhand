package com.iread.pojo;

import java.util.ArrayList;
import java.util.List;

public class ThemeArticleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ThemeArticleExample() {
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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

		public Criteria andLookNumIsNull() {
			addCriterion("look_num is null");
			return (Criteria) this;
		}

		public Criteria andLookNumIsNotNull() {
			addCriterion("look_num is not null");
			return (Criteria) this;
		}

		public Criteria andLookNumEqualTo(Integer value) {
			addCriterion("look_num =", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumNotEqualTo(Integer value) {
			addCriterion("look_num <>", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumGreaterThan(Integer value) {
			addCriterion("look_num >", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("look_num >=", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumLessThan(Integer value) {
			addCriterion("look_num <", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumLessThanOrEqualTo(Integer value) {
			addCriterion("look_num <=", value, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumIn(List<Integer> values) {
			addCriterion("look_num in", values, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumNotIn(List<Integer> values) {
			addCriterion("look_num not in", values, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumBetween(Integer value1, Integer value2) {
			addCriterion("look_num between", value1, value2, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLookNumNotBetween(Integer value1, Integer value2) {
			addCriterion("look_num not between", value1, value2, "lookNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumIsNull() {
			addCriterion("like_num is null");
			return (Criteria) this;
		}

		public Criteria andLikeNumIsNotNull() {
			addCriterion("like_num is not null");
			return (Criteria) this;
		}

		public Criteria andLikeNumEqualTo(Integer value) {
			addCriterion("like_num =", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumNotEqualTo(Integer value) {
			addCriterion("like_num <>", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumGreaterThan(Integer value) {
			addCriterion("like_num >", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("like_num >=", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumLessThan(Integer value) {
			addCriterion("like_num <", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumLessThanOrEqualTo(Integer value) {
			addCriterion("like_num <=", value, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumIn(List<Integer> values) {
			addCriterion("like_num in", values, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumNotIn(List<Integer> values) {
			addCriterion("like_num not in", values, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumBetween(Integer value1, Integer value2) {
			addCriterion("like_num between", value1, value2, "likeNum");
			return (Criteria) this;
		}

		public Criteria andLikeNumNotBetween(Integer value1, Integer value2) {
			addCriterion("like_num not between", value1, value2, "likeNum");
			return (Criteria) this;
		}

		public Criteria andArticleImgIsNull() {
			addCriterion("article_img is null");
			return (Criteria) this;
		}

		public Criteria andArticleImgIsNotNull() {
			addCriterion("article_img is not null");
			return (Criteria) this;
		}

		public Criteria andArticleImgEqualTo(String value) {
			addCriterion("article_img =", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotEqualTo(String value) {
			addCriterion("article_img <>", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgGreaterThan(String value) {
			addCriterion("article_img >", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgGreaterThanOrEqualTo(String value) {
			addCriterion("article_img >=", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLessThan(String value) {
			addCriterion("article_img <", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLessThanOrEqualTo(String value) {
			addCriterion("article_img <=", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLike(String value) {
			addCriterion("article_img like", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotLike(String value) {
			addCriterion("article_img not like", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgIn(List<String> values) {
			addCriterion("article_img in", values, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotIn(List<String> values) {
			addCriterion("article_img not in", values, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgBetween(String value1, String value2) {
			addCriterion("article_img between", value1, value2, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotBetween(String value1, String value2) {
			addCriterion("article_img not between", value1, value2, "articleImg");
			return (Criteria) this;
		}

		public Criteria andThemeIdIsNull() {
			addCriterion("theme_id is null");
			return (Criteria) this;
		}

		public Criteria andThemeIdIsNotNull() {
			addCriterion("theme_id is not null");
			return (Criteria) this;
		}

		public Criteria andThemeIdEqualTo(String value) {
			addCriterion("theme_id =", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdNotEqualTo(String value) {
			addCriterion("theme_id <>", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdGreaterThan(String value) {
			addCriterion("theme_id >", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdGreaterThanOrEqualTo(String value) {
			addCriterion("theme_id >=", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdLessThan(String value) {
			addCriterion("theme_id <", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdLessThanOrEqualTo(String value) {
			addCriterion("theme_id <=", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdLike(String value) {
			addCriterion("theme_id like", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdNotLike(String value) {
			addCriterion("theme_id not like", value, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdIn(List<String> values) {
			addCriterion("theme_id in", values, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdNotIn(List<String> values) {
			addCriterion("theme_id not in", values, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdBetween(String value1, String value2) {
			addCriterion("theme_id between", value1, value2, "themeId");
			return (Criteria) this;
		}

		public Criteria andThemeIdNotBetween(String value1, String value2) {
			addCriterion("theme_id not between", value1, value2, "themeId");
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