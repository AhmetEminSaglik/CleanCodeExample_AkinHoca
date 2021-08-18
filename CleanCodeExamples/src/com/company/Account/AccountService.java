package com.company.Account;

public class AccountService {
    private static final double EFT_CHARGE = 3.60;
    private AmountValidator validator = new AmountValidator();

    public void withdraw(Account account, double amount) {
        validator.validate(amount);
        account.withdraw(amount);


        AccountAction withdraw = new Withdraw();
        withdraw.act(account, amount);

    }

    public void deposite(Account account, double amount) {
        validator.validate(amount);
        account.deposit(amount);
        System.out.println("account'a " + amount + " $ yatirildi");


    }

    public void eft(Account sourceAccount, Account targetAccount, double amount) {
        validator.validate(amount);
        sourceAccount.withdraw(amount);
        sourceAccount.withdraw(amount);
        targetAccount.deposit(amount);

        System.out.println("Eft yapildi, miktar : " + amount);


    }
}
