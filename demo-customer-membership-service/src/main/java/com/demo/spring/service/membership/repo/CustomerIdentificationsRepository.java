package com.demo.spring.service.membership.repo;

import com.demo.spring.service.membership.model.CustomerIdentifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerIdentificationsRepository extends JpaRepository<CustomerIdentifications,Long> {

}
