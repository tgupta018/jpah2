package com.demo.spring.service.domain;

import java.io.Serializable;

public class WarehouseStockLevelsPK implements Serializable {
    private Long warehouses1;
    private Long productsBase4;

    public WarehouseStockLevelsPK() {
    }

    public WarehouseStockLevelsPK(Long warehouses1, Long productsBase4) {
        this.warehouses1 = warehouses1;
        this.productsBase4 = productsBase4;
    }

    public boolean equals(Object other) {
        if (other instanceof WarehouseStockLevelsPK) {
            final WarehouseStockLevelsPK otherWarehouseStockLevelsPK = (WarehouseStockLevelsPK) other;
            final boolean areEqual =
                (otherWarehouseStockLevelsPK.warehouses1.equals(warehouses1) &&
                 otherWarehouseStockLevelsPK.productsBase4.equals(productsBase4));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Long getWarehouses1() {
        return warehouses1;
    }

    public void setWarehouses1(Long warehouses1) {
        this.warehouses1 = warehouses1;
    }

    public Long getProductsBase4() {
        return productsBase4;
    }

    public void setProductsBase4(Long productsBase4) {
        this.productsBase4 = productsBase4;
    }
}
