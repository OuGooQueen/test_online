package org.motest.admin.entity;

import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * InnoDB free: 587776 kB; (`id`) REFER `jeecg/t_s_base_user`(`
 * </p>
 *
 * @author Terry
 * @since 2018-05-10
 */
public class TSUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    @TableField("mobilePhone")
    private String mobilePhone;
    /**
     * 办公座机
     */
    @TableField("officePhone")
    private String officePhone;
    /**
     * 签名文件
     */
    @TableField("signatureFile")
    private String signatureFile;
    /**
     * 修改人
     */
    private String updateName;
    /**
     * 修改时间
     */
    private Date updateDate;
    /**
     * 修改人id
     */
    private String updateBy;
    /**
     * 创建人
     */
    private String createName;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 创建人id
     */
    private String createBy;
    private String portrait;
    private String imsign;
    /**
     * 开发权限标志
     */
    private String devFlag;
    /**
     * 设备唯一id
     */
    @TableField("registrationID")
    private String registrationID;
    /**
     * 手机型号
     */
    private String phoneModel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getSignatureFile() {
        return signatureFile;
    }

    public void setSignatureFile(String signatureFile) {
        this.signatureFile = signatureFile;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getImsign() {
        return imsign;
    }

    public void setImsign(String imsign) {
        this.imsign = imsign;
    }

    public String getDevFlag() {
        return devFlag;
    }

    public void setDevFlag(String devFlag) {
        this.devFlag = devFlag;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    @Override
    public String toString() {
        return "TSUser{" +
        ", id=" + id +
        ", email=" + email +
        ", mobilePhone=" + mobilePhone +
        ", officePhone=" + officePhone +
        ", signatureFile=" + signatureFile +
        ", updateName=" + updateName +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", portrait=" + portrait +
        ", imsign=" + imsign +
        ", devFlag=" + devFlag +
        ", registrationID=" + registrationID +
        ", phoneModel=" + phoneModel +
        "}";
    }
}
