package com.kata.bdd.domain.gateways;

import com.kata.bdd.domain.Customer;

public interface AuthenticationGateway {
    void authenticate(Customer customer);
}
