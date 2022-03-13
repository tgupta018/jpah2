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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Warehouses.findAll", query = "select o from Warehouses o") })
public class Warehouses implements Serializable {
    private static final long serialVersionUID = -1076705015069814520L;
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
    @Id
    @Column(name = "WAREHOUSE_ID", nullable = false)
    private Long warehouseId;
    @Column(name = "WAREHOUSE_NAME", nullable = false, length = 35)
    private String warehouseName;
    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Addresses addresses;
    @OneToMany(mappedBy = "warehouses", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Orders> ordersList2;
    @OneToMany(mappedBy = "warehouses1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<WarehouseStockLevels> warehouseStockLevelsList;

    public Warehouses() {
    }

    public Warehouses(Addresses addresses, String createdBy, Date creationDate, Date lastUpdateDate, String lastUpdatedBy,
                      Long objectVersionId, Long warehouseId, String warehouseName) {
        this.addresses = addresses;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public List<Orders> getOrdersList2() {
        return ordersList2;
    }

    public void setOrdersList2(List<Orders> ordersList2) {
        this.ordersList2 = ordersList2;
    }

    public Orders addOrders(Orders orders) {
        getOrdersList2().add(orders);
        orders.setWarehouses(this);
        return orders;
    }

    public Orders removeOrders(Orders orders) {
        getOrdersList2().remove(orders);
        orders.setWarehouses(null);
        return orders;
    }

    public List<WarehouseStockLevels> getWarehouseStockLevelsList() {
        return warehouseStockLevelsList;
    }

    public void setWarehouseStockLevelsList(List<WarehouseStockLevels> warehouseStockLevelsList) {
        this.warehouseStockLevelsList = warehouseStockLevelsList;
    }

    public WarehouseStockLevels addWarehouseStockLevels(WarehouseStockLevels warehouseStockLevels) {
        getWarehouseStockLevelsList().add(warehouseStockLevels);
        warehouseStockLevels.setWarehouses1(this);
        return warehouseStockLevels;
    }

    public WarehouseStockLevels removeWarehouseStockLevels(WarehouseStockLevels warehouseStockLevels) {
        getWarehouseStockLevelsList().remove(warehouseStockLevels);
        warehouseStockLevels.setWarehouses1(null);
        return warehouseStockLevels;
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
        buffer.append("warehouseId=");
        buffer.append(getWarehouseId());
        buffer.append(',');
        buffer.append("warehouseName=");
        buffer.append(getWarehouseName());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
