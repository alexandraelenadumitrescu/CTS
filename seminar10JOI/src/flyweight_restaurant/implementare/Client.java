package flyweight_restaurant.implementare;

public class Client implements  ClientAbstract{
    private String nume;
    private String adresaMail;
    private String numarTelefon;

    protected Client(String nume, String adresaMail, String numarTelefon) {
        this.nume = nume;
        this.adresaMail = adresaMail;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println(this +" " + rezervare);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void plateste(Rezervare rezervare,double taxaPerPersoana) {
        System.out.println(nume+" a platit "+ rezervare.getNumarPersoane()*taxaPerPersoana);
    }
}
