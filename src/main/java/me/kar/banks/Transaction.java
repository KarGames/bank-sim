package me.kar.banks;

import me.kar.banks.accounts.BankAccountBase;

public class Transaction {
    int amount;
    BankAccountBase accountFrom;
    BankAccountBase accountTo;
    long time;

    Transaction(BankAccountBase accountFrom, BankAccountBase accountTo, int amount) {
        this.amount = amount;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.time = System.currentTimeMillis();
    }
}
