package com.rubenvj.bank.features.bankProducts.data;

import com.rubenvj.bank.features.bankProducts.domain.BankProduct;
import com.rubenvj.bank.features.bankProducts.domain.BankProductsRepository;

import java.util.ArrayList;

public class BankProductsDataRepository implements BankProductsRepository {

    public static BankProductsDataRepository instance = null;
    public ArrayList<BankProduct> bankProducts = new ArrayList<>();

    public static BankProductsDataRepository newInstance () {
        if (instance == null) {
            instance = new BankProductsDataRepository();
        }
        return instance;
    }

    public void createBankProduct(BankProduct bankProduct) {
        bankProducts.add(bankProduct);
    }

    @Override

    public BankProduct printBankProduct(String id) {
        for (BankProduct bankProduct : bankProducts) {
            if (bankProduct.getId().equals(id)) {
                return bankProduct;
            }
        }
        return null;
    }
}
