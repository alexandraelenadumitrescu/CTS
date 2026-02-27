package practice5_solid_before.src.ro.cts.solid.before.l;

// Violates LSP (Liskov Substitution Principle):
// Contractor is an Employee but cannot take vacation.
// Throwing an exception breaks the contract of the base class.
public class Contractor extends ro.cts.solid.before.l.Employee {
    
    public Contractor(String name) {
        super(name);
    }

    @Override
    public void takeVacation() {
        throw new UnsupportedOperationException("Contractors don't get vacation!");
    }
}
