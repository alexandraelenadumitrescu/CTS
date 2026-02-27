package practice5_solid_before.src.ro.cts.solid.before.s;

import java.io.FileWriter;
import java.io.IOException;

// Violates SRP (Single Responsibility Principle):
// This class is responsible for employee data, calculating salary (with tax logic),
// and persisting/logging the calculation to a file.
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        // Logic 1: Calculating tax
        double tax = salary * 0.45;
        double netSalary = salary - tax;
        System.out.println("Net Salary for " + name + " is: " + netSalary);

        // Logic 2: Persistence/Logging (Should be in a separate class)
        try (FileWriter writer = new FileWriter("salary_logs.txt", true)) {
            writer.write("Calculated salary for " + name + " - Net: " + netSalary + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // getters and setters...
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
