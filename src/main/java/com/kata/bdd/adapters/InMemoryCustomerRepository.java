package com.kata.bdd.adapters;

import com.kata.bdd.domain.Customer;
import com.kata.bdd.domain.repository.CustomerRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public class InMemoryCustomerRepository implements CustomerRepository {

    Set<Customer> customers = new LinkedHashSet<>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }
}
