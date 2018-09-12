package com.kata.bdd.adapters;

import com.kata.bdd.domain.CustomerAccount;
import com.kata.bdd.domain.repositories.CustomerAccountRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public class InMemoryCustomerAccountRepository implements CustomerAccountRepository {

    private Set<CustomerAccount> customerAccounts = new LinkedHashSet<>();

    public void add(CustomerAccount customerAccount) {
        customerAccounts.add(customerAccount);
    }

    public Set<CustomerAccount> all() {
        return customerAccounts;
    }
}
