package com.gkfcsolution.springbootjpaentitymapping.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created on 2025 at 20:25
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {
    private int id;
    private String productName;
    private int qty;
    private int price;
}
