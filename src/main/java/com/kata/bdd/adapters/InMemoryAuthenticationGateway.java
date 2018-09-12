package com.kata.bdd.adapters;

import com.kata.bdd.domain.Customer;
import com.kata.bdd.domain.gateways.AuthenticationGateway;

import java.util.Optional;

public class InMemoryAuthenticationGateway implements AuthenticationGateway {
    private Customer currentCustomer;

    @Override
    public void authenticate(Customer customer) {
        currentCustomer = customer;
    }

    @Override
    public Optional<Customer> currentCustomer() {
        return Optional.ofNullable(currentCustomer);
    }
}
