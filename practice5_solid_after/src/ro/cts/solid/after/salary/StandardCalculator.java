package ro.cts.solid.after.salary;

public class StandardCalculator implements ISalaryCalculator {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary + (baseSalary * 0.10); // 10% Bonus for Standard Employees
    }
}
