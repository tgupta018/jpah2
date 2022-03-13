package com.demo.spring.jpa.service;


import com.demo.spring.jpa.controller.request.OrderRequest;
import com.demo.spring.jpa.domain.OrderItems;
import com.demo.spring.jpa.domain.Orders;
import com.demo.spring.jpa.domain.OrdersSample;
import com.demo.spring.jpa.repository.OrderItemsRepository;
import com.demo.spring.jpa.repository.OrdersRepository;
import com.demo.spring.jpa.repository.OrdersSampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class OrdersService {

    private OrdersRepository ordersRepository;
    private OrderItemsRepository orderItemsRepository;

    @Autowired
    OrdersSampleRepository ordersSampleRepository;


    public OrdersService(OrdersRepository ordersRepository, OrderItemsRepository orderItemsRepository) {
        this.ordersRepository = ordersRepository;
        this.orderItemsRepository = orderItemsRepository;
    }

    public Orders getOrder(Long orderId) {
        Optional<Orders> optionalOrders = ordersRepository.findById(orderId);
        if (optionalOrders.isPresent()) {
            Orders orders = optionalOrders.get();
            log.info("------------------------------------------ {}", orders.getOrderItemsList1().size());
            return orders;
        }
        return null;
    }

    public Orders createOrder(OrderRequest orderRequest) {
        Orders orders = prepareOrders(orderRequest);
        return ordersRepository.saveAndFlush(orders);
    }

    public OrdersSample createOrderSample(OrderRequest orderRequest) {
        OrdersSample orderssample = prepareOrdersSample(orderRequest);
        return ordersSampleRepository.saveAndFlush(orderssample);
    }

    private List<OrderItems> prepareOrderItems(OrderRequest orderRequest, Orders orders) {
        List<OrderItems> orderItemsList = new ArrayList<>();
        orderRequest.getOrderItemsRequests().forEach(l -> {
                    OrderItems orderItems = new OrderItems();
                    //orderItems.setLineItemId(Long.valueOf(l.getLineItemId()));
                    orderItems.setOrders1(orders);
                    orderItems.setObjectVersionId(Long.valueOf(l.getObjectVersionId()));
                    orderItems.setQuantity(l.getQuantity());
                    orderItems.setUnitPrice(Integer.valueOf(l.getUnitPrice()));
                    orderItemsList.add(orderItems);
                }
        );
        return orderItemsList;
    }

    private Orders prepareOrders(OrderRequest orderRequest) {
        Orders order = Orders.builder()
                .customerCollectFlag(orderRequest.getCustomerCollectFlag())
                .freeShippingFlag(orderRequest.getFreeShippingFlag())
                .giftwrapFlag(orderRequest.getGiftwrapFlag())
                .giftwrapMessage(orderRequest.getGiftwrapMessage())
                .objectVersionId(Long.valueOf(orderRequest.getObjectVersionId()))
                //LocalDate.parse(orderRequest.getOrderDate())
                .orderDate(java.sql.Date.valueOf(LocalDate.parse(orderRequest.getOrderDate())))
                // .orderShippedDate()
                .orderStatusCode(orderRequest.getOrderStatusCode())
                .orderTotal(Integer.valueOf(orderRequest.getOrderTotal()))
                .shipToName(orderRequest.getShipToName())
                .shipToPhoneNumber(orderRequest.getShipToPhoneNumber())
                .build();
        List<OrderItems> orderItemsList = prepareOrderItems(orderRequest, order);
        order.setOrderItemsList1(orderItemsList);
        return order;


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


    }

    private OrdersSample prepareOrdersSample(OrderRequest ord) {
        return new OrdersSample(ord.getCustomerCollectFlag(), ord.getFreeShippingFlag(),
                ord.getGiftwrapFlag(), ord.getGiftwrapMessage(), Long.valueOf(ord.getObjectVersionId()),
                java.sql.Date.valueOf(LocalDate.parse(ord.getOrderDate())),
                null, ord.getOrderStatusCode(), Integer.valueOf(ord.getOrderTotal()), ord.getShipToName(),
                ord.getShipToPhoneNumber()
        );
    }

}