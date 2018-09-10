package com.kata.bdd.domain.repositories;

import com.kata.bdd.domain.Customer;

import java.util.Set;

public interface CustomerRepository {

    void add(Customer customer);

    Set<Customer> all();
}
