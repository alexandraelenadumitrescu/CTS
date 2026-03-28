package cts.s06.factory.implementare;

public class Ceai extends AbstractBautura{
    Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("afisare pasi preparare");
    }

    @Override
    public String getDetalii() {

        return this.toString();
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
