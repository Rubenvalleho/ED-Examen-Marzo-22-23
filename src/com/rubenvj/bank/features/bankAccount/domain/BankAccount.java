package com.rubenvj.bank.features.bankAccount.domain;

import com.rubenvj.bank.features.bankProducts.domain.BankProduct;
import com.rubenvj.bank.features.customer.domain.Customer;
import com.rubenvj.bank.features.transaction.domain.Transaction;

import java.util.ArrayList;

public class BankAccount {
    private final String accountNumber;
    private final String balance;
    private final Customer customer;
    private final ArrayList<Transaction> transactions;
    private final BankProduct bankProduct;

    public BankAccount (String accountNumber, String balance, Customer customer, ArrayList<Transaction> transactions, BankProduct bankProduct) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.transactions = transactions;
        this.bankProduct = bankProduct;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public BankProduct getBankProduct() {
        return bankProduct;
    }
}
