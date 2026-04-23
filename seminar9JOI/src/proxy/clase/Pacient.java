package proxy.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }
}
