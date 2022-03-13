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
@NamedQueries({ @NamedQuery(name = "CategoryTranslations.findAll", query = "select o from CategoryTranslations o") })
@Table(name = "CATEGORY_TRANSLATIONS")
@IdClass(CategoryTranslationsPK.class)
public class CategoryTranslations implements Serializable {
    private static final long serialVersionUID = 3732541633175035276L;
    @Column(name = "CATEGORY_DESCRIPTION", length = 1000)
    private String categoryDescription;
    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
    private String categoryName;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Id
    @Column(nullable = false, length = 30)
    private String language;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "SOURCE_LANG", length = 30)
    private String sourceLang;
    @ManyToOne
    @Id
    @JoinColumn(name = "CATEGORY_ID")
    private ProductCategoriesBase productCategoriesBase2;

    public CategoryTranslations() {
    }

    public CategoryTranslations(String categoryDescription, ProductCategoriesBase productCategoriesBase2, String categoryName, String createdBy,
                                Date creationDate, String language, Date lastUpdateDate, String lastUpdatedBy,
                                Long objectVersionId, String sourceLang) {
        this.categoryDescription = categoryDescription;
        this.productCategoriesBase2 = productCategoriesBase2;
        this.categoryName = categoryName;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.language = language;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.sourceLang = sourceLang;
    }


    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public String getSourceLang() {
        return sourceLang;
    }

    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    public ProductCategoriesBase getProductCategoriesBase2() {
        return productCategoriesBase2;
    }

    public void setProductCategoriesBase2(ProductCategoriesBase productCategoriesBase2) {
        this.productCategoriesBase2 = productCategoriesBase2;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("categoryDescription=");
        buffer.append(getCategoryDescription());
        buffer.append(',');
        buffer.append("categoryName=");
        buffer.append(getCategoryName());
        buffer.append(',');
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
        buffer.append("sourceLang=");
        buffer.append(getSourceLang());
        buffer.append(']');
        return buffer.toString();
    }
}
