package com.hieu.factory;

public class InvestmentAccount implements Account {

    private double balance;

    public InvestmentAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double getBalance() {
        return balance;
    }
}
