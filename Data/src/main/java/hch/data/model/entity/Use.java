package hch.data.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Use implements Serializable {
    private Long id;

    private String assetId;

    private String assetName;

    private Long number;

    private String applicant;

    private String applyTime;

    private Long state;

    private String consenter;

    private String agreedTime;

    private String useTime;

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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
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