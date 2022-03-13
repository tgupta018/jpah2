package com.demo.spring.jpa.controller.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private String customerCollectFlag;
    private String freeShippingFlag;
    private String giftwrapFlag;
    private String giftwrapMessage;
    private int objectVersionId;
    private String orderDate;

    private String orderShippedDate;
    private String orderStatusCode;
    private String orderTotal;
    private String shipToName;
    private String shipToPhoneNumber;
    private List<OrderItemsRequest> orderItemsRequests;
//
//    {
//        "customerCollectFlag": "Y",
//            "freeShippingFlag": "Y",
//            "giftwrapFlag": "N",
//            "giftwrapMessage": null,
//            "objectVersionId": 0,
//            "orderDate": "2022-02-23",
//            "orderShippedDate": null,
//            "orderStatusCode": "PICK",
//            "orderTotal": 1249,
//            "shipToName": "Tanmoy",
//            "shipToPhoneNumber": "123456789",
//            "orderItemsList1": [
//        {
//            "lineItemId": 3,
//                "objectVersionId": 0,
//                "quantity": 1,
//                "unitPrice": 199
//        },
//        {
//            "lineItemId": 2,
//                "objectVersionId": 0,
//                "quantity": 3,
//                "unitPrice": 49
//        },
//        {
//            "lineItemId": 1,
//                "objectVersionId": 0,
//                "quantity": 1,
//                "unitPrice": 899
//        }
//    ]
//    }







}
