package com.company.Account;

public class Account {
    private double balance;
    private String iban;

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else System.out.println("InsufficientBallanceException");
    }

    public void deposit(double amount) {
        balance += amount;
    }


}
