package com.demo.spring.service.domain;

import java.io.Serializable;

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
@NamedQueries({ @NamedQuery(name = "ShippingOptionsBase.findAll", query = "select o from ShippingOptionsBase o") })
@Table(name = "SHIPPING_OPTIONS_BASE")
public class ShippingOptionsBase implements Serializable {
    private static final long serialVersionUID = 1399060527342709924L;
    @Column(name = "COST_PER_CLASS1_ITEM", nullable = false)
    private Integer costPerClass1Item;
    @Column(name = "COST_PER_CLASS2_ITEM", nullable = false)
    private Integer costPerClass2Item;
    @Column(name = "COST_PER_CLASS3_ITEM", nullable = false)
    private Integer costPerClass3Item;
    @Column(name = "COUNTRY_CODE", length = 2)
    private String countryCode;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "FREE_SHIPPING_ALLOWED_FLAG", length = 1)
    private String freeShippingAllowedFlag;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Id
    @Column(name = "SHIPPING_OPTION_ID", nullable = false)
    private Long shippingOptionId;
    @OneToMany(mappedBy = "shippingOptionsBase", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Orders> ordersList;
    @OneToMany(mappedBy = "shippingOptionsBase1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ShippingOptionTranslations> shippingOptionTranslationsList;

    public ShippingOptionsBase() {
    }

    public ShippingOptionsBase(Integer costPerClass1Item, Integer costPerClass2Item, Integer costPerClass3Item,
                               String countryCode, String createdBy, Date creationDate, String freeShippingAllowedFlag,
                               Date lastUpdateDate, String lastUpdatedBy, Long objectVersionId, Long shippingOptionId) {
        this.costPerClass1Item = costPerClass1Item;
        this.costPerClass2Item = costPerClass2Item;
        this.costPerClass3Item = costPerClass3Item;
        this.countryCode = countryCode;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.freeShippingAllowedFlag = freeShippingAllowedFlag;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
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

    public String getFreeShippingAllowedFlag() {
        return freeShippingAllowedFlag;
    }

    public void setFreeShippingAllowedFlag(String freeShippingAllowedFlag) {
        this.freeShippingAllowedFlag = freeShippingAllowedFlag;
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

    public Long getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(Long shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Orders addOrders(Orders orders) {
        getOrdersList().add(orders);
        orders.setShippingOptionsBase(this);
        return orders;
    }

    public Orders removeOrders(Orders orders) {
        getOrdersList().remove(orders);
        orders.setShippingOptionsBase(null);
        return orders;
    }

    public List<ShippingOptionTranslations> getShippingOptionTranslationsList() {
        return shippingOptionTranslationsList;
    }

    public void setShippingOptionTranslationsList(List<ShippingOptionTranslations> shippingOptionTranslationsList) {
        this.shippingOptionTranslationsList = shippingOptionTranslationsList;
    }

    public ShippingOptionTranslations addShippingOptionTranslations(ShippingOptionTranslations shippingOptionTranslations) {
        getShippingOptionTranslationsList().add(shippingOptionTranslations);
        shippingOptionTranslations.setShippingOptionsBase1(this);
        return shippingOptionTranslations;
    }

    public ShippingOptionTranslations removeShippingOptionTranslations(ShippingOptionTranslations shippingOptionTranslations) {
        getShippingOptionTranslationsList().remove(shippingOptionTranslations);
        shippingOptionTranslations.setShippingOptionsBase1(null);
        return shippingOptionTranslations;
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
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("freeShippingAllowedFlag=");
        buffer.append(getFreeShippingAllowedFlag());
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
        buffer.append("shippingOptionId=");
        buffer.append(getShippingOptionId());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
