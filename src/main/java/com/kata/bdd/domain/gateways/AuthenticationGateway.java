package com.kata.bdd.domain.gateways;

import com.kata.bdd.domain.Customer;

import java.util.Optional;

public interface AuthenticationGateway {
    void authenticate(Customer customer);

    Optional<Customer> currentCustomer();
}
