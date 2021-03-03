package me.internalizable.labs.company.employees;

import lombok.Getter;
import lombok.Setter;
import me.internalizable.labs.bank.BankAccount;

@Getter
@Setter
public class FullTime extends Employee {
    private double monthlySalary;

    public FullTime(String name, int employeeID, int vacationDays, double monthlySalary, int accountNumber) {
        super(name, employeeID, vacationDays);

        this.monthlySalary = monthlySalary;
        super.setBankAccount(new BankAccount(accountNumber));
    }
}
