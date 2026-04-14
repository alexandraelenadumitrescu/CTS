package s1.autonomous_driving_prototype.implementare;

import java.util.List;

public abstract class AutonomousDriving {
    private String version;
    private List<String> decisionRules;

    public AutonomousDriving(String version) throws InterruptedException
    {
        this.version = version;
        System.out.println("Start AI module....");
        Thread.sleep(5000);
        System.out.println("Init AI module....learning done");
    }

    abstract void applyRule(int index, String context);
}