package cn.edu.xupt.help.framework.domain;

import java.util.Date;

public class TbComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.topic_id
     *
     * @mbggenerated
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.topic_type
     *
     * @mbggenerated
     */
    private Integer topicType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.from_uid
     *
     * @mbggenerated
     */
    private Long fromUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.thumb_img
     *
     * @mbggenerated
     */
    private String thumbImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.is_top
     *
     * @mbggenerated
     */
    private String isTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.is_hot
     *
     * @mbggenerated
     */
    private String isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.like_num
     *
     * @mbggenerated
     */
    private Integer likeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.reply_num
     *
     * @mbggenerated
     */
    private Integer replyNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.id
     *
     * @return the value of tb_comment.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.id
     *
     * @param id the value for tb_comment.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.topic_id
     *
     * @return the value of tb_comment.topic_id
     *
     * @mbggenerated
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.topic_id
     *
     * @param topicId the value for tb_comment.topic_id
     *
     * @mbggenerated
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.topic_type
     *
     * @return the value of tb_comment.topic_type
     *
     * @mbggenerated
     */
    public Integer getTopicType() {
        return topicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.topic_type
     *
     * @param topicType the value for tb_comment.topic_type
     *
     * @mbggenerated
     */
    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.content
     *
     * @return the value of tb_comment.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.content
     *
     * @param content the value for tb_comment.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.from_uid
     *
     * @return the value of tb_comment.from_uid
     *
     * @mbggenerated
     */
    public Long getFromUid() {
        return fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.from_uid
     *
     * @param fromUid the value for tb_comment.from_uid
     *
     * @mbggenerated
     */
    public void setFromUid(Long fromUid) {
        this.fromUid = fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.nick_name
     *
     * @return the value of tb_comment.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.nick_name
     *
     * @param nickName the value for tb_comment.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.thumb_img
     *
     * @return the value of tb_comment.thumb_img
     *
     * @mbggenerated
     */
    public String getThumbImg() {
        return thumbImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.thumb_img
     *
     * @param thumbImg the value for tb_comment.thumb_img
     *
     * @mbggenerated
     */
    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg == null ? null : thumbImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.is_top
     *
     * @return the value of tb_comment.is_top
     *
     * @mbggenerated
     */
    public String getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.is_top
     *
     * @param isTop the value for tb_comment.is_top
     *
     * @mbggenerated
     */
    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.is_hot
     *
     * @return the value of tb_comment.is_hot
     *
     * @mbggenerated
     */
    public String getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.is_hot
     *
     * @param isHot the value for tb_comment.is_hot
     *
     * @mbggenerated
     */
    public void setIsHot(String isHot) {
        this.isHot = isHot == null ? null : isHot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.like_num
     *
     * @return the value of tb_comment.like_num
     *
     * @mbggenerated
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.like_num
     *
     * @param likeNum the value for tb_comment.like_num
     *
     * @mbggenerated
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.reply_num
     *
     * @return the value of tb_comment.reply_num
     *
     * @mbggenerated
     */
    public Integer getReplyNum() {
        return replyNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.reply_num
     *
     * @param replyNum the value for tb_comment.reply_num
     *
     * @mbggenerated
     */
    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.status
     *
     * @return the value of tb_comment.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.status
     *
     * @param status the value for tb_comment.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.create_time
     *
     * @return the value of tb_comment.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.create_time
     *
     * @param createTime the value for tb_comment.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}