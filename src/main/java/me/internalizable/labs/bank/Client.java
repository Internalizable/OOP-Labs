package me.internalizable.labs.bank;

import java.util.List;

public class Client {

    private List<BankAccount> bankAccount;

    private int defaultAccountIndex = 0;

    public void openBankAccount(int accountNumber) {
        if(bankAccount.stream().noneMatch(filteredAccount -> filteredAccount.getAccountNumber() == accountNumber))
            bankAccount.add(new BankAccount(accountNumber));
    }

    public void deposit(double amount) {
        bankAccount.get(defaultAccountIndex).deposit(amount);
    }

    public void deposit(double amount, int accountNumber) {
        bankAccount.stream()
                .filter(filteredAccount -> filteredAccount.getAccountNumber() == accountNumber)
                .findAny()
                .ifPresent(filteredAccount -> filteredAccount.deposit(amount));
    }

    public void withdraw(double amount) {
        bankAccount.get(defaultAccountIndex).withdraw(amount);
    }

    public void withdraw(double amount, int accountNumber) {
        bankAccount.stream()
                .filter(filteredAccount -> filteredAccount.getAccountNumber() == accountNumber)
                .findAny()
                .ifPresent(filteredAccount -> filteredAccount.withdraw(amount));
    }

    public void bankStatement() {
        bankAccount.get(defaultAccountIndex).statementOfAccount();
    }

    public void bankStatement(int accountNumber) {
        bankAccount.stream()
                .filter(filteredAccount -> filteredAccount.getAccountNumber() == accountNumber)
                .findAny()
                .ifPresent(BankAccount::statementOfAccount);
    }

    public void assignDefaultBankAccount(int accountNumber) {
        bankAccount.stream()
                .filter(filteredAccount -> filteredAccount.getAccountNumber() == accountNumber)
                .findAny()
                .ifPresent(filteredAccount -> defaultAccountIndex = bankAccount.indexOf(filteredAccount));
    }
}
