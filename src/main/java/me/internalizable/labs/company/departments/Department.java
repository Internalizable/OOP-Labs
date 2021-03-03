package me.internalizable.labs.company.departments;

import lombok.Getter;
import lombok.Setter;
import me.internalizable.labs.company.employees.Employee;

import java.util.ArrayList;

@Getter
@Setter
public class Department {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void assign(Employee employee) {
        employeeArrayList.add(employee); //todo maybe add checks if already exists
    }

    public void dismiss(Employee employee) {
        employeeArrayList.remove(employee);
    }

    public void printEmployees() {
        employeeArrayList.forEach(employee -> {
            System.out.println();
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Vacation Days: " + employee.getVacationDays());
        });
    }
}
