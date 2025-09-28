package com.gkfcsolution.springbootjpaentitymapping.entity.dto;

import com.gkfcsolution.springbootjpaentitymapping.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created on 2025 at 20:24
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:24
 */@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDto {

    private String name;
    private String email;
    private String gender;
    private List<Product> products;
}
