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
@NamedQueries({ @NamedQuery(name = "WarehouseStockLevels.findAll", query = "select o from WarehouseStockLevels o") })
@Table(name = "WAREHOUSE_STOCK_LEVELS")
@IdClass(WarehouseStockLevelsPK.class)
public class WarehouseStockLevels implements Serializable {
    private static final long serialVersionUID = -3424450636902977787L;
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
    @Column(name = "QUANTITY_ON_HAND", nullable = false)
    private Integer quantityOnHand;
    @ManyToOne
    @Id
    @JoinColumn(name = "WAREHOUSE_ID")
    private Warehouses warehouses1;
    @ManyToOne
    @Id
    @JoinColumn(name = "PRODUCT_ID")
    private ProductsBase productsBase4;

    public WarehouseStockLevels() {
    }

    public WarehouseStockLevels(String createdBy, Date creationDate, Date lastUpdateDate, String lastUpdatedBy,
                                Long objectVersionId, ProductsBase productsBase4, Integer quantityOnHand, Warehouses warehouses1) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.productsBase4 = productsBase4;
        this.quantityOnHand = quantityOnHand;
        this.warehouses1 = warehouses1;
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


    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    public Warehouses getWarehouses1() {
        return warehouses1;
    }

    public void setWarehouses1(Warehouses warehouses1) {
        this.warehouses1 = warehouses1;
    }

    public ProductsBase getProductsBase4() {
        return productsBase4;
    }

    public void setProductsBase4(ProductsBase productsBase4) {
        this.productsBase4 = productsBase4;
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
        buffer.append("quantityOnHand=");
        buffer.append(getQuantityOnHand());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
