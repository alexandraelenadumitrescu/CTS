package s5_singleton_casa_marcat.implementare;

public class Angajat implements AbstractAngajat {
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
