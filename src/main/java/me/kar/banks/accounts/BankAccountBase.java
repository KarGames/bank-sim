package me.kar.banks.accounts;

import me.kar.banks.Transaction;

import java.io.IOException;
import java.util.List;

public interface BankAccountBase {
    void setBalance(int balance);
    int getBalance();
    void saveBalance() throws IOException;

    List<Transaction> getTransactionHistory();
}
