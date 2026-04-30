package flyweight_restaurant.implementare;

public class Rezervare {
    private int numarMasa;
    private String oraRezervare;
    private int numarPersoane;

    @Override
    public String toString() {
        return "Rezervare{" +
                "numarMasa=" + numarMasa +
                ", oraRezervare='" + oraRezervare + '\'' +
                ", numarPersoane=" + numarPersoane +
                '}';
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public Rezervare(int numarMasa, String oraRezervare, int numarPersoane) {
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
        this.numarPersoane = numarPersoane;
    }
}
