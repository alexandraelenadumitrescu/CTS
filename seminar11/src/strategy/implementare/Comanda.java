package strategy.implementare;

public class Comanda {
    private int id;
    private double total;

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public Comanda(int id, double total) {
        this.id = id;
        this.total = total;
    }
}
