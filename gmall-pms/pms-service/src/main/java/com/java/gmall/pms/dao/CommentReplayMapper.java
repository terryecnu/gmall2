package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.CommentReplay;

public interface CommentReplayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    int insert(CommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    int insertSelective(CommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    CommentReplay selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CommentReplay record);
}