package com.demo.spring.service.domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "ADDRESS_USAGES_ID_SEQ_GEN":
 * CREATE SEQUENCE "ADDRESS_USAGES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "AddressUsages.findAll", query = "select o from AddressUsages o") })
@Table(name = "ADDRESS_USAGES")
@SequenceGenerator(name = "AddressUsages_Id_Seq_Gen", sequenceName = "ADDRESS_USAGES_ID_SEQ_GEN", allocationSize = 50,
                   initialValue = 50)
public class AddressUsages implements Serializable {
    private static final long serialVersionUID = 6757696535886331054L;
    @Id
    @Column(name = "ADDRESS_USAGES_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AddressUsages_Id_Seq_Gen")
    private BigDecimal addressUsagesId;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "EXPIRED_FLAG", nullable = false, length = 1)
    private String expiredFlag;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "OWNER_TYPE_CODE", nullable = false, length = 30)
    private String ownerTypeCode;
    @Column(name = "USAGE_TYPE_CODE", nullable = false, length = 30)
    private String usageTypeCode;
    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Addresses addresses1;
    @ManyToOne
    @JoinColumn(name = "ASSOCIATED_OWNER_ID")
    private Persons persons6;

    public AddressUsages() {
    }

    public AddressUsages(Addresses addresses1, BigDecimal addressUsagesId, Persons persons6, String createdBy,
                         Date creationDate, String expiredFlag, Date lastUpdateDate, String lastUpdatedBy,
                         Long objectVersionId, String ownerTypeCode, String usageTypeCode) {
        this.addresses1 = addresses1;
        this.addressUsagesId = addressUsagesId;
        this.persons6 = persons6;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.expiredFlag = expiredFlag;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.ownerTypeCode = ownerTypeCode;
        this.usageTypeCode = usageTypeCode;
    }


    public BigDecimal getAddressUsagesId() {
        return addressUsagesId;
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

    public String getExpiredFlag() {
        return expiredFlag;
    }

    public void setExpiredFlag(String expiredFlag) {
        this.expiredFlag = expiredFlag;
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

    public String getOwnerTypeCode() {
        return ownerTypeCode;
    }

    public void setOwnerTypeCode(String ownerTypeCode) {
        this.ownerTypeCode = ownerTypeCode;
    }

    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String usageTypeCode) {
        this.usageTypeCode = usageTypeCode;
    }

    public Addresses getAddresses1() {
        return addresses1;
    }

    public void setAddresses1(Addresses addresses1) {
        this.addresses1 = addresses1;
    }

    public Persons getPersons6() {
        return persons6;
    }

    public void setPersons6(Persons persons6) {
        this.persons6 = persons6;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("addressUsagesId=");
        buffer.append(getAddressUsagesId());
        buffer.append(',');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("expiredFlag=");
        buffer.append(getExpiredFlag());
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
        buffer.append("ownerTypeCode=");
        buffer.append(getOwnerTypeCode());
        buffer.append(',');
        buffer.append("usageTypeCode=");
        buffer.append(getUsageTypeCode());
        buffer.append(']');
        return buffer.toString();
    }
}
