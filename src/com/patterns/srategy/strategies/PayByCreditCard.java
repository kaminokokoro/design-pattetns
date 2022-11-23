package com.patterns.srategy.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the Card Verification Value code: ");
            String cardVerificationValue = READER.readLine();

            if (CreditCardValidator.isValid(number)) card = new CreditCard(number, date, cardVerificationValue);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }



    public boolean cardIsPresent() {
        return card != null;
    }
}
