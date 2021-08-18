package com.company.Account;

public class Main {
    public static void main(String args[]) {
        Account account1 = new Account();
        Account account2 = new Account();


        AccountService accountService = new AccountService();
        accountService.withdraw(account1, 300);


        accountService.deposite(account1, 1000);

        accountService.eft(account1, account2, 350);


        AccountAction deposit = new Deposit();
        AccountAction withdraw = new Withdraw();


    }
}
