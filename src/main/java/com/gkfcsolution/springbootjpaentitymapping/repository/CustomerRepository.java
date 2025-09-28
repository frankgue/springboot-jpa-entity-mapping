package com.gkfcsolution.springbootjpaentitymapping.repository;

import com.gkfcsolution.springbootjpaentitymapping.entity.Customer;
import com.gkfcsolution.springbootjpaentitymapping.entity.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created on 2025 at 20:13
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:13
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.gkfcsolution.springbootjpaentitymapping.entity.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    List<OrderResponse> getJoinInformation();
}
