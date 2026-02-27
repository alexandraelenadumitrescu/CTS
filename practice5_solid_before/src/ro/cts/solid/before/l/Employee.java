package practice5_solid_before.src.ro.cts.solid.before.l;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void takeVacation() {
        System.out.println(name + " is taking a break.");
    }
}
