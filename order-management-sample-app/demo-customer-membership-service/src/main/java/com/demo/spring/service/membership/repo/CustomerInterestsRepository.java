package com.demo.spring.service.membership.repo;

import com.demo.spring.service.membership.model.CustomerInterests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerInterestsRepository extends JpaRepository<CustomerInterests,Long> {
}
