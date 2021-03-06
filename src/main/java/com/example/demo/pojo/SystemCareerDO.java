package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table system_career
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SystemCareerDO implements Serializable {
    /**
     */
    private Integer id;

    /**
     *
     */
    private Integer mechId;

    /**
     *
     */
    private Integer type;

    /**
     * Database Column Remarks:
     *   危害因素
     */
    private String name;

    /**
     * Database Column Remarks:
     *   标准值
     */
    private String value;

    /**
     * Database Column Remarks:
     *   单位
     */
    private String unit;

    /**
     * Database Column Remarks:
     *   系统表示(0未认证 1 认证 2认证未过 )
     *
     */
    private Boolean isCert;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    private Date gmtCreate;

    /**
     *   修改时间
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *   操作人id
     */
    private Integer opId;

    /**
     * Database Column Remarks:
     *   操作人
     *
     * @mbg.generated
     */
    private String opName;

    /**
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getMechId() {
        return mechId;
    }


    public void setMechId(Integer mechId) {
        this.mechId = mechId;
    }


    public Integer getType() {
        return type;
    }


    public void setType(Integer type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }


    public String getUnit() {
        return unit;
    }


    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }


    public Boolean getIsCert() {
        return isCert;
    }


    public void setIsCert(Boolean isCert) {
        this.isCert = isCert;
    }


    public Date getGmtCreate() {
        return gmtCreate;
    }


    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    public Date getGmtModified() {
        return gmtModified;
    }


    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }


    public Integer getOpId() {
        return opId;
    }


    public void setOpId(Integer opId) {
        this.opId = opId;
    }


    public String getOpName() {
        return opName;
    }


    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mechId=").append(mechId);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", unit=").append(unit);
        sb.append(", isCert=").append(isCert);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", opId=").append(opId);
        sb.append(", opName=").append(opName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}