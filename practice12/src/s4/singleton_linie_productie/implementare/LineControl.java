package s4.singleton_linie_productie.implementare;

import java.util.ArrayList;
import java.util.List;

public class LineControl implements IProductionLineControl{
    private String employeeId;
    private int speed;
    private String mode="off";
    private volatile List<String> steps;

    private volatile static  LineControl instance;


    public static synchronized LineControl getInstance(){
        if(instance==null){
            instance=new LineControl();
        }
        return instance;
    }

    @Override
    public void startLine(String employeeId) throws Exception {
        if(this.mode.equals("off")){
            this.employeeId=employeeId;
            this.mode="on";
        }else{
            throw new Exception("pe linie lucreaza deja un alt angajat");
        }

    }

    @Override
    public void stopLine(String employeeId) throws Exception {
        if(this.mode.equals("on")&&this.employeeId.equals(employeeId)){
            this.mode="off";
        }else{
            throw new Exception("angajat invalid sau linie deja oprita");
        }

    }

    @Override
    public void setWorkingSpeed(String employeeId, int speed) throws Exception {
        this.speed=speed;
    }

    @Override
    public void setOperatingMode(String employeeId, String mode) throws Exception {

        this.mode=mode;
        this.employeeId=employeeId;
    }

    @Override
    public synchronized void addTechnologicalStep(String employeeId, String step) throws Exception {
        if(this.mode.equals("on")){
            throw new Exception("banda e deja pornita nu putem adauga pasi");
        }
        if(steps==null){
            steps=new ArrayList<>();

        }
        steps.add(step);
    }

    @Override
    public synchronized String toString() {
        return "LineControl{" +
                "employeeId='" + employeeId + '\'' +
                ", speed=" + speed +
                ", mode='" + mode + '\'' +
                ", steps=" + steps +
                '}';
    }
}
