package me.internalizable.labs.company.employees;

import lombok.Getter;
import lombok.Setter;
import me.internalizable.labs.bank.BankAccount;

@Getter
@Setter
public class PartTime extends Employee {
    private double ratePerHour;

    public PartTime(String name, int employeeID, int vacationDays, double ratePerHour, int accountNumber) {
        super(name, employeeID, vacationDays);

        this.ratePerHour = ratePerHour;
        super.setBankAccount(new BankAccount(accountNumber));
    }
}
