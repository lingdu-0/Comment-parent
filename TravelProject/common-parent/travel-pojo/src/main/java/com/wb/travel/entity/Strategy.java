package com.wb.travel.entity;

import java.io.Serializable;

public class Strategy implements Serializable {
    private Integer strategyId;

    private String strategyTitle;

    private String strategyType;

    private String strategyAddress;

    private String strategyText;

    private static final long serialVersionUID = 1L;

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public String getStrategyTitle() {
        return strategyTitle;
    }

    public void setStrategyTitle(String strategyTitle) {
        this.strategyTitle = strategyTitle == null ? null : strategyTitle.trim();
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType == null ? null : strategyType.trim();
    }

    public String getStrategyAddress() {
        return strategyAddress;
    }

    public void setStrategyAddress(String strategyAddress) {
        this.strategyAddress = strategyAddress == null ? null : strategyAddress.trim();
    }

    public String getStrategyText() {
        return strategyText;
    }

    public void setStrategyText(String strategyText) {
        this.strategyText = strategyText == null ? null : strategyText.trim();
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
        Strategy other = (Strategy) that;
        return (this.getStrategyId() == null ? other.getStrategyId() == null : this.getStrategyId().equals(other.getStrategyId()))
            && (this.getStrategyTitle() == null ? other.getStrategyTitle() == null : this.getStrategyTitle().equals(other.getStrategyTitle()))
            && (this.getStrategyType() == null ? other.getStrategyType() == null : this.getStrategyType().equals(other.getStrategyType()))
            && (this.getStrategyAddress() == null ? other.getStrategyAddress() == null : this.getStrategyAddress().equals(other.getStrategyAddress()))
            && (this.getStrategyText() == null ? other.getStrategyText() == null : this.getStrategyText().equals(other.getStrategyText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStrategyId() == null) ? 0 : getStrategyId().hashCode());
        result = prime * result + ((getStrategyTitle() == null) ? 0 : getStrategyTitle().hashCode());
        result = prime * result + ((getStrategyType() == null) ? 0 : getStrategyType().hashCode());
        result = prime * result + ((getStrategyAddress() == null) ? 0 : getStrategyAddress().hashCode());
        result = prime * result + ((getStrategyText() == null) ? 0 : getStrategyText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", strategyId=").append(strategyId);
        sb.append(", strategyTitle=").append(strategyTitle);
        sb.append(", strategyType=").append(strategyType);
        sb.append(", strategyAddress=").append(strategyAddress);
        sb.append(", strategyText=").append(strategyText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}