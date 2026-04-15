package s2.module_factory.implementare;

public class ModuleFactory {
    public static AbstractModule create(TipModul tipModul,int range,String name, String description, float price){
        switch (tipModul){
            case GPS -> {
                return new GpsModule(tipModul,range,name,description,price);
            }
            case NIGHT_VISION -> {
                return new NightVisionModule(tipModul,range,name,description,price);
            }
            default -> {
                return null;
            }
        }
    }
}
