package com.rubenvj.bank.features.bankAccount.domain;

import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.bankProducts.domain.BankProduct;
import com.rubenvj.bank.features.bankProducts.domain.CreateBankProductUseCase;
import com.rubenvj.bank.features.customer.domain.Customer;
import com.rubenvj.bank.features.customer.domain.CustomerRepository;

public class CreateBankAccountUseCase {
    private final BankAccountDataRepository bankAccountDataRepository;
    private final CustomerRepository customerRepository;

    public CreateBankAccountUseCase (CustomerRepository customerRepository, BankAccountDataRepository bankAccountDataRepository) {
        this.bankAccountDataRepository = bankAccountDataRepository;
        this.customerRepository = customerRepository;
    }

    public void execute (String dni) {
        Customer customer = customerRepository.printCustomer(dni);
        BankAccount bankAccount = new BankAccount("asdsd", "0", customer, null, null);
        this.bankAccountDataRepository.createBankAccount(bankAccount);
    }
}
