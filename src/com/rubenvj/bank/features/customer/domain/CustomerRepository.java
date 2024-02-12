package com.rubenvj.bank.features.customer.domain;

public interface CustomerRepository {
    public void createCustomer (Customer customer);
    public Customer printCustomer (String dni);
}
