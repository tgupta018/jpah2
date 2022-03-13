package com.demo.spring.jpa.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemsRequest {

    private int lineItemId;
    private int objectVersionId;
    private int quantity;
    private int productId;
    private String unitPrice;

}
