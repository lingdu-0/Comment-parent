package com.wb.travel.entity;

import java.io.Serializable;
import java.util.Date;

public class TogetherTravel implements Serializable {
    private Integer togetherTravelId;

    private String togetherTravelStartAddress;

    private String togetherTravelEndAddress;

    private Date togetherTravelStartDate;

    private Date togetherTravelEndDate;

    private Integer togetherTravelContactType;

    private String togetherTravelContactDetail;

    private Integer togetherTravelNumber;

    private Integer togetherTravelStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTogetherTravelId() {
        return togetherTravelId;
    }

    public void setTogetherTravelId(Integer togetherTravelId) {
        this.togetherTravelId = togetherTravelId;
    }

    public String getTogetherTravelStartAddress() {
        return togetherTravelStartAddress;
    }

    public void setTogetherTravelStartAddress(String togetherTravelStartAddress) {
        this.togetherTravelStartAddress = togetherTravelStartAddress == null ? null : togetherTravelStartAddress.trim();
    }

    public String getTogetherTravelEndAddress() {
        return togetherTravelEndAddress;
    }

    public void setTogetherTravelEndAddress(String togetherTravelEndAddress) {
        this.togetherTravelEndAddress = togetherTravelEndAddress == null ? null : togetherTravelEndAddress.trim();
    }

    public Date getTogetherTravelStartDate() {
        return togetherTravelStartDate;
    }

    public void setTogetherTravelStartDate(Date togetherTravelStartDate) {
        this.togetherTravelStartDate = togetherTravelStartDate;
    }

    public Date getTogetherTravelEndDate() {
        return togetherTravelEndDate;
    }

    public void setTogetherTravelEndDate(Date togetherTravelEndDate) {
        this.togetherTravelEndDate = togetherTravelEndDate;
    }

    public Integer getTogetherTravelContactType() {
        return togetherTravelContactType;
    }

    public void setTogetherTravelContactType(Integer togetherTravelContactType) {
        this.togetherTravelContactType = togetherTravelContactType;
    }

    public String getTogetherTravelContactDetail() {
        return togetherTravelContactDetail;
    }

    public void setTogetherTravelContactDetail(String togetherTravelContactDetail) {
        this.togetherTravelContactDetail = togetherTravelContactDetail == null ? null : togetherTravelContactDetail.trim();
    }

    public Integer getTogetherTravelNumber() {
        return togetherTravelNumber;
    }

    public void setTogetherTravelNumber(Integer togetherTravelNumber) {
        this.togetherTravelNumber = togetherTravelNumber;
    }

    public Integer getTogetherTravelStatus() {
        return togetherTravelStatus;
    }

    public void setTogetherTravelStatus(Integer togetherTravelStatus) {
        this.togetherTravelStatus = togetherTravelStatus;
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
        TogetherTravel other = (TogetherTravel) that;
        return (this.getTogetherTravelId() == null ? other.getTogetherTravelId() == null : this.getTogetherTravelId().equals(other.getTogetherTravelId()))
            && (this.getTogetherTravelStartAddress() == null ? other.getTogetherTravelStartAddress() == null : this.getTogetherTravelStartAddress().equals(other.getTogetherTravelStartAddress()))
            && (this.getTogetherTravelEndAddress() == null ? other.getTogetherTravelEndAddress() == null : this.getTogetherTravelEndAddress().equals(other.getTogetherTravelEndAddress()))
            && (this.getTogetherTravelStartDate() == null ? other.getTogetherTravelStartDate() == null : this.getTogetherTravelStartDate().equals(other.getTogetherTravelStartDate()))
            && (this.getTogetherTravelEndDate() == null ? other.getTogetherTravelEndDate() == null : this.getTogetherTravelEndDate().equals(other.getTogetherTravelEndDate()))
            && (this.getTogetherTravelContactType() == null ? other.getTogetherTravelContactType() == null : this.getTogetherTravelContactType().equals(other.getTogetherTravelContactType()))
            && (this.getTogetherTravelContactDetail() == null ? other.getTogetherTravelContactDetail() == null : this.getTogetherTravelContactDetail().equals(other.getTogetherTravelContactDetail()))
            && (this.getTogetherTravelNumber() == null ? other.getTogetherTravelNumber() == null : this.getTogetherTravelNumber().equals(other.getTogetherTravelNumber()))
            && (this.getTogetherTravelStatus() == null ? other.getTogetherTravelStatus() == null : this.getTogetherTravelStatus().equals(other.getTogetherTravelStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTogetherTravelId() == null) ? 0 : getTogetherTravelId().hashCode());
        result = prime * result + ((getTogetherTravelStartAddress() == null) ? 0 : getTogetherTravelStartAddress().hashCode());
        result = prime * result + ((getTogetherTravelEndAddress() == null) ? 0 : getTogetherTravelEndAddress().hashCode());
        result = prime * result + ((getTogetherTravelStartDate() == null) ? 0 : getTogetherTravelStartDate().hashCode());
        result = prime * result + ((getTogetherTravelEndDate() == null) ? 0 : getTogetherTravelEndDate().hashCode());
        result = prime * result + ((getTogetherTravelContactType() == null) ? 0 : getTogetherTravelContactType().hashCode());
        result = prime * result + ((getTogetherTravelContactDetail() == null) ? 0 : getTogetherTravelContactDetail().hashCode());
        result = prime * result + ((getTogetherTravelNumber() == null) ? 0 : getTogetherTravelNumber().hashCode());
        result = prime * result + ((getTogetherTravelStatus() == null) ? 0 : getTogetherTravelStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", togetherTravelId=").append(togetherTravelId);
        sb.append(", togetherTravelStartAddress=").append(togetherTravelStartAddress);
        sb.append(", togetherTravelEndAddress=").append(togetherTravelEndAddress);
        sb.append(", togetherTravelStartDate=").append(togetherTravelStartDate);
        sb.append(", togetherTravelEndDate=").append(togetherTravelEndDate);
        sb.append(", togetherTravelContactType=").append(togetherTravelContactType);
        sb.append(", togetherTravelContactDetail=").append(togetherTravelContactDetail);
        sb.append(", togetherTravelNumber=").append(togetherTravelNumber);
        sb.append(", togetherTravelStatus=").append(togetherTravelStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}