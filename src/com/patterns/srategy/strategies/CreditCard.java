package com.patterns.srategy.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    CreditCard(String number, String date, String cardVerificationValue) {
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
        this.amount = 100000;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }
}
