package com.rubenvj.bank.features.bankAccount.domain;

import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.customer.data.CustomerDataRepository;
import com.rubenvj.bank.features.customer.domain.Customer;

public class CreateBankAccountUseCase {
    private final BankAccountDataRepository bankAccountDataRepository;
    private final CustomerDataRepository customerDataRepository;

    public CreateBankAccountUseCase (CustomerDataRepository customerDataRepository, BankAccountDataRepository bankAccountDataRepository) {
        this.bankAccountDataRepository = bankAccountDataRepository;
        this.customerDataRepository = customerDataRepository;
    }

    public void execute (String dni) {
        Customer customer = customerDataRepository.printCustomer(dni);
        BankAccount bankAccount = new BankAccount("0000", "0", customer, null, null);
        this.bankAccountDataRepository.createBankAccount(bankAccount);
    }
}
