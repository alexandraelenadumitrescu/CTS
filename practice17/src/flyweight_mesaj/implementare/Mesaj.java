package flyweight_mesaj.implementare;

public class Mesaj {
    private String nume;
    private String adresa;

    @Override
    public String toString() {
        return "Mesaj{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    public Mesaj(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }
}
