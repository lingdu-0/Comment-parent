package com.wb.travel.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer orderId;

    private Date orderBegin;

    private Date orderEnd;

    private Integer adultNumber;

    private Integer childNumber;

    private String orderCity;

    private Integer serviceType;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderBegin() {
        return orderBegin;
    }

    public void setOrderBegin(Date orderBegin) {
        this.orderBegin = orderBegin;
    }

    public Date getOrderEnd() {
        return orderEnd;
    }

    public void setOrderEnd(Date orderEnd) {
        this.orderEnd = orderEnd;
    }

    public Integer getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(Integer adultNumber) {
        this.adultNumber = adultNumber;
    }

    public Integer getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(Integer childNumber) {
        this.childNumber = childNumber;
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity == null ? null : orderCity.trim();
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderBegin() == null ? other.getOrderBegin() == null : this.getOrderBegin().equals(other.getOrderBegin()))
            && (this.getOrderEnd() == null ? other.getOrderEnd() == null : this.getOrderEnd().equals(other.getOrderEnd()))
            && (this.getAdultNumber() == null ? other.getAdultNumber() == null : this.getAdultNumber().equals(other.getAdultNumber()))
            && (this.getChildNumber() == null ? other.getChildNumber() == null : this.getChildNumber().equals(other.getChildNumber()))
            && (this.getOrderCity() == null ? other.getOrderCity() == null : this.getOrderCity().equals(other.getOrderCity()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderBegin() == null) ? 0 : getOrderBegin().hashCode());
        result = prime * result + ((getOrderEnd() == null) ? 0 : getOrderEnd().hashCode());
        result = prime * result + ((getAdultNumber() == null) ? 0 : getAdultNumber().hashCode());
        result = prime * result + ((getChildNumber() == null) ? 0 : getChildNumber().hashCode());
        result = prime * result + ((getOrderCity() == null) ? 0 : getOrderCity().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderBegin=").append(orderBegin);
        sb.append(", orderEnd=").append(orderEnd);
        sb.append(", adultNumber=").append(adultNumber);
        sb.append(", childNumber=").append(childNumber);
        sb.append(", orderCity=").append(orderCity);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}