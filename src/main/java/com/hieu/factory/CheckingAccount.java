package com.hieu.factory;

public class CheckingAccount implements Account {

    private double balance;

    public CheckingAccount() {
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
