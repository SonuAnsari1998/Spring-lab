package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("hdfc")
public class HDFC implements Bank {

    private double amount;

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String deposit(double amount) {

        if (amount > 0) {
            this.amount += amount;
            return "Amount Deposited Successfully";
        }

        return "Invalid Amount";
    }

    @Override
    public String withdraw(double amount) {

        if (amount > this.amount) {
            return "Insufficient Balance";
        }

        this.amount -= amount;
        return "Withdrawal Successful";
    }

    @Override
    public String toString() {
        return "HDFC [amount=" + amount + "]";
    }
}