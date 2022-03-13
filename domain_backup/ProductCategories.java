package com.demo.spring.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "ProductCategories.findAll", query = "select o from ProductCategories o") })
@Table(name = "PRODUCT_CATEGORIES")
public class ProductCategories implements Serializable {
    private static final long serialVersionUID = -1403835118143736907L;
    @Column(name = "CATEGORY_DESCRIPTION", length = 1000)
    private String categoryDescription;
    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;
    @Column(name = "CATEGORY_LOCKED_FLAG", nullable = false, length = 1)
    private String categoryLockedFlag;
    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
    private String categoryName;
    @Column(nullable = false)
    private byte[] image;
    @Column(name = "PARENT_CATEGORY_ID")
    private Long parentCategoryId;

    public ProductCategories() {
    }

    public ProductCategories(String categoryDescription, Long categoryId, String categoryLockedFlag,
                             String categoryName, Long parentCategoryId) {
        this.categoryDescription = categoryDescription;
        this.categoryId = categoryId;
        this.categoryLockedFlag = categoryLockedFlag;
        this.categoryName = categoryName;
        this.parentCategoryId = parentCategoryId;
    }


    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryLockedFlag() {
        return categoryLockedFlag;
    }

    public void setCategoryLockedFlag(String categoryLockedFlag) {
        this.categoryLockedFlag = categoryLockedFlag;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("categoryDescription=");
        buffer.append(getCategoryDescription());
        buffer.append(',');
        buffer.append("categoryId=");
        buffer.append(getCategoryId());
        buffer.append(',');
        buffer.append("categoryLockedFlag=");
        buffer.append(getCategoryLockedFlag());
        buffer.append(',');
        buffer.append("categoryName=");
        buffer.append(getCategoryName());
        buffer.append(',');
        buffer.append("image=");
        buffer.append(getImage());
        buffer.append(',');
        buffer.append("parentCategoryId=");
        buffer.append(getParentCategoryId());
        buffer.append(']');
        return buffer.toString();
    }
}
