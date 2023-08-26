package com.hieu.factory;

public class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
