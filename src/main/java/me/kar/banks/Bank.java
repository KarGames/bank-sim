package me.kar.banks;

public class Bank {
    public void handleTransaction(Transaction transaction) throws Exception {

        if (transaction.amount > transaction.accountFrom.getBalance()) {
            throw new Exception("too big of an amount to send!");
        }

        transaction.accountFrom.setBalance(transaction.accountFrom.getBalance() - transaction.amount);
        transaction.accountTo.setBalance(transaction.accountTo.getBalance() + transaction.amount);

        transaction.accountTo.getTransactionHistory().add(transaction);
        transaction.accountFrom.getTransactionHistory().add(transaction);
    }
}
