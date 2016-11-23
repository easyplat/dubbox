package com.telecomjs.entities;

import java.io.Serializable;
import java.util.Date;

public class EopAppPermission implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.APP_ID
     *
     * @mbggenerated
     */
    private Long appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.OBJECT_NAME
     *
     * @mbggenerated
     */
    private String objectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.ACTION_NAME
     *
     * @mbggenerated
     */
    private String actionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.REGION_CODE
     *
     * @mbggenerated
     */
    private String regionCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.STATE
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EOP_APP_PERMISSION.STATE_DATE
     *
     * @mbggenerated
     */
    private Date stateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.APP_ID
     *
     * @return the value of EOP_APP_PERMISSION.APP_ID
     *
     * @mbggenerated
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.APP_ID
     *
     * @param appId the value for EOP_APP_PERMISSION.APP_ID
     *
     * @mbggenerated
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.OBJECT_NAME
     *
     * @return the value of EOP_APP_PERMISSION.OBJECT_NAME
     *
     * @mbggenerated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.OBJECT_NAME
     *
     * @param objectName the value for EOP_APP_PERMISSION.OBJECT_NAME
     *
     * @mbggenerated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.ACTION_NAME
     *
     * @return the value of EOP_APP_PERMISSION.ACTION_NAME
     *
     * @mbggenerated
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.ACTION_NAME
     *
     * @param actionName the value for EOP_APP_PERMISSION.ACTION_NAME
     *
     * @mbggenerated
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.REGION_CODE
     *
     * @return the value of EOP_APP_PERMISSION.REGION_CODE
     *
     * @mbggenerated
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.REGION_CODE
     *
     * @param regionCode the value for EOP_APP_PERMISSION.REGION_CODE
     *
     * @mbggenerated
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.STATE
     *
     * @return the value of EOP_APP_PERMISSION.STATE
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.STATE
     *
     * @param state the value for EOP_APP_PERMISSION.STATE
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.CREATE_DATE
     *
     * @return the value of EOP_APP_PERMISSION.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.CREATE_DATE
     *
     * @param createDate the value for EOP_APP_PERMISSION.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EOP_APP_PERMISSION.STATE_DATE
     *
     * @return the value of EOP_APP_PERMISSION.STATE_DATE
     *
     * @mbggenerated
     */
    public Date getStateDate() {
        return stateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EOP_APP_PERMISSION.STATE_DATE
     *
     * @param stateDate the value for EOP_APP_PERMISSION.STATE_DATE
     *
     * @mbggenerated
     */
    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }
}