package s5_singleton_casa_marcat.implementare;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements AbstractCasaMarcat{
    private List<String> comanda;
    private Angajat angajatCurent;

    private CasaDeMarcat() {
        this.comanda = new ArrayList<>();
    }
    private static CasaDeMarcat instance=new CasaDeMarcat();
    public static CasaDeMarcat getInstance(){
        return instance;
    }
    @Override
    public void deschideComanda(AbstractAngajat angajat) {
        angajatCurent= (Angajat) angajat;
        comanda.add(String.valueOf(angajat));
    }

    @Override
    public void inchideComanda(AbstractAngajat angajat) {
        if (angajat.getNume().equals(angajatCurent)) {
            comanda.clear();

        }

    }

    @Override
    public void adaugaProdus(String denumireProdus) {
        comanda.add(denumireProdus);
    }

    @Override
    public void showInfoComanda() {
        System.out.println("comanda deschisa de angajatul contine urmatoarele produse "+ comanda.toString());
    }
}
