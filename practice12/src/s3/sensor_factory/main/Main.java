package s3.sensor_factory.main;

import s3.sensor_factory.implementare.FactorySensor;
import s3.sensor_factory.implementare.IDroneSensor;

public class Main {
    public static void main(String[] args) {

        IDroneSensor gpsSenzor=FactorySensor.creare("GPS",true);


    }
}
