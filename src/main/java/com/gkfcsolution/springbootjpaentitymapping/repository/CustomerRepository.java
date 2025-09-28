package com.gkfcsolution.springbootjpaentitymapping.repository;

import com.gkfcsolution.springbootjpaentitymapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
}
