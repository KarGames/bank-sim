package me.kar.banks;

import me.kar.banks.accounts.PremiumAccount;
import me.kar.banks.accounts.RegularAccount;

import java.util.Random;

public class BankSimulation {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();

        RegularAccount regularAccount = new RegularAccount(1);
        PremiumAccount premiumAccount = new PremiumAccount(2);
        RegularAccount regularAccount2 = new RegularAccount(3);

        Transaction transaction = new Transaction(regularAccount, premiumAccount, 1500);

        regularAccount.balance = 1500;
        premiumAccount.balance = 10000;
        regularAccount2.balance = 400;

        bank.handleTransaction(transaction);

        System.out.println(regularAccount.balance);
        System.out.println(premiumAccount.balance);

        Transaction transaction2 = new Transaction(premiumAccount, regularAccount, 2000);

        bank.handleTransaction(transaction2);

        regularAccount.saveBalance();
        regularAccount2.saveBalance();
        premiumAccount.saveBalance();

        System.out.println(regularAccount.balance);
        System.out.println(premiumAccount.balance);
    }
}
