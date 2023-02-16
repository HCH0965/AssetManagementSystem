package com.hch.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {
    private Long id;

    private String assetId;

    private String assetName;

    private String price;

    private Long number;

    private String totalprice;

    private String applicant;

    private String applyTime;

    private Long state;

    private String department;

    private String consenter;

    private String agreedTime;

    private String purchaseTime;

    private Date timestamp;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getConsenter() {
        return consenter;
    }

    public void setConsenter(String consenter) {
        this.consenter = consenter;
    }

    public String getAgreedTime() {
        return agreedTime;
    }

    public void setAgreedTime(String agreedTime) {
        this.agreedTime = agreedTime;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
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
        sb.append(", price=").append(price);
        sb.append(", number=").append(number);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", applicant=").append(applicant);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", state=").append(state);
        sb.append(", department=").append(department);
        sb.append(", consenter=").append(consenter);
        sb.append(", agreedTime=").append(agreedTime);
        sb.append(", purchaseTime=").append(purchaseTime);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}