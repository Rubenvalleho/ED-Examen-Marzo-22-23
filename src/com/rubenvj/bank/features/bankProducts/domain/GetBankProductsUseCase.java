package com.rubenvj.bank.features.bankProducts.domain;

import com.rubenvj.bank.features.bankProducts.data.BankProductsDataRepository;

public class GetBankProductsUseCase {
    private final BankProductsDataRepository bankProductsDataRepository;

    public GetBankProductsUseCase (BankProductsDataRepository bankProductsDataRepository) {
        this.bankProductsDataRepository = bankProductsDataRepository;
    }

    public void execute (String id) {
        bankProductsDataRepository.printBankProduct(id);
    }
}
