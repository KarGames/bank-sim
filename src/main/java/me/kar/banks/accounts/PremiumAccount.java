package me.kar.banks.accounts;

public class PremiumAccount extends RegularAccount {
    public PremiumAccount(int ID) {
        super(ID);
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance + 5;
    }
}
