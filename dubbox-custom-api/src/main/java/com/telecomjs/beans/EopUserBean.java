package com.telecomjs.beans;

import java.io.Serializable;
import java.util.Date;

public class EopUserBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_USER.USER_ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_USER.USER_NAME
     *
     * @mbggenerated®
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_USER.USER_PASSWORD
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_USER.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_USER.USER_TYPE
     *
     * @mbggenerated
     */
    private Short userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_USER.USER_ID
     *
     * @return the value of EOP_USER.USER_ID
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_USER.USER_ID
     *
     * @param userId the value for EOP_USER.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_USER.USER_NAME
     *
     * @return the value of EOP_USER.USER_NAME
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_USER.USER_NAME
     *
     * @param userName the value for EOP_USER.USER_NAME
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_USER.USER_PASSWORD
     *
     * @return the value of EOP_USER.USER_PASSWORD
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_USER.USER_PASSWORD
     *
     * @param userPassword the value for EOP_USER.USER_PASSWORD
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_USER.CREATE_DATE
     *
     * @return the value of EOP_USER.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_USER.CREATE_DATE
     *
     * @param createDate the value for EOP_USER.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_USER.USER_TYPE
     *
     * @return the value of EOP_USER.USER_TYPE
     *
     * @mbggenerated
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_USER.USER_TYPE
     *
     * @param userType the value for EOP_USER.USER_TYPE
     *
     * @mbggenerated
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }
}