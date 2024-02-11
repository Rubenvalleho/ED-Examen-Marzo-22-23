package com.rubenvj.bank.features.bankProducts.domain;

import com.rubenvj.bank.features.bankProducts.data.BankProductsDataRepository;

public class CreateBankProductUseCase {
    private final BankProductsDataRepository bankProductsDataRepository;

    public CreateBankProductUseCase(BankProductsDataRepository bankProductsDataRepository) {
        this.bankProductsDataRepository = bankProductsDataRepository;
    }

    public void execute (BankProduct bankProduct) {
        this.bankProductsDataRepository.createBankProduct(bankProduct);
    }
}
