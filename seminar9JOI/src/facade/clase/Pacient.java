package facade.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", gravitate=" + gravitate +
                '}';
    }

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
