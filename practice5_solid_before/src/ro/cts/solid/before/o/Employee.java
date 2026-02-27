package practice5_solid_before.src.ro.cts.solid.before.o;

public class Employee {
    private String name;
    private String type; // Manager, Standard, etc.

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
