package com.rubenvj.bank.features.transaction.data;

import com.rubenvj.bank.features.transaction.domain.Transaction;
import com.rubenvj.bank.features.transaction.domain.TransactionRepository;

import java.util.ArrayList;

public class TransactionDataRepository implements TransactionRepository {
    public static TransactionDataRepository instance = null;

    public static TransactionDataRepository newInstance () {
        if (instance == null) {
            instance = new TransactionDataRepository();
        }
        return instance;
    }

    private final ArrayList<Transaction> transactionsData = new ArrayList<>();

    @Override
    public void createTransaction(Transaction transaction) {
        transactionsData.add(transaction);
    }

    public ArrayList<Transaction> printTransactions() {
        return transactionsData;
        }
}

