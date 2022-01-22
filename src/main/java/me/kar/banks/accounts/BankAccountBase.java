package me.kar.banks.accounts;

import me.kar.banks.Transaction;

import java.util.List;

public interface BankAccountBase {
    void setBalance(int balance);
    int getBalance();

    List<Transaction> getTransactionHistory();
}
