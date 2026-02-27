package ro.cts.solid.after.salary;

// Now Employee doesn't know HOW to calculate salary.
// It only knows it HAS a base salary and a type.
public class Employee {
    private String name;
    private double baseSalary;
    private EmployeeType type;

    public Employee(String name, double baseSalary, EmployeeType type) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.type = type;
    }

    public double calculateTotalSalary() {
        // SRP: Calculation logic is delegated to the specialized calculator.
        // OCP: We don't need 'instanceof' anymore.
        ISalaryCalculator calculator = SalaryRegistry.getCalculator(this.type);
        return calculator.calculate(this.baseSalary);
    }

    public String getName() {
        return name;
    }
}
