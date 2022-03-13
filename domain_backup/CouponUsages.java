package com.demo.spring.service.domain;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "CouponUsages.findAll", query = "select o from CouponUsages o") })
@Table(name = "COUPON_USAGES")
@IdClass(CouponUsagesPK.class)
public class CouponUsages implements Serializable {
    private static final long serialVersionUID = -5658654067401298838L;
    @Temporal(TemporalType.DATE)
    @Column(name = "APPLIED_DATE", nullable = false)
    private Date appliedDate;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Orders orders;
    @ManyToOne
    @Id
    @JoinColumn(name = "CUSTOMER_ID")
    private Persons persons2;
    @ManyToOne
    @Id
    @JoinColumn(name = "DISCOUNT_ID")
    private DiscountsBase discountsBase4;

    public CouponUsages() {
    }

    public CouponUsages(Date appliedDate, String createdBy, Date creationDate, Persons persons2,
                        DiscountsBase discountsBase4,
                        Date lastUpdateDate, String lastUpdatedBy, Long objectVersionId, Orders orders) {
        this.appliedDate = appliedDate;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.persons2 = persons2;
        this.discountsBase4 = discountsBase4;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.orders = orders;
    }


    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
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


    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Persons getPersons2() {
        return persons2;
    }

    public void setPersons2(Persons persons2) {
        this.persons2 = persons2;
    }

    public DiscountsBase getDiscountsBase4() {
        return discountsBase4;
    }

    public void setDiscountsBase4(DiscountsBase discountsBase4) {
        this.discountsBase4 = discountsBase4;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("appliedDate=");
        buffer.append(getAppliedDate());
        buffer.append(',');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
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
        buffer.append(']');
        return buffer.toString();
    }
}
