package practice5_solid_before.src.ro.cts.solid.before.d;

import java.io.FileWriter;
import java.io.IOException;

// Violates DIP (Dependency Inversion Principle):
// The high-level Employee class depends on a low-level FileLogger (direct instantiation).
// We cannot easily switch to a ConsoleLogger or DatabaseLogger without modifying this class.
public class Employee {
    private String name;
    private FileLogger logger = new FileLogger(); // Tight coupling

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        logger.log(name + " started working.");
        System.out.println(name + " is working...");
        logger.log(name + " finished working.");
    }
}

// Low-level module
class FileLogger {
    public void log(String message) {
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.write(message + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
