package me.internalizable.labs.bank.transaction;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Transaction {

    private double amount;
    private TransactionType transactionType;

}
