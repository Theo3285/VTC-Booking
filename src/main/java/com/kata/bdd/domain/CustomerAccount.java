package com.kata.bdd.domain;

import java.math.BigDecimal;

public class CustomerAccount {
    private final String id;
    private final BigDecimal balance;
    private final BigDecimal creditNote;

    public CustomerAccount(String id, BigDecimal balance, BigDecimal creditNote) {
        this.id = id;
        this.balance = balance;
        this.creditNote = creditNote;
    }
}
