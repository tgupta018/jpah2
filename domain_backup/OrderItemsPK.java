package com.demo.spring.service.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItemsPK implements Serializable {
    private Long lineItemId;
    private Long orders1;

    public OrderItemsPK() {
    }

    public OrderItemsPK(Long lineItemId, Long orders1) {
        this.lineItemId = lineItemId;
        this.orders1 = orders1;
    }

    public boolean equals(Object other) {
        if (other instanceof OrderItemsPK) {
            final OrderItemsPK otherOrderItemsPK = (OrderItemsPK) other;
            final boolean areEqual =
                (otherOrderItemsPK.lineItemId.equals(lineItemId) && otherOrderItemsPK.orders1.equals(orders1));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

//    public Long getLineItemId() {
//        return lineItemId;
//    }
//
//    public void setLineItemId(Long lineItemId) {
//        this.lineItemId = lineItemId;
//    }
//
//    public Long getOrders1() {
//        return orders1;
//    }
//
//    public void setOrders1(Long orders1) {
//        this.orders1 = orders1;
//    }
}
