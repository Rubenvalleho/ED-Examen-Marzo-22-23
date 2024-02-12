package com.rubenvj.bank.features.customer.domain;

import com.rubenvj.bank.features.customer.data.CustomerDataRepository;

public class CreateCustomerUseCase {
    private final CustomerDataRepository customerDataRepository;

    public CreateCustomerUseCase (CustomerDataRepository customerDataRepository) {
        this.customerDataRepository = customerDataRepository;
    }

    public void execute (Customer customer) {
        customerDataRepository.createCustomer(customer);
    }
}
