package com.rubenvj.bank.features.transaction.presentation;

import com.rubenvj.bank.features.bankProducts.data.BankProductsDataRepository;
import com.rubenvj.bank.features.bankProducts.domain.GetBankProductsUseCase;
import com.rubenvj.bank.features.transaction.data.TransactionDataRepository;
import com.rubenvj.bank.features.transaction.domain.CreateTransactionUseCase;
import com.rubenvj.bank.features.transaction.domain.GetTransactionsUseCase;
import com.rubenvj.bank.features.transaction.domain.Transaction;

public class MainTransaction {
    public static void createTransaction (Transaction transaction) {
        TransactionDataRepository transactionDataRepository = TransactionDataRepository.newInstance();
        CreateTransactionUseCase createTransactionUseCase = new CreateTransactionUseCase(transactionDataRepository);
        createTransactionUseCase.execute(transaction);
    }

    public static void printTransactions () {
        TransactionDataRepository transactionDataRepository = TransactionDataRepository.newInstance();
        GetTransactionsUseCase getTransactionsUseCase = new GetTransactionsUseCase(transactionDataRepository);
        getTransactionsUseCase.execute();
    }
}
