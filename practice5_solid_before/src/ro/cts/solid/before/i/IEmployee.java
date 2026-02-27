package practice5_solid_before.src.ro.cts.solid.before.i;

// Violates ISP (Interface Segregation Principle):
// All employees are forced to implement everything, even if they aren't managers or don't get benefits.
public interface IEmployee {
    void work();
    void takeVacation(); // Contractors might not have this
    void approveLeave(); // Only managers do this
}
