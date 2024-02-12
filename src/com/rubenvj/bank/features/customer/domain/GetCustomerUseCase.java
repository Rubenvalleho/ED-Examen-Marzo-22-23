package com.rubenvj.bank.features.customer.domain;

import com.rubenvj.bank.features.customer.data.CustomerDataRepository;

public class GetCustomerUseCase {
    private final CustomerDataRepository customerDataRepository;
    public GetCustomerUseCase (CustomerDataRepository customerDataRepository) {
        this.customerDataRepository = customerDataRepository;
    }

    public void execute (String dni) {
        customerDataRepository.printCustomer(dni);
    }
}
