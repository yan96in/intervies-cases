package com.problems.demo.cases.model;

public class IcCase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_case.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_case.case_name
     *
     * @mbggenerated
     */
    private String caseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_case.case_content
     *
     * @mbggenerated
     */
    private String caseContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_case.case_type
     *
     * @mbggenerated
     */
    private Integer caseType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_case.interview_count
     *
     * @mbggenerated
     */
    private Integer interviewCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_case.id
     *
     * @return the value of ic_case.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_case.id
     *
     * @param id the value for ic_case.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_case.case_name
     *
     * @return the value of ic_case.case_name
     *
     * @mbggenerated
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_case.case_name
     *
     * @param caseName the value for ic_case.case_name
     *
     * @mbggenerated
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_case.case_content
     *
     * @return the value of ic_case.case_content
     *
     * @mbggenerated
     */
    public String getCaseContent() {
        return caseContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_case.case_content
     *
     * @param caseContent the value for ic_case.case_content
     *
     * @mbggenerated
     */
    public void setCaseContent(String caseContent) {
        this.caseContent = caseContent == null ? null : caseContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_case.case_type
     *
     * @return the value of ic_case.case_type
     *
     * @mbggenerated
     */
    public Integer getCaseType() {
        return caseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_case.case_type
     *
     * @param caseType the value for ic_case.case_type
     *
     * @mbggenerated
     */
    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_case.interview_count
     *
     * @return the value of ic_case.interview_count
     *
     * @mbggenerated
     */
    public Integer getInterviewCount() {
        return interviewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_case.interview_count
     *
     * @param interviewCount the value for ic_case.interview_count
     *
     * @mbggenerated
     */
    public void setInterviewCount(Integer interviewCount) {
        this.interviewCount = interviewCount;
    }
}