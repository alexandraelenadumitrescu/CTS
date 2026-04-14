package s5_singleton_casa_marcat.implementare;

public interface AbstractCasaMarcat {
    void deschideComanda(AbstractAngajat angajat);
    void inchideComanda(AbstractAngajat angajat);
    void adaugaProdus(String denumireProdus);
    void showInfoComanda();
}