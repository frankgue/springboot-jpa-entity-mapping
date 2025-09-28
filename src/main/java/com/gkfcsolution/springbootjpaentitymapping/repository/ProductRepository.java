package com.gkfcsolution.springbootjpaentitymapping.repository;

import com.gkfcsolution.springbootjpaentitymapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 20:14
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:14
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
