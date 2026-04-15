package s2.drone_builder.main;

import s2.drone_builder.implementare.AbstractModule;
import s2.drone_builder.implementare.ConcreteModule;
import s2.drone_builder.implementare.Drone;

public class Main {
    public static void main(String[] args) {
        AbstractModule abstractModule=new ConcreteModule();
        Drone d=Drone.getBuilder("model","v1",100,abstractModule ).setWaterproof(true).build();
        Drone d2=Drone.getBuilder("model","v2",100,abstractModule ).setWaterproof(true).build();
        System.out.println(d.toString());
        System.out.println(d2.toString());


    }
}
