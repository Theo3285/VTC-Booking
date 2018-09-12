package com.kata.bdd.domain.repositories;

import com.kata.bdd.domain.CustomerAccount;

import java.util.Collection;
import java.util.Set;

public interface CustomerAccountRepository {
    void add(CustomerAccount customerAccount);

    Set<CustomerAccount> all();
}
