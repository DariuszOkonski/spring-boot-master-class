package com.example.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService service) {
        this.customerService = service;
    }

    @GetMapping
    List<Customer> getCustomers() {
        return this.customerService.getCustomers();
    }
}
