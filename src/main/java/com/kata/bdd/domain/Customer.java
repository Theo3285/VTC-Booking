package com.kata.bdd.domain;

public class Customer {
    private final String id;
    private final String firstName;
    private final String lastName;

    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
