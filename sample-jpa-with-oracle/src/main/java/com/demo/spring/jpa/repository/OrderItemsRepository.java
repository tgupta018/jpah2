package com.demo.spring.jpa.repository;

import com.demo.spring.jpa.domain.OrderItems;
import com.demo.spring.jpa.domain.OrderItemsPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems, OrderItemsPK> {
}
