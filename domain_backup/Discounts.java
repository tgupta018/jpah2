package com.demo.spring.service.domain;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Discounts.findAll", query = "select o from Discounts o") })
public class Discounts implements Serializable {
    private static final long serialVersionUID = -4681962208507446052L;
    @Column(name = "ADD_FREE_SHIPPING_FLAG", nullable = false, length = 1)
    private String addFreeShippingFlag;
    @Column(name = "APPLY_AS_PERCENTAGE_FLAG", nullable = false, length = 1)
    private String applyAsPercentageFlag;
    @Column(nullable = false, length = 4000)
    private String description;
    @Column(name = "DISCOUNT_AMOUNT", nullable = false)
    private BigDecimal discountAmount;
    @Column(name = "DISCOUNT_ID", nullable = false)
    private Long discountId;
    @Column(name = "DISCOUNT_TYPE_CODE", nullable = false, length = 30)
    private String discountTypeCode;
    @Column(name = "EASY_CODE", length = 20)
    private String easyCode;
    @Column(name = "ONETIME_DISCOUNT_FLAG", nullable = false, length = 1)
    private String onetimeDiscountFlag;

    public Discounts() {
    }

    public Discounts(String addFreeShippingFlag, String applyAsPercentageFlag, String description,
                     BigDecimal discountAmount, Long discountId, String discountTypeCode, String easyCode,
                     String onetimeDiscountFlag) {
        this.addFreeShippingFlag = addFreeShippingFlag;
        this.applyAsPercentageFlag = applyAsPercentageFlag;
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountId = discountId;
        this.discountTypeCode = discountTypeCode;
        this.easyCode = easyCode;
        this.onetimeDiscountFlag = onetimeDiscountFlag;
    }


    public String getAddFreeShippingFlag() {
        return addFreeShippingFlag;
    }

    public void setAddFreeShippingFlag(String addFreeShippingFlag) {
        this.addFreeShippingFlag = addFreeShippingFlag;
    }

    public String getApplyAsPercentageFlag() {
        return applyAsPercentageFlag;
    }

    public void setApplyAsPercentageFlag(String applyAsPercentageFlag) {
        this.applyAsPercentageFlag = applyAsPercentageFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public String getDiscountTypeCode() {
        return discountTypeCode;
    }

    public void setDiscountTypeCode(String discountTypeCode) {
        this.discountTypeCode = discountTypeCode;
    }

    public String getEasyCode() {
        return easyCode;
    }

    public void setEasyCode(String easyCode) {
        this.easyCode = easyCode;
    }

    public String getOnetimeDiscountFlag() {
        return onetimeDiscountFlag;
    }

    public void setOnetimeDiscountFlag(String onetimeDiscountFlag) {
        this.onetimeDiscountFlag = onetimeDiscountFlag;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("addFreeShippingFlag=");
        buffer.append(getAddFreeShippingFlag());
        buffer.append(',');
        buffer.append("applyAsPercentageFlag=");
        buffer.append(getApplyAsPercentageFlag());
        buffer.append(',');
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("discountAmount=");
        buffer.append(getDiscountAmount());
        buffer.append(',');
        buffer.append("discountId=");
        buffer.append(getDiscountId());
        buffer.append(',');
        buffer.append("discountTypeCode=");
        buffer.append(getDiscountTypeCode());
        buffer.append(',');
        buffer.append("easyCode=");
        buffer.append(getEasyCode());
        buffer.append(',');
        buffer.append("onetimeDiscountFlag=");
        buffer.append(getOnetimeDiscountFlag());
        buffer.append(']');
        return buffer.toString();
    }
}
