package com.example.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getCustomers() {
        return this.customerRepo.getCustomers();
    }
}


// public CustomerService(@Qualifier("fake") CustomerRepo customerRepo)