package com.problems.demo.cases.dao;

import com.problems.demo.cases.model.IcCase;
import com.problems.demo.cases.model.IcCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcCaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int countByExample(IcCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int deleteByExample(IcCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int insert(IcCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int insertSelective(IcCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    List<IcCase> selectByExample(IcCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    IcCase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IcCase record, @Param("example") IcCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IcCase record, @Param("example") IcCaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IcCase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_case
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IcCase record);
}