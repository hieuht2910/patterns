package com.hieu.factory;

public class AccountFactory {
    public static Account createAccount(String accountType) {
        switch (accountType) {
            case "savings":
                return new SavingsAccount();
            case "checking":
                return new CheckingAccount();
            case "investment":
                return new InvestmentAccount();
            default:
                throw new IllegalArgumentException("Invalid account type");
        }
    }
}
