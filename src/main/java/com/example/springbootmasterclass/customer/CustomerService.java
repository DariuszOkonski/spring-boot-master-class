package com.example.springbootmasterclass.customer;

import com.example.springbootmasterclass.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

//    @Autowired
//    public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
//        this.customerRepo = customerRepo;
//    }

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    public Customer getCustomer(Long id) {
        return customerRepo.getCustomers()
                .stream()
                .filter(customer -> customer.getCustomerId().equals(id))
                .findFirst()
                .orElseThrow(
                        () -> new NotFoundException("customer with id:" + id + " not found"));
    }
}
