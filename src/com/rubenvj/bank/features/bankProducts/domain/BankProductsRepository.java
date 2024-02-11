package com.rubenvj.bank.features.bankProducts.domain;

import java.util.ArrayList;

public interface BankProductsRepository {
    public void createBankProduct(BankProduct bankProduct);
    public BankProduct printBankProduct(String id);
}
