package com.rubenvj.bank.features.transaction.domain;

import com.rubenvj.bank.features.transaction.data.TransactionDataRepository;

public class GetTransactionsUseCase {
    private final TransactionDataRepository transactionDataRepository;
    public GetTransactionsUseCase (TransactionDataRepository transactionDataRepository) {
        this.transactionDataRepository = transactionDataRepository;
    }

    public void execute () {
        transactionDataRepository.printTransactions();
    }
}
