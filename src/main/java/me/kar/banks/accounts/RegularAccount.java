package me.kar.banks.accounts;

import me.kar.banks.Transaction;

import java.util.ArrayList;
import java.util.List;

public class RegularAccount implements BankAccountBase {
    public int balance;
    List<Transaction> transactionHistory = new ArrayList<>();

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

}
