package com.example.springbootmasterclass.customer;

import java.util.Collections;
import java.util.List;

//@Repository
//@Primary
public class CustomerRepository implements  CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
//        TODO connect to real db
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db", "todo", "email@gmail.com")
        );
    }
}
