package com.hch.model.entity;

import java.io.Serializable;
import java.util.Date;

public class ScrapApply implements Serializable {
    private Integer id;

    private String assetId;

    private String assetName;

    private String manufacturer;

    private Integer number;

    private Integer status;

    private String applicant;

    private Date applyTime;

    private String approver;

    private Date approveTime;

    private String executor;

    private Date executeTime;

    private Date timestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", assetId=").append(assetId);
        sb.append(", assetName=").append(assetName);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", number=").append(number);
        sb.append(", status=").append(status);
        sb.append(", applicant=").append(applicant);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", approver=").append(approver);
        sb.append(", approveTime=").append(approveTime);
        sb.append(", executor=").append(executor);
        sb.append(", executeTime=").append(executeTime);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}