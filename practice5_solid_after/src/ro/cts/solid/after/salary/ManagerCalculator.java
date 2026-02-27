package ro.cts.solid.after.salary;

public class ManagerCalculator implements ISalaryCalculator {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary + (baseSalary * 0.20); // 20% Bonus for Managers
    }
}
