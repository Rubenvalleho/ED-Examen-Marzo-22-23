package com.rubenvj.bank.features.customer.data;

import com.rubenvj.bank.features.customer.domain.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomerDataRepository {
    private static CustomerDataRepository instance = null;
    private final ArrayList<Customer> customers = new ArrayList<>();

    public static CustomerDataRepository newInstance () {
        if (instance == null) {
            instance = new CustomerDataRepository();
        }
        return instance;
    }

    public void createCustomer (Customer customer) {
        customers.add(customer);
    }

    public Customer printCustomer(String dni) {
        for (Customer customer : customers) {
            if (customer.getDni().equals(dni)) {
                return customer;
            }
        }
        return null;
    }
}
