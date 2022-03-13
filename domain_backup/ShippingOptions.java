package com.demo.spring.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "ShippingOptions.findAll", query = "select o from ShippingOptions o") })
@Table(name = "SHIPPING_OPTIONS")
public class ShippingOptions implements Serializable {
    private static final long serialVersionUID = 630466872783307687L;
    @Column(name = "COST_PER_CLASS1_ITEM", nullable = false)
    private Integer costPerClass1Item;
    @Column(name = "COST_PER_CLASS2_ITEM", nullable = false)
    private Integer costPerClass2Item;
    @Column(name = "COST_PER_CLASS3_ITEM", nullable = false)
    private Integer costPerClass3Item;
    @Column(name = "COUNTRY_CODE", length = 2)
    private String countryCode;
    @Column(name = "FREE_SHIPPING_ALLOWED_FLAG", length = 1)
    private String freeShippingAllowedFlag;
    @Column(name = "SHIPPING_METHOD", nullable = false, length = 100)
    private String shippingMethod;
    @Column(name = "SHIPPING_OPTION_ID", nullable = false)
    private Long shippingOptionId;

    public ShippingOptions() {
    }

    public ShippingOptions(Integer costPerClass1Item, Integer costPerClass2Item, Integer costPerClass3Item,
                           String countryCode, String freeShippingAllowedFlag, String shippingMethod,
                           Long shippingOptionId) {
        this.costPerClass1Item = costPerClass1Item;
        this.costPerClass2Item = costPerClass2Item;
        this.costPerClass3Item = costPerClass3Item;
        this.countryCode = countryCode;
        this.freeShippingAllowedFlag = freeShippingAllowedFlag;
        this.shippingMethod = shippingMethod;
        this.shippingOptionId = shippingOptionId;
    }


    public Integer getCostPerClass1Item() {
        return costPerClass1Item;
    }

    public void setCostPerClass1Item(Integer costPerClass1Item) {
        this.costPerClass1Item = costPerClass1Item;
    }

    public Integer getCostPerClass2Item() {
        return costPerClass2Item;
    }

    public void setCostPerClass2Item(Integer costPerClass2Item) {
        this.costPerClass2Item = costPerClass2Item;
    }

    public Integer getCostPerClass3Item() {
        return costPerClass3Item;
    }

    public void setCostPerClass3Item(Integer costPerClass3Item) {
        this.costPerClass3Item = costPerClass3Item;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFreeShippingAllowedFlag() {
        return freeShippingAllowedFlag;
    }

    public void setFreeShippingAllowedFlag(String freeShippingAllowedFlag) {
        this.freeShippingAllowedFlag = freeShippingAllowedFlag;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Long getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(Long shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("costPerClass1Item=");
        buffer.append(getCostPerClass1Item());
        buffer.append(',');
        buffer.append("costPerClass2Item=");
        buffer.append(getCostPerClass2Item());
        buffer.append(',');
        buffer.append("costPerClass3Item=");
        buffer.append(getCostPerClass3Item());
        buffer.append(',');
        buffer.append("countryCode=");
        buffer.append(getCountryCode());
        buffer.append(',');
        buffer.append("freeShippingAllowedFlag=");
        buffer.append(getFreeShippingAllowedFlag());
        buffer.append(',');
        buffer.append("shippingMethod=");
        buffer.append(getShippingMethod());
        buffer.append(',');
        buffer.append("shippingOptionId=");
        buffer.append(getShippingOptionId());
        buffer.append(']');
        return buffer.toString();
    }
}
