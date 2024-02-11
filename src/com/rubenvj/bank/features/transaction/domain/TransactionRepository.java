package com.rubenvj.bank.features.transaction.domain;

import java.util.ArrayList;

public interface TransactionRepository {
    public void createTransaction(Transaction transaction);

    public ArrayList<Transaction> printTransactions ();
}
