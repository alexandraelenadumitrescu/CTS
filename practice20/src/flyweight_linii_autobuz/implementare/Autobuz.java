package flyweight_linii_autobuz.implementare;

public class Autobuz {
    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                '}';
    }

    public Autobuz(String model) {
        this.model = model;
    }
}
