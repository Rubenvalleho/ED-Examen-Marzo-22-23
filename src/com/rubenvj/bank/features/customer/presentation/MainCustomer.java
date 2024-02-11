package com.rubenvj.bank.features.customer.presentation;

import com.rubenvj.bank.features.customer.data.CustomerDataRepository;
import com.rubenvj.bank.features.customer.domain.CreateCustomerUseCase;
import com.rubenvj.bank.features.customer.domain.Customer;
import com.rubenvj.bank.features.customer.domain.GetCustomerUseCase;

public class MainCustomer {

    public static void createCustomer (Customer customer) {
        CustomerDataRepository customerDataRepository = CustomerDataRepository.newInstance();
        CreateCustomerUseCase createCustomerUseCase = new CreateCustomerUseCase(customerDataRepository);
        createCustomerUseCase.execute(customer);
    }

    public static void printCustomer (String dni) {
        CustomerDataRepository customerDataRepository = CustomerDataRepository.newInstance();
        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataRepository);
        getCustomerUseCase.execute(dni);
    }
}
