package me.kar.banks.accounts;

public class PremiumAccount extends RegularAccount {
    @Override
    public void setBalance(int balance) {
        this.balance = balance + 5;
    }
}
