package me.kar.banks;

import me.kar.banks.accounts.PremiumAccount;
import me.kar.banks.accounts.RegularAccount;

public class BankSimulation {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();

        RegularAccount regularAccount = new RegularAccount();
        PremiumAccount premiumAccount = new PremiumAccount();

        Transaction transaction = new Transaction(regularAccount, premiumAccount, 1500);

        regularAccount.balance = 1500;
        premiumAccount.balance = 10000;

        bank.handleTransaction(transaction);

        System.out.println(regularAccount.balance);
        System.out.println(premiumAccount.balance);

        Transaction transaction2 = new Transaction(premiumAccount, regularAccount, 2000);

        bank.handleTransaction(transaction2);

        System.out.println(regularAccount.balance);
        System.out.println(premiumAccount.balance);
    }
}
