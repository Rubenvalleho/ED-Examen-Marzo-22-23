package com.rubenvj.bank.features.bankAccount.presentation;

import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.bankAccount.domain.BankAccount;
import com.rubenvj.bank.features.bankAccount.domain.CreateBankAccountUseCase;

public class MainBankAccount {
    public static void createAccount(BankAccount bankAccount) {
        BankAccountDataRepository bankAccountDataRepository = BankAccountDataRepository.newInstance();
        CreateBankAccountUseCase createBankAccountUseCase = new CreateBankAccountUseCase(bankAccountDataRepository);
        createBankAccountUseCase.execute(bankAccount);
    }
}
