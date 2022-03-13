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
@NamedQueries({ @NamedQuery(name = "ShippingOptionTranslations.findAll",
                            query = "select o from ShippingOptionTranslations o") })
@Table(name = "SHIPPING_OPTION_TRANSLATIONS")
public class ShippingOptionTranslations implements Serializable {
    private static final long serialVersionUID = -2427514981000483707L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(nullable = false, length = 30)
    private String language;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "SHIPPING_METHOD", nullable = false, length = 100)
    private String shippingMethod;
    @Id
    @Column(name = "SHIPPING_TRANSLATIONS_ID", nullable = false)
    private Long shippingTranslationsId;
    @Column(name = "SOURCE_LANG", nullable = false, length = 4000)
    private String sourceLang;
    @ManyToOne
    @JoinColumn(name = "SHIPPING_OPTION_ID")
    private ShippingOptionsBase shippingOptionsBase1;

    public ShippingOptionTranslations() {
    }

    public ShippingOptionTranslations(String createdBy, Date creationDate, String language, Date lastUpdateDate,
                                      String lastUpdatedBy, Long objectVersionId, String shippingMethod,
                                      ShippingOptionsBase shippingOptionsBase1, Long shippingTranslationsId, String sourceLang) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.language = language;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.shippingMethod = shippingMethod;
        this.shippingOptionsBase1 = shippingOptionsBase1;
        this.shippingTranslationsId = shippingTranslationsId;
        this.sourceLang = sourceLang;
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

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    public Long getShippingTranslationsId() {
        return shippingTranslationsId;
    }

    public void setShippingTranslationsId(Long shippingTranslationsId) {
        this.shippingTranslationsId = shippingTranslationsId;
    }

    public String getSourceLang() {
        return sourceLang;
    }

    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    public ShippingOptionsBase getShippingOptionsBase1() {
        return shippingOptionsBase1;
    }

    public void setShippingOptionsBase1(ShippingOptionsBase shippingOptionsBase1) {
        this.shippingOptionsBase1 = shippingOptionsBase1;
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
        buffer.append("shippingMethod=");
        buffer.append(getShippingMethod());
        buffer.append(',');
        buffer.append("shippingTranslationsId=");
        buffer.append(getShippingTranslationsId());
        buffer.append(',');
        buffer.append("sourceLang=");
        buffer.append(getSourceLang());
        buffer.append(']');
        return buffer.toString();
    }
}
