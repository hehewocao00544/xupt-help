package cn.edu.xupt.help.framework.domain;

import java.util.Date;

public class TbMessageCollect {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message_collect.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message_collect.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message_collect.message_id
     *
     * @mbggenerated
     */
    private Long messageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_message_collect.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message_collect.id
     *
     * @return the value of tb_message_collect.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message_collect.id
     *
     * @param id the value for tb_message_collect.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message_collect.user_id
     *
     * @return the value of tb_message_collect.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message_collect.user_id
     *
     * @param userId the value for tb_message_collect.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message_collect.message_id
     *
     * @return the value of tb_message_collect.message_id
     *
     * @mbggenerated
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message_collect.message_id
     *
     * @param messageId the value for tb_message_collect.message_id
     *
     * @mbggenerated
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_message_collect.create_time
     *
     * @return the value of tb_message_collect.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_message_collect.create_time
     *
     * @param createTime the value for tb_message_collect.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}