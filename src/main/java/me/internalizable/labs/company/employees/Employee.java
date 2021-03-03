package me.internalizable.labs.company.employees;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.internalizable.labs.bank.BankAccount;

@Getter
@Setter
@RequiredArgsConstructor
public class Employee {
    private final String name;
    private final int employeeID;
    private final int vacationDays;

    private BankAccount bankAccount;
}
