package com.wb.travel.entity;

import java.io.Serializable;

public class ScenicSpotWithBLOBs extends ScenicSpot implements Serializable {
    private String scenicSpotTicketInfo;

    private String scenicSpotInfo;

    private static final long serialVersionUID = 1L;

    public String getScenicSpotTicketInfo() {
        return scenicSpotTicketInfo;
    }

    public void setScenicSpotTicketInfo(String scenicSpotTicketInfo) {
        this.scenicSpotTicketInfo = scenicSpotTicketInfo == null ? null : scenicSpotTicketInfo.trim();
    }

    public String getScenicSpotInfo() {
        return scenicSpotInfo;
    }

    public void setScenicSpotInfo(String scenicSpotInfo) {
        this.scenicSpotInfo = scenicSpotInfo == null ? null : scenicSpotInfo.trim();
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
        ScenicSpotWithBLOBs other = (ScenicSpotWithBLOBs) that;
        return (this.getScenicSpotId() == null ? other.getScenicSpotId() == null : this.getScenicSpotId().equals(other.getScenicSpotId()))
            && (this.getScenicSpotName() == null ? other.getScenicSpotName() == null : this.getScenicSpotName().equals(other.getScenicSpotName()))
            && (this.getScenicSpotGrade() == null ? other.getScenicSpotGrade() == null : this.getScenicSpotGrade().equals(other.getScenicSpotGrade()))
            && (this.getScenicSpotAddress() == null ? other.getScenicSpotAddress() == null : this.getScenicSpotAddress().equals(other.getScenicSpotAddress()))
            && (this.getScenicSpotTel() == null ? other.getScenicSpotTel() == null : this.getScenicSpotTel().equals(other.getScenicSpotTel()))
            && (this.getScenicSpotDate() == null ? other.getScenicSpotDate() == null : this.getScenicSpotDate().equals(other.getScenicSpotDate()))
            && (this.getScenicSpotTicketInfo() == null ? other.getScenicSpotTicketInfo() == null : this.getScenicSpotTicketInfo().equals(other.getScenicSpotTicketInfo()))
            && (this.getScenicSpotInfo() == null ? other.getScenicSpotInfo() == null : this.getScenicSpotInfo().equals(other.getScenicSpotInfo()));
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
        result = prime * result + ((getScenicSpotTicketInfo() == null) ? 0 : getScenicSpotTicketInfo().hashCode());
        result = prime * result + ((getScenicSpotInfo() == null) ? 0 : getScenicSpotInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicSpotTicketInfo=").append(scenicSpotTicketInfo);
        sb.append(", scenicSpotInfo=").append(scenicSpotInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}