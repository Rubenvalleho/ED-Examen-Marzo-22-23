package com.rubenvj.bank.features.bankAccount.data;

import com.rubenvj.bank.features.bankAccount.domain.BankAccount;
import com.rubenvj.bank.features.bankAccount.domain.BankAccountRepository;
import com.rubenvj.bank.features.bankProducts.domain.BankProduct;

import java.util.ArrayList;

public class BankAccountDataRepository implements BankAccountRepository {
    private static BankAccountDataRepository instance = null;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public static BankAccountDataRepository newInstance () {
        if (instance == null) {
            instance = new BankAccountDataRepository();
        }
        return instance;
    }

    public void createBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }
}
