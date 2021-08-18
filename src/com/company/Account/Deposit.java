package com.company.Account;

public class Deposit implements AccountAction {

    @Override
    public void act(Account account, double amount) {
        account.deposit(amount);
    }
}
