package composite_meniu.implementare;



public class Meniu {
    private ANod structura;
    private String numeRestaurant;

    public Meniu(ANod structura, String numeRestaurant) {
        this.structura = structura;
        this.numeRestaurant = numeRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public ANod getStructura() {
        return structura;
    }
}