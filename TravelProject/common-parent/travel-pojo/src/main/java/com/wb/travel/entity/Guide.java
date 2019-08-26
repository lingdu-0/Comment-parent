package com.wb.travel.entity;

import java.io.Serializable;
import java.util.Date;

public class Guide implements Serializable {
    private Integer guideId;

    private String guideName;

    private Integer guideSex;

    private Date guideBrithday;

    private String guideAddress;

    private String guideCity;

    private Double guideYear;

    private Integer guideIdentity;

    private Integer guideIscar;

    private String guideTel;

    private String guideQq;

    private String guideWeixin;

    private String guideEmil;

    private String guideUrl;

    private static final long serialVersionUID = 1L;

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName == null ? null : guideName.trim();
    }

    public Integer getGuideSex() {
        return guideSex;
    }

    public void setGuideSex(Integer guideSex) {
        this.guideSex = guideSex;
    }

    public Date getGuideBrithday() {
        return guideBrithday;
    }

    public void setGuideBrithday(Date guideBrithday) {
        this.guideBrithday = guideBrithday;
    }

    public String getGuideAddress() {
        return guideAddress;
    }

    public void setGuideAddress(String guideAddress) {
        this.guideAddress = guideAddress == null ? null : guideAddress.trim();
    }

    public String getGuideCity() {
        return guideCity;
    }

    public void setGuideCity(String guideCity) {
        this.guideCity = guideCity == null ? null : guideCity.trim();
    }

    public Double getGuideYear() {
        return guideYear;
    }

    public void setGuideYear(Double guideYear) {
        this.guideYear = guideYear;
    }

    public Integer getGuideIdentity() {
        return guideIdentity;
    }

    public void setGuideIdentity(Integer guideIdentity) {
        this.guideIdentity = guideIdentity;
    }

    public Integer getGuideIscar() {
        return guideIscar;
    }

    public void setGuideIscar(Integer guideIscar) {
        this.guideIscar = guideIscar;
    }

    public String getGuideTel() {
        return guideTel;
    }

    public void setGuideTel(String guideTel) {
        this.guideTel = guideTel == null ? null : guideTel.trim();
    }

    public String getGuideQq() {
        return guideQq;
    }

    public void setGuideQq(String guideQq) {
        this.guideQq = guideQq == null ? null : guideQq.trim();
    }

    public String getGuideWeixin() {
        return guideWeixin;
    }

    public void setGuideWeixin(String guideWeixin) {
        this.guideWeixin = guideWeixin == null ? null : guideWeixin.trim();
    }

    public String getGuideEmil() {
        return guideEmil;
    }

    public void setGuideEmil(String guideEmil) {
        this.guideEmil = guideEmil == null ? null : guideEmil.trim();
    }

    public String getGuideUrl() {
        return guideUrl;
    }

    public void setGuideUrl(String guideUrl) {
        this.guideUrl = guideUrl == null ? null : guideUrl.trim();
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
        Guide other = (Guide) that;
        return (this.getGuideId() == null ? other.getGuideId() == null : this.getGuideId().equals(other.getGuideId()))
            && (this.getGuideName() == null ? other.getGuideName() == null : this.getGuideName().equals(other.getGuideName()))
            && (this.getGuideSex() == null ? other.getGuideSex() == null : this.getGuideSex().equals(other.getGuideSex()))
            && (this.getGuideBrithday() == null ? other.getGuideBrithday() == null : this.getGuideBrithday().equals(other.getGuideBrithday()))
            && (this.getGuideAddress() == null ? other.getGuideAddress() == null : this.getGuideAddress().equals(other.getGuideAddress()))
            && (this.getGuideCity() == null ? other.getGuideCity() == null : this.getGuideCity().equals(other.getGuideCity()))
            && (this.getGuideYear() == null ? other.getGuideYear() == null : this.getGuideYear().equals(other.getGuideYear()))
            && (this.getGuideIdentity() == null ? other.getGuideIdentity() == null : this.getGuideIdentity().equals(other.getGuideIdentity()))
            && (this.getGuideIscar() == null ? other.getGuideIscar() == null : this.getGuideIscar().equals(other.getGuideIscar()))
            && (this.getGuideTel() == null ? other.getGuideTel() == null : this.getGuideTel().equals(other.getGuideTel()))
            && (this.getGuideQq() == null ? other.getGuideQq() == null : this.getGuideQq().equals(other.getGuideQq()))
            && (this.getGuideWeixin() == null ? other.getGuideWeixin() == null : this.getGuideWeixin().equals(other.getGuideWeixin()))
            && (this.getGuideEmil() == null ? other.getGuideEmil() == null : this.getGuideEmil().equals(other.getGuideEmil()))
            && (this.getGuideUrl() == null ? other.getGuideUrl() == null : this.getGuideUrl().equals(other.getGuideUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGuideId() == null) ? 0 : getGuideId().hashCode());
        result = prime * result + ((getGuideName() == null) ? 0 : getGuideName().hashCode());
        result = prime * result + ((getGuideSex() == null) ? 0 : getGuideSex().hashCode());
        result = prime * result + ((getGuideBrithday() == null) ? 0 : getGuideBrithday().hashCode());
        result = prime * result + ((getGuideAddress() == null) ? 0 : getGuideAddress().hashCode());
        result = prime * result + ((getGuideCity() == null) ? 0 : getGuideCity().hashCode());
        result = prime * result + ((getGuideYear() == null) ? 0 : getGuideYear().hashCode());
        result = prime * result + ((getGuideIdentity() == null) ? 0 : getGuideIdentity().hashCode());
        result = prime * result + ((getGuideIscar() == null) ? 0 : getGuideIscar().hashCode());
        result = prime * result + ((getGuideTel() == null) ? 0 : getGuideTel().hashCode());
        result = prime * result + ((getGuideQq() == null) ? 0 : getGuideQq().hashCode());
        result = prime * result + ((getGuideWeixin() == null) ? 0 : getGuideWeixin().hashCode());
        result = prime * result + ((getGuideEmil() == null) ? 0 : getGuideEmil().hashCode());
        result = prime * result + ((getGuideUrl() == null) ? 0 : getGuideUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", guideId=").append(guideId);
        sb.append(", guideName=").append(guideName);
        sb.append(", guideSex=").append(guideSex);
        sb.append(", guideBrithday=").append(guideBrithday);
        sb.append(", guideAddress=").append(guideAddress);
        sb.append(", guideCity=").append(guideCity);
        sb.append(", guideYear=").append(guideYear);
        sb.append(", guideIdentity=").append(guideIdentity);
        sb.append(", guideIscar=").append(guideIscar);
        sb.append(", guideTel=").append(guideTel);
        sb.append(", guideQq=").append(guideQq);
        sb.append(", guideWeixin=").append(guideWeixin);
        sb.append(", guideEmil=").append(guideEmil);
        sb.append(", guideUrl=").append(guideUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}