package com.demo.spring.service.domain;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "ProductCategoriesBase.findAll", query = "select o from ProductCategoriesBase o") })
@Table(name = "PRODUCT_CATEGORIES_BASE")
public class ProductCategoriesBase implements Serializable {
    private static final long serialVersionUID = -6047614453556874484L;
    @Id
    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;
    @Column(name = "CATEGORY_LOCKED_FLAG", nullable = false, length = 1)
    private String categoryLockedFlag;
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
    @OneToMany(mappedBy = "productCategoriesBase", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductsBase> productsBaseList;
    @OneToMany(mappedBy = "productCategoriesBase1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CustomerInterests> customerInterestsList1;
    @ManyToOne
    @JoinColumn(name = "REPRESENTATIVE_PRODUCT_ID")
    private ProductsBase productsBase3;
    @OneToMany(mappedBy = "productCategoriesBase2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CategoryTranslations> categoryTranslationsList;
    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY_ID")
    private ProductCategoriesBase productCategoriesBase3;
    @OneToMany(mappedBy = "productCategoriesBase3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductCategoriesBase> productCategoriesBaseList1;

    public ProductCategoriesBase() {
    }

    public ProductCategoriesBase(Long categoryId, String categoryLockedFlag, String createdBy, Date creationDate,
                                 Date lastUpdateDate, String lastUpdatedBy, Long objectVersionId,
                                 ProductCategoriesBase productCategoriesBase3,
                                 ProductsBase productsBase3) {
        this.categoryId = categoryId;
        this.categoryLockedFlag = categoryLockedFlag;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.productCategoriesBase3 = productCategoriesBase3;
        this.productsBase3 = productsBase3;
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


    public List<ProductsBase> getProductsBaseList() {
        return productsBaseList;
    }

    public void setProductsBaseList(List<ProductsBase> productsBaseList) {
        this.productsBaseList = productsBaseList;
    }

    public ProductsBase addProductsBase(ProductsBase productsBase) {
        getProductsBaseList().add(productsBase);
        productsBase.setProductCategoriesBase(this);
        return productsBase;
    }

    public ProductsBase removeProductsBase(ProductsBase productsBase) {
        getProductsBaseList().remove(productsBase);
        productsBase.setProductCategoriesBase(null);
        return productsBase;
    }

    public List<CustomerInterests> getCustomerInterestsList1() {
        return customerInterestsList1;
    }

    public void setCustomerInterestsList1(List<CustomerInterests> customerInterestsList1) {
        this.customerInterestsList1 = customerInterestsList1;
    }

    public CustomerInterests addCustomerInterests(CustomerInterests customerInterests) {
        getCustomerInterestsList1().add(customerInterests);
        customerInterests.setProductCategoriesBase1(this);
        return customerInterests;
    }

    public CustomerInterests removeCustomerInterests(CustomerInterests customerInterests) {
        getCustomerInterestsList1().remove(customerInterests);
        customerInterests.setProductCategoriesBase1(null);
        return customerInterests;
    }

    public ProductsBase getProductsBase3() {
        return productsBase3;
    }

    public void setProductsBase3(ProductsBase productsBase3) {
        this.productsBase3 = productsBase3;
    }

    public List<CategoryTranslations> getCategoryTranslationsList() {
        return categoryTranslationsList;
    }

    public void setCategoryTranslationsList(List<CategoryTranslations> categoryTranslationsList) {
        this.categoryTranslationsList = categoryTranslationsList;
    }

    public CategoryTranslations addCategoryTranslations(CategoryTranslations categoryTranslations) {
        getCategoryTranslationsList().add(categoryTranslations);
        categoryTranslations.setProductCategoriesBase2(this);
        return categoryTranslations;
    }

    public CategoryTranslations removeCategoryTranslations(CategoryTranslations categoryTranslations) {
        getCategoryTranslationsList().remove(categoryTranslations);
        categoryTranslations.setProductCategoriesBase2(null);
        return categoryTranslations;
    }

    public ProductCategoriesBase getProductCategoriesBase3() {
        return productCategoriesBase3;
    }

    public void setProductCategoriesBase3(ProductCategoriesBase productCategoriesBase3) {
        this.productCategoriesBase3 = productCategoriesBase3;
    }

    public List<ProductCategoriesBase> getProductCategoriesBaseList1() {
        return productCategoriesBaseList1;
    }

    public void setProductCategoriesBaseList1(List<ProductCategoriesBase> productCategoriesBaseList1) {
        this.productCategoriesBaseList1 = productCategoriesBaseList1;
    }

    public ProductCategoriesBase addProductCategoriesBase(ProductCategoriesBase productCategoriesBase) {
        getProductCategoriesBaseList1().add(productCategoriesBase);
        productCategoriesBase.setProductCategoriesBase3(this);
        return productCategoriesBase;
    }

    public ProductCategoriesBase removeProductCategoriesBase(ProductCategoriesBase productCategoriesBase) {
        getProductCategoriesBaseList1().remove(productCategoriesBase);
        productCategoriesBase.setProductCategoriesBase3(null);
        return productCategoriesBase;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("categoryId=");
        buffer.append(getCategoryId());
        buffer.append(',');
        buffer.append("categoryLockedFlag=");
        buffer.append(getCategoryLockedFlag());
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
