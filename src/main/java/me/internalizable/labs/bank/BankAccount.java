package me.internalizable.labs.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.internalizable.labs.bank.transaction.Transaction;
import me.internalizable.labs.bank.transaction.TransactionType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Getter
@Setter
public class BankAccount {

    private int accountNumber;
    private double balance;

    private float interestRate = 0.05F;

    private List<Transaction> accountTransactions;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if(amount <= 0)
            throw new ArithmeticException();

        accountTransactions.add(Transaction.builder()
                .amount(amount)
                .transactionType(TransactionType.DEPOSIT)
                .build());

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0)
            throw new ArithmeticException();

        accountTransactions.add(Transaction.builder()
                .amount(amount)
                .transactionType(TransactionType.WITHDRAW)
                .build());

        this.balance -= amount;
    }

    public boolean overdrawn() {
        return this.balance < 0;
    }

    public void addInterest() {
        this.balance += (this.balance * interestRate);
    }

    public void statementOfAccount() {
        System.out.println("Your current account balance is: " + balance + (overdrawn() ? " (Overdrawn)" : ""));

        accountTransactions.subList(accountTransactions.size() - 5, accountTransactions.size() - 1).forEach(transaction -> {
            System.out.println("Transaction: " + transaction.getTransactionType());
            System.out.println("Transaction Amount: " + transaction.getAmount());
        });

    }

}
