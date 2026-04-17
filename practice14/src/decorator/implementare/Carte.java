package decorator.implementare;

public class Carte implements ICarte{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNume() {
        return this.name;
    }
}
