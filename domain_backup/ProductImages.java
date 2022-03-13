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
@NamedQueries({ @NamedQuery(name = "ProductImages.findAll", query = "select o from ProductImages o") })
@Table(name = "PRODUCT_IMAGES")
public class ProductImages implements Serializable {
    private static final long serialVersionUID = -2617808345482711755L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "DEFAULT_VIEW_FLAG", nullable = false, length = 1)
    private String defaultViewFlag;
    @Column(nullable = false)
    private byte[] image;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Id
    @Column(name = "PRODUCT_IMAGE_ID", nullable = false)
    private Long productImageId;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private ProductsBase productsBase2;
    @ManyToOne
    @JoinColumn(name = "DETAIL_IMAGE_ID")
    private ProductImages productImages;
    @OneToMany(mappedBy = "productImages", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductImages> productImagesList1;

    public ProductImages() {
    }

    public ProductImages(String createdBy, Date creationDate, String defaultViewFlag, ProductImages productImages,
                         Date lastUpdateDate, String lastUpdatedBy, Long objectVersionId, ProductsBase productsBase2,
                         Long productImageId) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.defaultViewFlag = defaultViewFlag;
        this.productImages = productImages;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.productsBase2 = productsBase2;
        this.productImageId = productImageId;
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

    public String getDefaultViewFlag() {
        return defaultViewFlag;
    }

    public void setDefaultViewFlag(String defaultViewFlag) {
        this.defaultViewFlag = defaultViewFlag;
    }


    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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


    public Long getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(Long productImageId) {
        this.productImageId = productImageId;
    }

    public ProductsBase getProductsBase2() {
        return productsBase2;
    }

    public void setProductsBase2(ProductsBase productsBase2) {
        this.productsBase2 = productsBase2;
    }

    public ProductImages getProductImages() {
        return productImages;
    }

    public void setProductImages(ProductImages productImages) {
        this.productImages = productImages;
    }

    public List<ProductImages> getProductImagesList1() {
        return productImagesList1;
    }

    public void setProductImagesList1(List<ProductImages> productImagesList1) {
        this.productImagesList1 = productImagesList1;
    }

    public ProductImages addProductImages(ProductImages productImages) {
        getProductImagesList1().add(productImages);
        productImages.setProductImages(this);
        return productImages;
    }

    public ProductImages removeProductImages(ProductImages productImages) {
        getProductImagesList1().remove(productImages);
        productImages.setProductImages(null);
        return productImages;
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
        buffer.append("defaultViewFlag=");
        buffer.append(getDefaultViewFlag());
        buffer.append(',');
        buffer.append("image=");
        buffer.append(getImage());
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
        buffer.append("productImageId=");
        buffer.append(getProductImageId());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
