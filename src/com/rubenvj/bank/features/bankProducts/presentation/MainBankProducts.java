package com.rubenvj.bank.features.bankProducts.presentation;

import com.rubenvj.bank.features.bankProducts.data.BankProductsDataRepository;
import com.rubenvj.bank.features.bankProducts.domain.BankProduct;
import com.rubenvj.bank.features.bankProducts.domain.CreateBankProductUseCase;
import com.rubenvj.bank.features.bankProducts.domain.GetBankProductsUseCase;

public class MainBankProducts {
    public static void createProducts (BankProduct bankProduct) {
        BankProductsDataRepository bankProductsDataRepository = BankProductsDataRepository.newInstance();
        CreateBankProductUseCase createBankProductUseCase = new CreateBankProductUseCase(bankProductsDataRepository);
        createBankProductUseCase.execute(bankProduct);
    }

    public static void printBankProduct (String id) {
        BankProductsDataRepository bankProductsDataRepository = BankProductsDataRepository.newInstance();
        GetBankProductsUseCase getBankProductsUseCase = new GetBankProductsUseCase(bankProductsDataRepository);
        getBankProductsUseCase.execute(id);
    }
}
