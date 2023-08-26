package com.hieu.factory;

public class DemoFactory {
    public static void main(String[] args) {
        Account savingsAccount = AccountFactory.createAccount("savings");
        Account checkingAccount = AccountFactory.createAccount("checking");
        Account investmentAccount = AccountFactory.createAccount("investment");

        savingsAccount.deposit(1000);
        checkingAccount.deposit(1500);
        investmentAccount.deposit(5000);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Investment Account Balance: " + investmentAccount.getBalance());
    }
}
