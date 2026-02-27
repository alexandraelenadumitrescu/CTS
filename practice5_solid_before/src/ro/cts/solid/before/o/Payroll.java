package ro.cts.solid.before.o;

import java.util.List;

// Violates OCP (Open/Closed Principle):
// To add a new type of employee bonus (e.g., Intern), we have to modify THIS CLASS.
public class Payroll {
    
    public void calculateTotalBonuses(List<Employee> employees) {
        for (Employee emp : employees) {
            // Using instanceof or types violates OCP.
            // If we add Manager, we have to change this loop.
            if (emp.getType().equals("Manager")) {
                System.out.println("Manager gets a 20% bonus.");
            } else if (emp.getType().equals("Standard")) {
                System.out.println("Standard Employee gets a 10% bonus.");
            }
        }
    }
}
