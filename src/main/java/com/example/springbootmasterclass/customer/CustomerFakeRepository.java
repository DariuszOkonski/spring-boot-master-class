package com.example.springbootmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
@Repository
public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Jamila Ahmed", "123password")
        );
    }
}
