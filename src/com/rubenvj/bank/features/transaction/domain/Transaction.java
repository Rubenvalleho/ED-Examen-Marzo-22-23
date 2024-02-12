package com.rubenvj.bank.features.transaction.domain;

public class Transaction {
    private final String id;
    private final String movementDescription;
    private final String amountMovement;

    public Transaction (String id, String movementDescription, String amountMovement) {
        this.id = id;
        this.movementDescription = movementDescription;
        this.amountMovement = amountMovement;
    }

    public String getId() {
        return id;
    }

    public String getMovementDescription() {
        return movementDescription;
    }

    public String getAmountMovement() {
        return amountMovement;
    }
}
