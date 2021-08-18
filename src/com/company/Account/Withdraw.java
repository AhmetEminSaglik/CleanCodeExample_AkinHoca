package com.company.Account;

public class Withdraw implements AccountAction {

    @Override
    public void act(Account account, double amount) {
        account.withdraw(amount);

    }
}
