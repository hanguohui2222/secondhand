package com.iread.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ArticleExample() {
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

		public Criteria andCommentNumIsNull() {
			addCriterion("comment_num is null");
			return (Criteria) this;
		}

		public Criteria andCommentNumIsNotNull() {
			addCriterion("comment_num is not null");
			return (Criteria) this;
		}

		public Criteria andCommentNumEqualTo(Integer value) {
			addCriterion("comment_num =", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumNotEqualTo(Integer value) {
			addCriterion("comment_num <>", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumGreaterThan(Integer value) {
			addCriterion("comment_num >", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("comment_num >=", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumLessThan(Integer value) {
			addCriterion("comment_num <", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
			addCriterion("comment_num <=", value, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumIn(List<Integer> values) {
			addCriterion("comment_num in", values, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumNotIn(List<Integer> values) {
			addCriterion("comment_num not in", values, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumBetween(Integer value1, Integer value2) {
			addCriterion("comment_num between", value1, value2, "commentNum");
			return (Criteria) this;
		}

		public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
			addCriterion("comment_num not between", value1, value2, "commentNum");
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

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andIsVisibleIsNull() {
			addCriterion("is_visible is null");
			return (Criteria) this;
		}

		public Criteria andIsVisibleIsNotNull() {
			addCriterion("is_visible is not null");
			return (Criteria) this;
		}

		public Criteria andIsVisibleEqualTo(Boolean value) {
			addCriterion("is_visible =", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleNotEqualTo(Boolean value) {
			addCriterion("is_visible <>", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleGreaterThan(Boolean value) {
			addCriterion("is_visible >", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_visible >=", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleLessThan(Boolean value) {
			addCriterion("is_visible <", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleLessThanOrEqualTo(Boolean value) {
			addCriterion("is_visible <=", value, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleIn(List<Boolean> values) {
			addCriterion("is_visible in", values, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleNotIn(List<Boolean> values) {
			addCriterion("is_visible not in", values, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleBetween(Boolean value1, Boolean value2) {
			addCriterion("is_visible between", value1, value2, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsVisibleNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_visible not between", value1, value2, "isVisible");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNull() {
			addCriterion("is_display is null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNotNull() {
			addCriterion("is_display is not null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayEqualTo(Boolean value) {
			addCriterion("is_display =", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotEqualTo(Boolean value) {
			addCriterion("is_display <>", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThan(Boolean value) {
			addCriterion("is_display >", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_display >=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThan(Boolean value) {
			addCriterion("is_display <", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThanOrEqualTo(Boolean value) {
			addCriterion("is_display <=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIn(List<Boolean> values) {
			addCriterion("is_display in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotIn(List<Boolean> values) {
			addCriterion("is_display not in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayBetween(Boolean value1, Boolean value2) {
			addCriterion("is_display between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_display not between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andBookImgPathIsNull() {
			addCriterion("book_img_path is null");
			return (Criteria) this;
		}

		public Criteria andBookImgPathIsNotNull() {
			addCriterion("book_img_path is not null");
			return (Criteria) this;
		}

		public Criteria andBookImgPathEqualTo(String value) {
			addCriterion("book_img_path =", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathNotEqualTo(String value) {
			addCriterion("book_img_path <>", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathGreaterThan(String value) {
			addCriterion("book_img_path >", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathGreaterThanOrEqualTo(String value) {
			addCriterion("book_img_path >=", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathLessThan(String value) {
			addCriterion("book_img_path <", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathLessThanOrEqualTo(String value) {
			addCriterion("book_img_path <=", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathLike(String value) {
			addCriterion("book_img_path like", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathNotLike(String value) {
			addCriterion("book_img_path not like", value, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathIn(List<String> values) {
			addCriterion("book_img_path in", values, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathNotIn(List<String> values) {
			addCriterion("book_img_path not in", values, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathBetween(String value1, String value2) {
			addCriterion("book_img_path between", value1, value2, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andBookImgPathNotBetween(String value1, String value2) {
			addCriterion("book_img_path not between", value1, value2, "bookImgPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathIsNull() {
			addCriterion("audio_path is null");
			return (Criteria) this;
		}

		public Criteria andAudioPathIsNotNull() {
			addCriterion("audio_path is not null");
			return (Criteria) this;
		}

		public Criteria andAudioPathEqualTo(String value) {
			addCriterion("audio_path =", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathNotEqualTo(String value) {
			addCriterion("audio_path <>", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathGreaterThan(String value) {
			addCriterion("audio_path >", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathGreaterThanOrEqualTo(String value) {
			addCriterion("audio_path >=", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathLessThan(String value) {
			addCriterion("audio_path <", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathLessThanOrEqualTo(String value) {
			addCriterion("audio_path <=", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathLike(String value) {
			addCriterion("audio_path like", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathNotLike(String value) {
			addCriterion("audio_path not like", value, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathIn(List<String> values) {
			addCriterion("audio_path in", values, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathNotIn(List<String> values) {
			addCriterion("audio_path not in", values, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathBetween(String value1, String value2) {
			addCriterion("audio_path between", value1, value2, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioPathNotBetween(String value1, String value2) {
			addCriterion("audio_path not between", value1, value2, "audioPath");
			return (Criteria) this;
		}

		public Criteria andAudioDurationIsNull() {
			addCriterion("audio_duration is null");
			return (Criteria) this;
		}

		public Criteria andAudioDurationIsNotNull() {
			addCriterion("audio_duration is not null");
			return (Criteria) this;
		}

		public Criteria andAudioDurationEqualTo(Integer value) {
			addCriterion("audio_duration =", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationNotEqualTo(Integer value) {
			addCriterion("audio_duration <>", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationGreaterThan(Integer value) {
			addCriterion("audio_duration >", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationGreaterThanOrEqualTo(Integer value) {
			addCriterion("audio_duration >=", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationLessThan(Integer value) {
			addCriterion("audio_duration <", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationLessThanOrEqualTo(Integer value) {
			addCriterion("audio_duration <=", value, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationIn(List<Integer> values) {
			addCriterion("audio_duration in", values, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationNotIn(List<Integer> values) {
			addCriterion("audio_duration not in", values, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationBetween(Integer value1, Integer value2) {
			addCriterion("audio_duration between", value1, value2, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioDurationNotBetween(Integer value1, Integer value2) {
			addCriterion("audio_duration not between", value1, value2, "audioDuration");
			return (Criteria) this;
		}

		public Criteria andAudioInfoIsNull() {
			addCriterion("audio_info is null");
			return (Criteria) this;
		}

		public Criteria andAudioInfoIsNotNull() {
			addCriterion("audio_info is not null");
			return (Criteria) this;
		}

		public Criteria andAudioInfoEqualTo(String value) {
			addCriterion("audio_info =", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoNotEqualTo(String value) {
			addCriterion("audio_info <>", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoGreaterThan(String value) {
			addCriterion("audio_info >", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoGreaterThanOrEqualTo(String value) {
			addCriterion("audio_info >=", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoLessThan(String value) {
			addCriterion("audio_info <", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoLessThanOrEqualTo(String value) {
			addCriterion("audio_info <=", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoLike(String value) {
			addCriterion("audio_info like", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoNotLike(String value) {
			addCriterion("audio_info not like", value, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoIn(List<String> values) {
			addCriterion("audio_info in", values, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoNotIn(List<String> values) {
			addCriterion("audio_info not in", values, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoBetween(String value1, String value2) {
			addCriterion("audio_info between", value1, value2, "audioInfo");
			return (Criteria) this;
		}

		public Criteria andAudioInfoNotBetween(String value1, String value2) {
			addCriterion("audio_info not between", value1, value2, "audioInfo");
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