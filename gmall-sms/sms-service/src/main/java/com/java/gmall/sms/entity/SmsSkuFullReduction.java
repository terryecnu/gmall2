package com.java.gmall.sms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_sku_full_reduction
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SmsSkuFullReduction {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_sku_full_reduction.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   spu_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_sku_full_reduction.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   满多少
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_sku_full_reduction.full_price
     *
     * @mbg.generated
     */
    private Long fullPrice;

    /**
     * Database Column Remarks:
     *   减多少
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_sku_full_reduction.reduce_price
     *
     * @mbg.generated
     */
    private Long reducePrice;

    /**
     * Database Column Remarks:
     *   是否参与其他优惠
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_sku_full_reduction.add_other
     *
     * @mbg.generated
     */
    private Boolean addOther;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_sku_full_reduction.id
     *
     * @return the value of sms_sku_full_reduction.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_sku_full_reduction.id
     *
     * @param id the value for sms_sku_full_reduction.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_sku_full_reduction.sku_id
     *
     * @return the value of sms_sku_full_reduction.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_sku_full_reduction.sku_id
     *
     * @param skuId the value for sms_sku_full_reduction.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_sku_full_reduction.full_price
     *
     * @return the value of sms_sku_full_reduction.full_price
     *
     * @mbg.generated
     */
    public Long getFullPrice() {
        return fullPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_sku_full_reduction.full_price
     *
     * @param fullPrice the value for sms_sku_full_reduction.full_price
     *
     * @mbg.generated
     */
    public void setFullPrice(Long fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_sku_full_reduction.reduce_price
     *
     * @return the value of sms_sku_full_reduction.reduce_price
     *
     * @mbg.generated
     */
    public Long getReducePrice() {
        return reducePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_sku_full_reduction.reduce_price
     *
     * @param reducePrice the value for sms_sku_full_reduction.reduce_price
     *
     * @mbg.generated
     */
    public void setReducePrice(Long reducePrice) {
        this.reducePrice = reducePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_sku_full_reduction.add_other
     *
     * @return the value of sms_sku_full_reduction.add_other
     *
     * @mbg.generated
     */
    public Boolean getAddOther() {
        return addOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_sku_full_reduction.add_other
     *
     * @param addOther the value for sms_sku_full_reduction.add_other
     *
     * @mbg.generated
     */
    public void setAddOther(Boolean addOther) {
        this.addOther = addOther;
    }
}