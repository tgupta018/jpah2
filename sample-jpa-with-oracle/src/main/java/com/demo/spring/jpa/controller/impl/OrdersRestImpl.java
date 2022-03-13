package com.demo.spring.jpa.controller.impl;

import com.demo.spring.jpa.controller.request.OrderRequest;
import com.demo.spring.jpa.domain.Orders;
import com.demo.spring.jpa.domain.OrdersSample;
import com.demo.spring.jpa.service.OrdersService;
import com.demo.spring.jpa.utils.OrdersConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = OrdersConstants.ORDERS_SERVICE_PATH)
@Slf4j
//public class OrdersRestImpl implements OrdersRest {
public class OrdersRestImpl  {
    private OrdersService ordersService;

    public OrdersRestImpl(OrdersService ordersService){
        this.ordersService = ordersService;
    }
    @GetMapping(value = "/get/{orderId}")
    public ResponseEntity<?> getOrderDetails(@PathVariable("orderId") String orderId) {
        log.info("-------------------------------------------------------");
        Long orderIdLong = Long.valueOf(orderId);
        return (new ResponseEntity<Orders>(ordersService.getOrder(orderIdLong), HttpStatus.OK));
    }

    @GetMapping(value = "/order/{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable("orderId") String orderId) {
        log.info("-------------------------------------------------------");
        Long orderIdLong = Long.valueOf(orderId);
        return (new ResponseEntity<Orders>(ordersService.getOrder(orderIdLong), HttpStatus.OK));
    }

    @PostMapping(value = "/order",produces = {"application/json","application/xml"})
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest,
                                         @RequestHeader String transactionId) {
        log.info("----------------createOrder---------------------------------------");
         Orders orders = ordersService.createOrder(orderRequest);
        //OrdersSample orders = ordersService.createOrderSample(orderRequest);
        return (new ResponseEntity<>(orders, HttpStatus.OK));
       // return (new ResponseEntity<>(orders, HttpStatus.OK));
    }

}
