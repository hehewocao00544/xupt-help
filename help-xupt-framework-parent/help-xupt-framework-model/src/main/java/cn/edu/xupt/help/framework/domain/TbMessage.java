package cn.edu.xupt.help.framework.domain;

import java.util.Date;
import java.util.List;

public class TbMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.user_nick_name
     *
     * @mbggenerated
     */
    private String userNickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.user_pic
     *
     * @mbggenerated
     */
    private String userPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.category_id
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.is_top
     *
     * @mbggenerated
     */
    private String isTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.watch_count
     *
     * @mbggenerated
     */
    private Long watchCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.collect_count
     *
     * @mbggenerated
     */
    private Long collectCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.comment_count
     *
     * @mbggenerated
     */
    private Long commentCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    private List<TbMessageImages> imagesList;

    public List<TbMessageImages> getImagesList() {
        return imagesList;
    }

    public void setImagesList(List<TbMessageImages> imagesList) {
        this.imagesList = imagesList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.id
     *
     * @return the value of tb_message.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.id
     *
     * @param id the value for tb_message.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.user_id
     *
     * @return the value of tb_message.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.user_id
     *
     * @param userId the value for tb_message.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.username
     *
     * @return the value of tb_message.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.username
     *
     * @param username the value for tb_message.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.user_nick_name
     *
     * @return the value of tb_message.user_nick_name
     *
     * @mbggenerated
     */
    public String getUserNickName() {
        return userNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.user_nick_name
     *
     * @param userNickName the value for tb_message.user_nick_name
     *
     * @mbggenerated
     */
    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.user_pic
     *
     * @return the value of tb_message.user_pic
     *
     * @mbggenerated
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.user_pic
     *
     * @param userPic the value for tb_message.user_pic
     *
     * @mbggenerated
     */
    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.category_id
     *
     * @return the value of tb_message.category_id
     *
     * @mbggenerated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.category_id
     *
     * @param categoryId the value for tb_message.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.title
     *
     * @return the value of tb_message.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.title
     *
     * @param title the value for tb_message.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.content
     *
     * @return the value of tb_message.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.content
     *
     * @param content the value for tb_message.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.is_top
     *
     * @return the value of tb_message.is_top
     *
     * @mbggenerated
     */
    public String getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.is_top
     *
     * @param isTop the value for tb_message.is_top
     *
     * @mbggenerated
     */
    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.watch_count
     *
     * @return the value of tb_message.watch_count
     *
     * @mbggenerated
     */
    public Long getWatchCount() {
        return watchCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.watch_count
     *
     * @param watchCount the value for tb_message.watch_count
     *
     * @mbggenerated
     */
    public void setWatchCount(Long watchCount) {
        this.watchCount = watchCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.collect_count
     *
     * @return the value of tb_message.collect_count
     *
     * @mbggenerated
     */
    public Long getCollectCount() {
        return collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.collect_count
     *
     * @param collectCount the value for tb_message.collect_count
     *
     * @mbggenerated
     */
    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.comment_count
     *
     * @return the value of tb_message.comment_count
     *
     * @mbggenerated
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.comment_count
     *
     * @param commentCount the value for tb_message.comment_count
     *
     * @mbggenerated
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.status
     *
     * @return the value of tb_message.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.status
     *
     * @param status the value for tb_message.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.update_time
     *
     * @return the value of tb_message.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.update_time
     *
     * @param updateTime the value for tb_message.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message.create_time
     *
     * @return the value of tb_message.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message.create_time
     *
     * @param createTime the value for tb_message.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}