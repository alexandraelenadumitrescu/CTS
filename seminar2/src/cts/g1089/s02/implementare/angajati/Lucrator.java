package cts.g1089.s02.implementare.angajati;

import cts.g1089.s02.implementare.exceptii.ExceptieNumeTaxa;
import cts.g1089.s02.implementare.taxare.Taxe;

public class Lucrator implements Angajat{
    private String nume;
    private int nrOreLucrate;
    private double tarifOrar;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    public double getTarifOrar() {
        return tarifOrar;
    }

    public void setTarifOrar(double tarifOrar) {
        this.tarifOrar = tarifOrar;
    }

    @Override
    public double calculSalariu() {
        //!! aici face try catch nu in main ca sa il prinda urmatorul layer
        //p1 calcul salariu brut
        double salariuBrut=tarifOrar*nrOreLucrate;

        //p2 calcul salariu net

        double salariuNet= 0;
        try {
            salariuNet = salariuBrut- salariuBrut* Taxe.getProcent("cas")-salariuBrut*Taxe.getProcent("xass");
            salariuNet=salariuNet*(1-Taxe.getProcent("impozit"));
        } catch (ExceptieNumeTaxa e) {
            throw new RuntimeException(e);
        }
        return salariuNet;
    }
}
