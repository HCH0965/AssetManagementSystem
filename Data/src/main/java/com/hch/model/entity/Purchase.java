package com.hch.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {
    private Integer id;

    private String assetId;

    private String assetName;

    private String price;

    private Integer number;

    private String totalprice;

    private String manufacturer;

    private String applicant;

    private Date applyTime;

    private Integer state;

    private String department;

    private String consenter;

    private Date agreedTime;

    private Date purchaseTime;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
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

    public Date getAgreedTime() {
        return agreedTime;
    }

    public void setAgreedTime(Date agreedTime) {
        this.agreedTime = agreedTime;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
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
        sb.append(", manufacturer=").append(manufacturer);
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