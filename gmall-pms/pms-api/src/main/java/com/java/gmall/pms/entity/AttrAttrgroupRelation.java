package com.java.gmall.pms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_attr_attrgroup_relation
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class AttrAttrgroupRelation {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_attrgroup_relation.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   属性id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_attrgroup_relation.attr_id
     *
     * @mbg.generated
     */
    private Long attrId;

    /**
     * Database Column Remarks:
     *   属性分组id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_attrgroup_relation.attr_group_id
     *
     * @mbg.generated
     */
    private Long attrGroupId;

    /**
     * Database Column Remarks:
     *   属性组内排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_attrgroup_relation.attr_sort
     *
     * @mbg.generated
     */
    private Integer attrSort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_attrgroup_relation.id
     *
     * @return the value of pms_attr_attrgroup_relation.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_attrgroup_relation.id
     *
     * @param id the value for pms_attr_attrgroup_relation.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_attrgroup_relation.attr_id
     *
     * @return the value of pms_attr_attrgroup_relation.attr_id
     *
     * @mbg.generated
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_attrgroup_relation.attr_id
     *
     * @param attrId the value for pms_attr_attrgroup_relation.attr_id
     *
     * @mbg.generated
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_attrgroup_relation.attr_group_id
     *
     * @return the value of pms_attr_attrgroup_relation.attr_group_id
     *
     * @mbg.generated
     */
    public Long getAttrGroupId() {
        return attrGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_attrgroup_relation.attr_group_id
     *
     * @param attrGroupId the value for pms_attr_attrgroup_relation.attr_group_id
     *
     * @mbg.generated
     */
    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_attrgroup_relation.attr_sort
     *
     * @return the value of pms_attr_attrgroup_relation.attr_sort
     *
     * @mbg.generated
     */
    public Integer getAttrSort() {
        return attrSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_attrgroup_relation.attr_sort
     *
     * @param attrSort the value for pms_attr_attrgroup_relation.attr_sort
     *
     * @mbg.generated
     */
    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }
}