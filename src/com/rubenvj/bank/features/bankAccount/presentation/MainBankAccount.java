package com.rubenvj.bank.features.bankAccount.presentation;

import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.bankAccount.domain.BankAccount;
import com.rubenvj.bank.features.bankAccount.domain.CreateBankAccountUseCase;
import com.rubenvj.bank.features.customer.data.CustomerDataRepository;
import com.rubenvj.bank.features.customer.domain.CustomerRepository;

public class MainBankAccount {
    public static void createAccount(String dni) {
        BankAccountDataRepository bankAccountDataRepository = BankAccountDataRepository.newInstance();
        CustomerDataRepository customerDataRepository = CustomerDataRepository.newInstance();
        CreateBankAccountUseCase createBankAccountUseCase = new CreateBankAccountUseCase(customerDataRepository,bankAccountDataRepository);
        createBankAccountUseCase.execute(dni);
    }
}
