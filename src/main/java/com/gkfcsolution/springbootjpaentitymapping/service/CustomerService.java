package com.gkfcsolution.springbootjpaentitymapping.service;

import com.gkfcsolution.springbootjpaentitymapping.entity.Customer;
import com.gkfcsolution.springbootjpaentitymapping.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2025 at 20:16
 * File: null.java
 * Project: springboot-jpa-entity-mapping
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 20:16
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer save(Customer customer){
    return     customerRepository.save(customer);
    }
    public List<Customer> findAllOrders(){
        return  customerRepository.findAll();
    }

}
