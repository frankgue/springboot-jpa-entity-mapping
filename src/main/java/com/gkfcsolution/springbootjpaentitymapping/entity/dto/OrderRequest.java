package com.gkfcsolution.springbootjpaentitymapping.entity.dto;

import com.gkfcsolution.springbootjpaentitymapping.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created on 2025 at 20:17
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;
}
