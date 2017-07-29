package com.iread.pojo;

import java.util.Date;

public class Article {
    private String id;

    private String userId;

    private String title;

    private Integer lookNum;

    private Integer commentNum;

    private Integer likeNum;

    private Date createTime;

    private Boolean isVisible;

    private Boolean isDisplay;

    private String bookImgPath;

    private String audioPath;

    private Integer audioDuration;

    private String audioInfo;

    private String abstractInfo;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLookNum() {
        return lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getBookImgPath() {
        return bookImgPath;
    }

    public void setBookImgPath(String bookImgPath) {
        this.bookImgPath = bookImgPath == null ? null : bookImgPath.trim();
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath == null ? null : audioPath.trim();
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
        this.audioInfo = audioInfo == null ? null : audioInfo.trim();
    }

    public String getAbstractInfo() {
        return abstractInfo;
    }

    public void setAbstractInfo(String abstractInfo) {
        this.abstractInfo = abstractInfo == null ? null : abstractInfo.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}