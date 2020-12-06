package com.java.gmall.sms.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_home_adv
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SmsHomeAdv {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   图片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * Database Column Remarks:
     *   开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * Database Column Remarks:
     *   点击数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.click_count
     *
     * @mbg.generated
     */
    private Integer clickCount;

    /**
     * Database Column Remarks:
     *   广告详情连接地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * Database Column Remarks:
     *   排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   发布者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.publisher_id
     *
     * @mbg.generated
     */
    private Long publisherId;

    /**
     * Database Column Remarks:
     *   审核者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_adv.auth_id
     *
     * @mbg.generated
     */
    private Long authId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.id
     *
     * @return the value of sms_home_adv.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.id
     *
     * @param id the value for sms_home_adv.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.name
     *
     * @return the value of sms_home_adv.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.name
     *
     * @param name the value for sms_home_adv.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.pic
     *
     * @return the value of sms_home_adv.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.pic
     *
     * @param pic the value for sms_home_adv.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.start_time
     *
     * @return the value of sms_home_adv.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.start_time
     *
     * @param startTime the value for sms_home_adv.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.end_time
     *
     * @return the value of sms_home_adv.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.end_time
     *
     * @param endTime the value for sms_home_adv.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.status
     *
     * @return the value of sms_home_adv.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.status
     *
     * @param status the value for sms_home_adv.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.click_count
     *
     * @return the value of sms_home_adv.click_count
     *
     * @mbg.generated
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.click_count
     *
     * @param clickCount the value for sms_home_adv.click_count
     *
     * @mbg.generated
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.url
     *
     * @return the value of sms_home_adv.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.url
     *
     * @param url the value for sms_home_adv.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.note
     *
     * @return the value of sms_home_adv.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.note
     *
     * @param note the value for sms_home_adv.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.sort
     *
     * @return the value of sms_home_adv.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.sort
     *
     * @param sort the value for sms_home_adv.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.publisher_id
     *
     * @return the value of sms_home_adv.publisher_id
     *
     * @mbg.generated
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.publisher_id
     *
     * @param publisherId the value for sms_home_adv.publisher_id
     *
     * @mbg.generated
     */
    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_adv.auth_id
     *
     * @return the value of sms_home_adv.auth_id
     *
     * @mbg.generated
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_adv.auth_id
     *
     * @param authId the value for sms_home_adv.auth_id
     *
     * @mbg.generated
     */
    public void setAuthId(Long authId) {
        this.authId = authId;
    }
}