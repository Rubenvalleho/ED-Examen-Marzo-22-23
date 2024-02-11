package com.rubenvj.bank.features.bankProducts.domain;

public class Mortgage extends BankProduct {
    private final String startDate;
    private final String interest;
    private final String endDate;
    private final String amountBorrowed;

    public Mortgage (String id, String name, String description, String startDate, String interest, String endDate, String amountBorrowed) {
        super (id, name, description);
        this.startDate = startDate;
        this.interest = interest;
        this.endDate = endDate;
        this.amountBorrowed = amountBorrowed;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getInterest() {
        return interest;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getAmountBorrowed() {
        return amountBorrowed;
    }
}
