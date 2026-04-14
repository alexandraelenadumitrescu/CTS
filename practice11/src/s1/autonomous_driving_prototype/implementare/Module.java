package s1.autonomous_driving_prototype.implementare;

import java.util.ArrayList;
import java.util.List;

public class Module extends AutonomousDriving implements Cloneable{
    private String version;
    private List<String> decisionRules;


    //ctr consumator de timp, apeleaza ctr din clasa de baza
    public Module(String version) throws InterruptedException {
        super(version);
        this.version=version;
        System.out.println("ce faci ba vere");
    }

    @Override
    public Module clone() throws CloneNotSupportedException {
                Module nou=(Module) super.clone();
        nou.decisionRules=new ArrayList<>(this.decisionRules);
        System.out.println("s a clonat");
        return nou;

    }

    @Override
    public void applyRule(int index, String context) {
        if(this.decisionRules==null){
            this.decisionRules=new ArrayList<>();
        }
        decisionRules.add(index,context);
    }


//    @Override
//    public Module copiaza() throws CloneNotSupportedException {
//        Module nou=(Module) super.clone();
//        nou.decisionRules=new ArrayList<>(this.decisionRules);
//        return nou;
//    }


    @Override
    public String toString() {
        return "Module{" +
                "version='" + version + '\'' +
                ", decisionRules=" + decisionRules +
                '}';
    }
}
