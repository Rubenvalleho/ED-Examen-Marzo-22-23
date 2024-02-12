package com.rubenvj.bank.features.transaction.domain;

import com.rubenvj.bank.features.transaction.data.TransactionDataRepository;

public class CreateTransactionUseCase {
    private final TransactionDataRepository transactionDataRepository;

    public CreateTransactionUseCase(TransactionDataRepository transactionDataRepository){
        this.transactionDataRepository = transactionDataRepository;
    }

    public void execute (Transaction transaction) {
        transactionDataRepository.createTransaction(transaction);
    }
}
