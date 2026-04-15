package s3.sensor_factory.implementare;

public class FactorySensor {
public static IDroneSensor creare(String tip,boolean isActive){
    switch (tip){
        case "GPS" -> {
            return new GPSSensor(isActive,tip);
        }
        case "Weather"->{
            return new WeatherSensor(isActive,tip);
        }
        default -> {
            return null;
        }
    }
}
}
