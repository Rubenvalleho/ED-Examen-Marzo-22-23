package com.rubenvj.bank.features.bankAccount.domain;

import com.rubenvj.bank.features.customer.domain.Customer;
import com.rubenvj.bank.features.transaction.domain.Transaction;

import java.util.ArrayList;

public class BankAccount {
    private final String accountNumber;
    private final String contractedProducts;
    private final String balance;
    private final Customer customer;
    private final ArrayList<Transaction> transactions;

    public BankAccount (String accountNumber, String contractedProducts, String balance, Customer customer, ArrayList<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.contractedProducts = contractedProducts;
        this.balance = balance;
        this.customer = customer;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getContractedProducts() {
        return contractedProducts;
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

}
