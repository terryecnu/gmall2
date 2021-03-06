package com.java.gmall.pms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_spu_images
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SpuImages {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   spu_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.spu_id
     *
     * @mbg.generated
     */
    private Long spuId;

    /**
     * Database Column Remarks:
     *   图片名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.img_name
     *
     * @mbg.generated
     */
    private String imgName;

    /**
     * Database Column Remarks:
     *   图片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.img_url
     *
     * @mbg.generated
     */
    private String imgUrl;

    /**
     * Database Column Remarks:
     *   顺序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.img_sort
     *
     * @mbg.generated
     */
    private Integer imgSort;

    /**
     * Database Column Remarks:
     *   是否默认图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_spu_images.default_img
     *
     * @mbg.generated
     */
    private Byte defaultImg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.id
     *
     * @return the value of pms_spu_images.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.id
     *
     * @param id the value for pms_spu_images.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.spu_id
     *
     * @return the value of pms_spu_images.spu_id
     *
     * @mbg.generated
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.spu_id
     *
     * @param spuId the value for pms_spu_images.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.img_name
     *
     * @return the value of pms_spu_images.img_name
     *
     * @mbg.generated
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.img_name
     *
     * @param imgName the value for pms_spu_images.img_name
     *
     * @mbg.generated
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.img_url
     *
     * @return the value of pms_spu_images.img_url
     *
     * @mbg.generated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.img_url
     *
     * @param imgUrl the value for pms_spu_images.img_url
     *
     * @mbg.generated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.img_sort
     *
     * @return the value of pms_spu_images.img_sort
     *
     * @mbg.generated
     */
    public Integer getImgSort() {
        return imgSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.img_sort
     *
     * @param imgSort the value for pms_spu_images.img_sort
     *
     * @mbg.generated
     */
    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_spu_images.default_img
     *
     * @return the value of pms_spu_images.default_img
     *
     * @mbg.generated
     */
    public Byte getDefaultImg() {
        return defaultImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_spu_images.default_img
     *
     * @param defaultImg the value for pms_spu_images.default_img
     *
     * @mbg.generated
     */
    public void setDefaultImg(Byte defaultImg) {
        this.defaultImg = defaultImg;
    }
}