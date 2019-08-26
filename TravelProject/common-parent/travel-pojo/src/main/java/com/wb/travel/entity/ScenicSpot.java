package com.wb.travel.entity;

import java.io.Serializable;

public class ScenicSpot implements Serializable {
    private Integer scenicSpotId;

    private String scenicSpotName;

    private Integer scenicSpotGrade;

    private String scenicSpotAddress;

    private String scenicSpotTel;

    private String scenicSpotDate;

    private static final long serialVersionUID = 1L;

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public String getScenicSpotName() {
        return scenicSpotName;
    }

    public void setScenicSpotName(String scenicSpotName) {
        this.scenicSpotName = scenicSpotName == null ? null : scenicSpotName.trim();
    }

    public Integer getScenicSpotGrade() {
        return scenicSpotGrade;
    }

    public void setScenicSpotGrade(Integer scenicSpotGrade) {
        this.scenicSpotGrade = scenicSpotGrade;
    }

    public String getScenicSpotAddress() {
        return scenicSpotAddress;
    }

    public void setScenicSpotAddress(String scenicSpotAddress) {
        this.scenicSpotAddress = scenicSpotAddress == null ? null : scenicSpotAddress.trim();
    }

    public String getScenicSpotTel() {
        return scenicSpotTel;
    }

    public void setScenicSpotTel(String scenicSpotTel) {
        this.scenicSpotTel = scenicSpotTel == null ? null : scenicSpotTel.trim();
    }

    public String getScenicSpotDate() {
        return scenicSpotDate;
    }

    public void setScenicSpotDate(String scenicSpotDate) {
        this.scenicSpotDate = scenicSpotDate == null ? null : scenicSpotDate.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScenicSpot other = (ScenicSpot) that;
        return (this.getScenicSpotId() == null ? other.getScenicSpotId() == null : this.getScenicSpotId().equals(other.getScenicSpotId()))
            && (this.getScenicSpotName() == null ? other.getScenicSpotName() == null : this.getScenicSpotName().equals(other.getScenicSpotName()))
            && (this.getScenicSpotGrade() == null ? other.getScenicSpotGrade() == null : this.getScenicSpotGrade().equals(other.getScenicSpotGrade()))
            && (this.getScenicSpotAddress() == null ? other.getScenicSpotAddress() == null : this.getScenicSpotAddress().equals(other.getScenicSpotAddress()))
            && (this.getScenicSpotTel() == null ? other.getScenicSpotTel() == null : this.getScenicSpotTel().equals(other.getScenicSpotTel()))
            && (this.getScenicSpotDate() == null ? other.getScenicSpotDate() == null : this.getScenicSpotDate().equals(other.getScenicSpotDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScenicSpotId() == null) ? 0 : getScenicSpotId().hashCode());
        result = prime * result + ((getScenicSpotName() == null) ? 0 : getScenicSpotName().hashCode());
        result = prime * result + ((getScenicSpotGrade() == null) ? 0 : getScenicSpotGrade().hashCode());
        result = prime * result + ((getScenicSpotAddress() == null) ? 0 : getScenicSpotAddress().hashCode());
        result = prime * result + ((getScenicSpotTel() == null) ? 0 : getScenicSpotTel().hashCode());
        result = prime * result + ((getScenicSpotDate() == null) ? 0 : getScenicSpotDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicSpotId=").append(scenicSpotId);
        sb.append(", scenicSpotName=").append(scenicSpotName);
        sb.append(", scenicSpotGrade=").append(scenicSpotGrade);
        sb.append(", scenicSpotAddress=").append(scenicSpotAddress);
        sb.append(", scenicSpotTel=").append(scenicSpotTel);
        sb.append(", scenicSpotDate=").append(scenicSpotDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}