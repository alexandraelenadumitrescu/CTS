package practice5_solid_before.src.ro.cts.solid.before.i;

// A standard worker must implement approveLeave even if they can't do it.
public class Worker implements ro.cts.solid.before.i.IEmployee {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working...");
    }

    @Override
    public void takeVacation() {
        System.out.println(name + " is taking a break.");
    }

    @Override
    public void approveLeave() {
        // Violates ISP: Worker shouldn't even have this method in their interface.
        throw new UnsupportedOperationException("Worker cannot approve leave!");
    }
}
