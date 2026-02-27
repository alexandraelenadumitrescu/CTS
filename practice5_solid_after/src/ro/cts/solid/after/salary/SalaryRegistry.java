package ro.cts.solid.after.salary;

import java.util.HashMap;
import java.util.Map;

// Registry class: Maps EmployeeType to its specialized Calculator.
// Now, if you add a new employee type, you just register it here.
public class SalaryRegistry {
    private static final Map<EmployeeType, ISalaryCalculator> calculators = new HashMap<>();

    static {
        calculators.put(EmployeeType.MANAGER, new ManagerCalculator());
        calculators.put(EmployeeType.STANDARD, new StandardCalculator());
        // For Contractor, we can add a specialized one or use a lambda
        calculators.put(EmployeeType.CONTRACTOR, base -> base); // No bonus for contractors
    }

    public static ISalaryCalculator getCalculator(EmployeeType type) {
        return calculators.getOrDefault(type, base -> 0.0); // Default to zero if unknown
    }
}
