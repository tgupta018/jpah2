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
@NamedQueries({ @NamedQuery(name = "EligibleDiscounts.findAll", query = "select o from EligibleDiscounts o") })
@Table(name = "ELIGIBLE_DISCOUNTS")
@IdClass(EligibleDiscountsPK.class)
public class EligibleDiscounts implements Serializable {
    private static final long serialVersionUID = -2166957417419189381L;
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
    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_TO_DATE")
    private Date validToDate;
    @ManyToOne
    @Id
    @JoinColumn(name = "MEMBERSHIP_ID")
    private MembershipsBase membershipsBase;
    @ManyToOne
    @Id
    @JoinColumn(name = "DISCOUNT_ID")
    private DiscountsBase discountsBase2;

    public EligibleDiscounts() {
    }

    public EligibleDiscounts(String createdBy, Date creationDate, DiscountsBase discountsBase2, Date lastUpdateDate,
                             String lastUpdatedBy, MembershipsBase membershipsBase, Long objectVersionId, Date validFromDate,
                             Date validToDate) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.discountsBase2 = discountsBase2;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.membershipsBase = membershipsBase;
        this.objectVersionId = objectVersionId;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
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

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public MembershipsBase getMembershipsBase() {
        return membershipsBase;
    }

    public void setMembershipsBase(MembershipsBase membershipsBase) {
        this.membershipsBase = membershipsBase;
    }

    public DiscountsBase getDiscountsBase2() {
        return discountsBase2;
    }

    public void setDiscountsBase2(DiscountsBase discountsBase2) {
        this.discountsBase2 = discountsBase2;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
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
        buffer.append("validFromDate=");
        buffer.append(getValidFromDate());
        buffer.append(',');
        buffer.append("validToDate=");
        buffer.append(getValidToDate());
        buffer.append(']');
        return buffer.toString();
    }
}
