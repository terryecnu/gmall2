package com.java.gmall.pms.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_spu_comment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SpuComment {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   sku_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   spu_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.spu_id
     *
     * @mbg.generated
     */
    private Long spuId;

    /**
     * Database Column Remarks:
     *   商品名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.spu_name
     *
     * @mbg.generated
     */
    private String spuName;

    /**
     * Database Column Remarks:
     *   会员昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.member_nick_name
     *
     * @mbg.generated
     */
    private String memberNickName;

    /**
     * Database Column Remarks:
     *   星级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.star
     *
     * @mbg.generated
     */
    private Boolean star;

    /**
     * Database Column Remarks:
     *   会员ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.member_ip
     *
     * @mbg.generated
     */
    private String memberIp;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   显示状态[0-不显示，1-显示]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.show_status
     *
     * @mbg.generated
     */
    private Boolean showStatus;

    /**
     * Database Column Remarks:
     *   购买时属性组合
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.spu_attributes
     *
     * @mbg.generated
     */
    private String spuAttributes;

    /**
     * Database Column Remarks:
     *   点赞数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.likes_count
     *
     * @mbg.generated
     */
    private Integer likesCount;

    /**
     * Database Column Remarks:
     *   回复数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.reply_count
     *
     * @mbg.generated
     */
    private Integer replyCount;

    /**
     * Database Column Remarks:
     *   评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.resources
     *
     * @mbg.generated
     */
    private String resources;

    /**
     * Database Column Remarks:
     *   用户头像
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.member_icon
     *
     * @mbg.generated
     */
    private String memberIcon;

    /**
     * Database Column Remarks:
     *   评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.comment_type
     *
     * @mbg.generated
     */
    private Byte commentType;

    /**
     * Database Column Remarks:
     *   内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_comment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.id
     *
     * @return the value of pms_spu_comment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.id
     *
     * @param id the value for pms_spu_comment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.sku_id
     *
     * @return the value of pms_spu_comment.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.sku_id
     *
     * @param skuId the value for pms_spu_comment.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.spu_id
     *
     * @return the value of pms_spu_comment.spu_id
     *
     * @mbg.generated
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.spu_id
     *
     * @param spuId the value for pms_spu_comment.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.spu_name
     *
     * @return the value of pms_spu_comment.spu_name
     *
     * @mbg.generated
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.spu_name
     *
     * @param spuName the value for pms_spu_comment.spu_name
     *
     * @mbg.generated
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.member_nick_name
     *
     * @return the value of pms_spu_comment.member_nick_name
     *
     * @mbg.generated
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.member_nick_name
     *
     * @param memberNickName the value for pms_spu_comment.member_nick_name
     *
     * @mbg.generated
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.star
     *
     * @return the value of pms_spu_comment.star
     *
     * @mbg.generated
     */
    public Boolean getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.star
     *
     * @param star the value for pms_spu_comment.star
     *
     * @mbg.generated
     */
    public void setStar(Boolean star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.member_ip
     *
     * @return the value of pms_spu_comment.member_ip
     *
     * @mbg.generated
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.member_ip
     *
     * @param memberIp the value for pms_spu_comment.member_ip
     *
     * @mbg.generated
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.create_time
     *
     * @return the value of pms_spu_comment.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.create_time
     *
     * @param createTime the value for pms_spu_comment.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.show_status
     *
     * @return the value of pms_spu_comment.show_status
     *
     * @mbg.generated
     */
    public Boolean getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.show_status
     *
     * @param showStatus the value for pms_spu_comment.show_status
     *
     * @mbg.generated
     */
    public void setShowStatus(Boolean showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.spu_attributes
     *
     * @return the value of pms_spu_comment.spu_attributes
     *
     * @mbg.generated
     */
    public String getSpuAttributes() {
        return spuAttributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.spu_attributes
     *
     * @param spuAttributes the value for pms_spu_comment.spu_attributes
     *
     * @mbg.generated
     */
    public void setSpuAttributes(String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.likes_count
     *
     * @return the value of pms_spu_comment.likes_count
     *
     * @mbg.generated
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.likes_count
     *
     * @param likesCount the value for pms_spu_comment.likes_count
     *
     * @mbg.generated
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.reply_count
     *
     * @return the value of pms_spu_comment.reply_count
     *
     * @mbg.generated
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.reply_count
     *
     * @param replyCount the value for pms_spu_comment.reply_count
     *
     * @mbg.generated
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.resources
     *
     * @return the value of pms_spu_comment.resources
     *
     * @mbg.generated
     */
    public String getResources() {
        return resources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.resources
     *
     * @param resources the value for pms_spu_comment.resources
     *
     * @mbg.generated
     */
    public void setResources(String resources) {
        this.resources = resources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.member_icon
     *
     * @return the value of pms_spu_comment.member_icon
     *
     * @mbg.generated
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.member_icon
     *
     * @param memberIcon the value for pms_spu_comment.member_icon
     *
     * @mbg.generated
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.comment_type
     *
     * @return the value of pms_spu_comment.comment_type
     *
     * @mbg.generated
     */
    public Byte getCommentType() {
        return commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.comment_type
     *
     * @param commentType the value for pms_spu_comment.comment_type
     *
     * @mbg.generated
     */
    public void setCommentType(Byte commentType) {
        this.commentType = commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_comment.content
     *
     * @return the value of pms_spu_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_comment.content
     *
     * @param content the value for pms_spu_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }
}