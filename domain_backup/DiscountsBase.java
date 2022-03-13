package com.demo.spring.service.domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "DiscountsBase.findAll", query = "select o from DiscountsBase o") })
@Table(name = "DISCOUNTS_BASE")
public class DiscountsBase implements Serializable {
    private static final long serialVersionUID = -5340923520087543340L;
    @Column(name = "ADD_FREE_SHIPPING_FLAG", nullable = false, length = 1)
    private String addFreeShippingFlag;
    @Column(name = "APPLY_AS_PERCENTAGE_FLAG", nullable = false, length = 1)
    private String applyAsPercentageFlag;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "DISCOUNT_AMOUNT", nullable = false)
    private BigDecimal discountAmount;
    @Id
    @Column(name = "DISCOUNT_ID", nullable = false)
    private Long discountId;
    @Column(name = "DISCOUNT_TYPE_CODE", nullable = false, length = 30)
    private String discountTypeCode;
    @Column(name = "EASY_CODE", length = 20)
    private String easyCode;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "ONETIME_DISCOUNT_FLAG", nullable = false, length = 1)
    private String onetimeDiscountFlag;
    @OneToMany(mappedBy = "discountsBase", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<DiscountTranslations> discountTranslationsList;
    @OneToMany(mappedBy = "discountsBase1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Orders> ordersList1;
    @OneToMany(mappedBy = "discountsBase2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EligibleDiscounts> eligibleDiscountsList1;
    @OneToMany(mappedBy = "discountsBase3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Orders> ordersList5;
    @OneToMany(mappedBy = "discountsBase4", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CouponUsages> couponUsagesList2;

    public DiscountsBase() {
    }

    public DiscountsBase(String addFreeShippingFlag, String applyAsPercentageFlag, String createdBy, Date creationDate,
                         BigDecimal discountAmount, Long discountId, String discountTypeCode, String easyCode,
                         Date lastUpdateDate, String lastUpdatedBy, Long objectVersionId, String onetimeDiscountFlag) {
        this.addFreeShippingFlag = addFreeShippingFlag;
        this.applyAsPercentageFlag = applyAsPercentageFlag;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.discountAmount = discountAmount;
        this.discountId = discountId;
        this.discountTypeCode = discountTypeCode;
        this.easyCode = easyCode;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public String getOnetimeDiscountFlag() {
        return onetimeDiscountFlag;
    }

    public void setOnetimeDiscountFlag(String onetimeDiscountFlag) {
        this.onetimeDiscountFlag = onetimeDiscountFlag;
    }

    public List<DiscountTranslations> getDiscountTranslationsList() {
        return discountTranslationsList;
    }

    public void setDiscountTranslationsList(List<DiscountTranslations> discountTranslationsList) {
        this.discountTranslationsList = discountTranslationsList;
    }

    public DiscountTranslations addDiscountTranslations(DiscountTranslations discountTranslations) {
        getDiscountTranslationsList().add(discountTranslations);
        discountTranslations.setDiscountsBase(this);
        return discountTranslations;
    }

    public DiscountTranslations removeDiscountTranslations(DiscountTranslations discountTranslations) {
        getDiscountTranslationsList().remove(discountTranslations);
        discountTranslations.setDiscountsBase(null);
        return discountTranslations;
    }

    public List<Orders> getOrdersList1() {
        return ordersList1;
    }

    public void setOrdersList1(List<Orders> ordersList1) {
        this.ordersList1 = ordersList1;
    }

    public Orders addOrders(Orders orders) {
        getOrdersList1().add(orders);
        orders.setDiscountsBase1(this);
        return orders;
    }

    public Orders removeOrders(Orders orders) {
        getOrdersList1().remove(orders);
        orders.setDiscountsBase1(null);
        return orders;
    }

    public List<EligibleDiscounts> getEligibleDiscountsList1() {
        return eligibleDiscountsList1;
    }

    public void setEligibleDiscountsList1(List<EligibleDiscounts> eligibleDiscountsList1) {
        this.eligibleDiscountsList1 = eligibleDiscountsList1;
    }

    public EligibleDiscounts addEligibleDiscounts(EligibleDiscounts eligibleDiscounts) {
        getEligibleDiscountsList1().add(eligibleDiscounts);
        eligibleDiscounts.setDiscountsBase2(this);
        return eligibleDiscounts;
    }

    public EligibleDiscounts removeEligibleDiscounts(EligibleDiscounts eligibleDiscounts) {
        getEligibleDiscountsList1().remove(eligibleDiscounts);
        eligibleDiscounts.setDiscountsBase2(null);
        return eligibleDiscounts;
    }

    public List<Orders> getOrdersList5() {
        return ordersList5;
    }

    public void setOrdersList5(List<Orders> ordersList5) {
        this.ordersList5 = ordersList5;
    }

    public List<CouponUsages> getCouponUsagesList2() {
        return couponUsagesList2;
    }

    public void setCouponUsagesList2(List<CouponUsages> couponUsagesList2) {
        this.couponUsagesList2 = couponUsagesList2;
    }

    public CouponUsages addCouponUsages(CouponUsages couponUsages) {
        getCouponUsagesList2().add(couponUsages);
        couponUsages.setDiscountsBase4(this);
        return couponUsages;
    }

    public CouponUsages removeCouponUsages(CouponUsages couponUsages) {
        getCouponUsagesList2().remove(couponUsages);
        couponUsages.setDiscountsBase4(null);
        return couponUsages;
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
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
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
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("onetimeDiscountFlag=");
        buffer.append(getOnetimeDiscountFlag());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
