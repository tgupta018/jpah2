package com.demo.spring.service.membership.repo;

import com.demo.spring.service.membership.model.MembershipsBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipsBaseRepository extends JpaRepository<MembershipsBase,Long> {
}
