package com.iread.pojoExtend;

import java.util.Date;

/**
 * 接收客户端传回的文章信息
 * 
 * @author zjl
 *
 */
public class ArticleExtend {
	private String id;

	private String userId;

	private String title;

	private String bookImgPath;

	private String audioPath;

	private Integer audioDuration;

	private String audioInfo;

	private String content;

	private String abstractInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookImgPath() {
		return bookImgPath;
	}

	public void setBookImgPath(String bookImgPath) {
		this.bookImgPath = bookImgPath;
	}

	public String getAudioPath() {
		return audioPath;
	}

	public void setAudioPath(String audioPath) {
		this.audioPath = audioPath;
	}

	public Integer getAudioDuration() {
		return audioDuration;
	}

	public void setAudioDuration(Integer audioDuration) {
		this.audioDuration = audioDuration;
	}

	public String getAudioInfo() {
		return audioInfo;
	}

	public void setAudioInfo(String audioInfo) {
		this.audioInfo = audioInfo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAbstractInfo() {
		return abstractInfo;
	}

	public void setAbstractInfo(String abstractInfo) {
		this.abstractInfo = abstractInfo;
	}

}
