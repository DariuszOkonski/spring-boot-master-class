package com.example.springbootmasterclass.customer;

import com.example.springbootmasterclass.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getCustomers() {
        return this.customerService.getCustomers();
    }

    @GetMapping(path = ("{customerId}"))
    public Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    public Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException(
                "ApiRequestException for customer:" + id
        );
    }

    @PostMapping
    public void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("POST REQUEST v2");
        System.out.println(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        System.out.println("PUT REQUEST v2");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST v2");
        System.out.println(id);
    }
}
