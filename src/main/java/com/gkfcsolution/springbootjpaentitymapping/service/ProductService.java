package com.gkfcsolution.springbootjpaentitymapping.service;

import com.gkfcsolution.springbootjpaentitymapping.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created on 2025 at 20:15
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:15
 */
@Service
@RequiredArgsConstructor
public class ProductService {
    private  final ProductRepository productRepository;
}
