package com.hch.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Use implements Serializable {
    private Integer id;

    private String assetId;

    private String assetName;

    private Integer number;

    private String manufacturer;

    private String applicant;

    private Date applyTime;

    private Integer state;

    private String consenter;

    private Date agreedTime;

    private Date useTime;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getConsenter() {
        return consenter;
    }

    public void setConsenter(String consenter) {
        this.consenter = consenter;
    }

    public Date getAgreedTime() {
        return agreedTime;
    }

    public void setAgreedTime(Date agreedTime) {
        this.agreedTime = agreedTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
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
        sb.append(", number=").append(number);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", applicant=").append(applicant);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", state=").append(state);
        sb.append(", consenter=").append(consenter);
        sb.append(", agreedTime=").append(agreedTime);
        sb.append(", useTime=").append(useTime);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}