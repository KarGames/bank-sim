package me.kar.banks.accounts;

import me.kar.banks.Transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RegularAccount implements BankAccountBase {
    int ID;
    public int balance;
    List<Transaction> transactionHistory = new ArrayList<>();

    public RegularAccount(int ID) {
        this.ID = ID;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void saveBalance() throws IOException {
        Files.writeString(Path.of(getClass().getSimpleName() + this.ID), String.valueOf(this.balance));
    }

    @Override
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

}
