package com.kata.bdd.adapters;

import com.kata.bdd.domain.Customer;
import com.kata.bdd.domain.repositories.CustomerRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public class InMemoryCustomerRepository implements CustomerRepository {

    private Set<Customer> customers = new LinkedHashSet<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Set<Customer> all() {
        return customers;
    }
}
