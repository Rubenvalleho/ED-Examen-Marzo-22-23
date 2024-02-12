package com.rubenvj.bank.features.bankAccount.domain;

import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.bankProducts.domain.BankProduct;
import com.rubenvj.bank.features.bankProducts.domain.CreateBankProductUseCase;

public class CreateBankAccountUseCase {
    private final BankAccountDataRepository bankAccountDataRepository;

    public CreateBankAccountUseCase (BankAccountDataRepository bankAccountDataRepository) {
        this.bankAccountDataRepository = bankAccountDataRepository;
    }

    public void execute (BankAccount bankAccount) {
        this.bankAccountDataRepository.createBankAccount(bankAccount);
    }
}
