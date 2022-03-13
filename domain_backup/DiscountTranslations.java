package com.demo.spring.service.domain;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "DiscountTranslations.findAll", query = "select o from DiscountTranslations o") })
@Table(name = "DISCOUNT_TRANSLATIONS")
public class DiscountTranslations implements Serializable {
    private static final long serialVersionUID = -976147028615265056L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(nullable = false, length = 4000)
    private String description;
    @Id
    @Column(name = "DISCOUNT_TRANSLATIONS_ID", nullable = false)
    private Long discountTranslationsId;
    @Column(nullable = false, length = 30)
    private String language;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "SOURCE_LANGUAGE", nullable = false, length = 15)
    private String sourceLanguage;
    @ManyToOne
    @JoinColumn(name = "DISCOUNT_ID")
    private DiscountsBase discountsBase;

    public DiscountTranslations() {
    }

    public DiscountTranslations(String createdBy, Date creationDate, String description, DiscountsBase discountsBase,
                                Long discountTranslationsId, String language, Date lastUpdateDate, String lastUpdatedBy,
                                Long objectVersionId, String sourceLanguage) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.description = description;
        this.discountsBase = discountsBase;
        this.discountTranslationsId = discountTranslationsId;
        this.language = language;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.sourceLanguage = sourceLanguage;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Long getDiscountTranslationsId() {
        return discountTranslationsId;
    }

    public void setDiscountTranslationsId(Long discountTranslationsId) {
        this.discountTranslationsId = discountTranslationsId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public DiscountsBase getDiscountsBase() {
        return discountsBase;
    }

    public void setDiscountsBase(DiscountsBase discountsBase) {
        this.discountsBase = discountsBase;
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
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("discountTranslationsId=");
        buffer.append(getDiscountTranslationsId());
        buffer.append(',');
        buffer.append("language=");
        buffer.append(getLanguage());
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
        buffer.append("sourceLanguage=");
        buffer.append(getSourceLanguage());
        buffer.append(']');
        return buffer.toString();
    }
}
