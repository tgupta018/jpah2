package com.demo.spring.jpa.repository;

import com.demo.spring.jpa.domain.OrdersSample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersSampleRepository extends JpaRepository<OrdersSample,Long> {
}
