package com.example.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(path = "api/v1/customer")
@RestController
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService service) {

        this.customerService = service;
    }

    @GetMapping(value = "all")
    public List<Customer> getCustomers() {

        return this.customerService.getCustomers();
    }

    @PostMapping
    public void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping()
    public void updateCustomer(@RequestBody Customer customer) {
        System.out.println("PUT UpdateCustomer requeste");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE Request for customer with id: " + id);
    }
}
