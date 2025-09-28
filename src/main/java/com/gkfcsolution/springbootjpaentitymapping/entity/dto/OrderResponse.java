package com.gkfcsolution.springbootjpaentitymapping.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created on 2025 at 21:03
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 21:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {
    private String name;
    private String productName;
}
