package com.gkfcsolution.springbootjpaentitymapping.controller;

import com.gkfcsolution.springbootjpaentitymapping.entity.Customer;
import com.gkfcsolution.springbootjpaentitymapping.entity.dto.CustomerDto;
import com.gkfcsolution.springbootjpaentitymapping.entity.dto.OrderRequest;
import com.gkfcsolution.springbootjpaentitymapping.repository.CustomerRepository;
import com.gkfcsolution.springbootjpaentitymapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created on 2025 at 20:17
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:17
 */
@RestController
@RequestMapping("/api/v1/orders")
public class OrderCrontroller {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
//        customerRepository.save(request)
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
}
