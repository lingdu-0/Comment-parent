package com.wb.travel.entity;

import java.io.Serializable;

public class TogetherTravelWithBLOBs extends TogetherTravel implements Serializable {
    private String togetherTravelTitle;

    private String togetherTravelDetail;

    private static final long serialVersionUID = 1L;

    public String getTogetherTravelTitle() {
        return togetherTravelTitle;
    }

    public void setTogetherTravelTitle(String togetherTravelTitle) {
        this.togetherTravelTitle = togetherTravelTitle == null ? null : togetherTravelTitle.trim();
    }

    public String getTogetherTravelDetail() {
        return togetherTravelDetail;
    }

    public void setTogetherTravelDetail(String togetherTravelDetail) {
        this.togetherTravelDetail = togetherTravelDetail == null ? null : togetherTravelDetail.trim();
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
        TogetherTravelWithBLOBs other = (TogetherTravelWithBLOBs) that;
        return (this.getTogetherTravelId() == null ? other.getTogetherTravelId() == null : this.getTogetherTravelId().equals(other.getTogetherTravelId()))
            && (this.getTogetherTravelStartAddress() == null ? other.getTogetherTravelStartAddress() == null : this.getTogetherTravelStartAddress().equals(other.getTogetherTravelStartAddress()))
            && (this.getTogetherTravelEndAddress() == null ? other.getTogetherTravelEndAddress() == null : this.getTogetherTravelEndAddress().equals(other.getTogetherTravelEndAddress()))
            && (this.getTogetherTravelStartDate() == null ? other.getTogetherTravelStartDate() == null : this.getTogetherTravelStartDate().equals(other.getTogetherTravelStartDate()))
            && (this.getTogetherTravelEndDate() == null ? other.getTogetherTravelEndDate() == null : this.getTogetherTravelEndDate().equals(other.getTogetherTravelEndDate()))
            && (this.getTogetherTravelContactType() == null ? other.getTogetherTravelContactType() == null : this.getTogetherTravelContactType().equals(other.getTogetherTravelContactType()))
            && (this.getTogetherTravelContactDetail() == null ? other.getTogetherTravelContactDetail() == null : this.getTogetherTravelContactDetail().equals(other.getTogetherTravelContactDetail()))
            && (this.getTogetherTravelNumber() == null ? other.getTogetherTravelNumber() == null : this.getTogetherTravelNumber().equals(other.getTogetherTravelNumber()))
            && (this.getTogetherTravelStatus() == null ? other.getTogetherTravelStatus() == null : this.getTogetherTravelStatus().equals(other.getTogetherTravelStatus()))
            && (this.getTogetherTravelTitle() == null ? other.getTogetherTravelTitle() == null : this.getTogetherTravelTitle().equals(other.getTogetherTravelTitle()))
            && (this.getTogetherTravelDetail() == null ? other.getTogetherTravelDetail() == null : this.getTogetherTravelDetail().equals(other.getTogetherTravelDetail()));
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
        result = prime * result + ((getTogetherTravelTitle() == null) ? 0 : getTogetherTravelTitle().hashCode());
        result = prime * result + ((getTogetherTravelDetail() == null) ? 0 : getTogetherTravelDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", togetherTravelTitle=").append(togetherTravelTitle);
        sb.append(", togetherTravelDetail=").append(togetherTravelDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}