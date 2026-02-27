package ro.cts.solid.after.salary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("Stefan", 3000, EmployeeType.STANDARD));
        employees.add(new Employee("Lulu", 5000, EmployeeType.MANAGER));
        employees.add(new Employee("Alex", 4000, EmployeeType.CONTRACTOR));
        
        System.out.println("Processing salary calculation...");
        for (Employee emp : employees) {
            double total = emp.calculateTotalSalary();
            System.out.println(emp.getName() + " - Total Salary: " + total);
        }
    }
}
