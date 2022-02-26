package com.example.jpa.h2.demo.model;

import com.example.jpa.h2.demo.utils.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@javax.persistence.Table(name = "CATEGORY_TRANSLATIONS", schema = "FODPRODUCT", catalog = "")
@Table(name = "CATEGORY_TRANSLATIONS")

@javax.persistence.IdClass(CategoryTranslationsEntityPK.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoryTranslationsEntity extends Auditable<String> {
    private static final long serialVersionUID = -2471736046515927917L;

    @Id
    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
    private Long categoryId;

//    @Id
//    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
//    public Long getCategoryId() {
//        return categoryId;
//    }

//    public void setCategoryId(Long categoryId) {
//        this.categoryId = categoryId;
//    }

    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
    private String categoryName;

//    @Basic
//    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }

 
    @Column(name = "CATEGORY_DESCRIPTION", nullable = true, length = 1000)
    private String categoryDescription;

//    @Basic
//    @Column(name = "CATEGORY_DESCRIPTION", nullable = true, length = 1000)
//    public String getCategoryDescription() {
//        return categoryDescription;
//    }
//
//    public void setCategoryDescription(String categoryDescription) {
//        this.categoryDescription = categoryDescription;
//    }

    @Id
    @Column(name = "LANGUAGE", nullable = false, length = 30)
    private String language;

//    @Id
//    @Column(name = "LANGUAGE", nullable = false, length = 30)
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }

    @Basic
    @Column(name = "SOURCE_LANG", nullable = true, length = 30)
    private String sourceLang;

//    @Basic
//    @Column(name = "SOURCE_LANG", nullable = true, length = 30)
//    public String getSourceLang() {
//        return sourceLang;
//    }
//
//    public void setSourceLang(String sourceLang) {
//        this.sourceLang = sourceLang;
//    }

//    @Basic
//    @Column(name = "CREATED_BY", nullable = false, length = 60)
//    private String createdBy;

//    @Basic
//    @Column(name = "CREATED_BY", nullable = false, length = 60)
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }

//    @Basic
//    @Column(name = "CREATION_DATE", nullable = false)
//    @Temporal(TemporalType.DATE)
//    private Date creationDate;

//    @Basic
//    @Column(name = "CREATION_DATE", nullable = false)
//    public Time getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(Time creationDate) {
//        this.creationDate = creationDate;
//    }

//    @Basic
//    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
//    private String lastUpdatedBy;

//    @Basic
//    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
//    public String getLastUpdatedBy() {
//        return lastUpdatedBy;
//    }
//
//    public void setLastUpdatedBy(String lastUpdatedBy) {
//        this.lastUpdatedBy = lastUpdatedBy;
//    }

//    @Basic
//    @Column(name = "LAST_UPDATE_DATE", nullable = false)
//    @Temporal(TemporalType.DATE)
//    private Date lastUpdateDate;

//    @Basic
//    @Column(name = "LAST_UPDATE_DATE", nullable = false)
//    public Time getLastUpdateDate() {
//        return lastUpdateDate;
//    }
//
//    public void setLastUpdateDate(Time lastUpdateDate) {
//        this.lastUpdateDate = lastUpdateDate;
//    }

    @Basic
    @Column(name = "OBJECT_VERSION_ID", nullable = false, precision = 0)
    private Long objectVersionId;

//    @Basic
//    @Column(name = "OBJECT_VERSION_ID", nullable = false, precision = 0)
//    public Long getObjectVersionId() {
//        return objectVersionId;
//    }
//
//    public void setObjectVersionId(Long objectVersionId) {
//        this.objectVersionId = objectVersionId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryTranslationsEntity that = (CategoryTranslationsEntity) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryDescription != null ? !categoryDescription.equals(that.categoryDescription) : that.categoryDescription != null)
            return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (sourceLang != null ? !sourceLang.equals(that.sourceLang) : that.sourceLang != null) return false;
//        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
//        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
//        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
//            return false;
//        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
//            return false;
        if (objectVersionId != null ? !objectVersionId.equals(that.objectVersionId) : that.objectVersionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryDescription != null ? categoryDescription.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (sourceLang != null ? sourceLang.hashCode() : 0);
//        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
//        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
//        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
//        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
