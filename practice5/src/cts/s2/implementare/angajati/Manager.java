package cts.s2.implementare.angajati;

import cts.s2.implementare.exceptii.ExceptieNumeTaxa;
import cts.s2.implementare.taxare.Taxare;

public class Manager implements IAngajat{
    private String nume;
    private int nrProiecte; // int vs Integer
    private final String CNP;
    private static double tarifPerProiect = 570;

    public Manager(String nume, int nrProiecte, String cnp) {
        this.nume = nume;
        this.nrProiecte = nrProiecte;
        CNP = cnp;
    }

    public String getNume() {
        return nume;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public String getCNP() {
        return CNP;
    }

    public static double getTarifPerProiect() {
        return tarifPerProiect;
    }

    public static void setTarifPerProiect(double tarifPerProiect) {
        Manager.tarifPerProiect = tarifPerProiect;
    }

    @Override
    public double calculeazaSalariu() {
        // P1: calcul sal brut
        double salariuBrut = this.nrProiecte * Manager.tarifPerProiect;

        // P2: return sal net(ne folosim de Taxare)
        try {
            double salariuNet = salariuBrut
                    - Taxare.getTaxa("CAS") * salariuBrut
                    - Taxare.getTaxa("CASS") * salariuBrut;
            salariuNet = (1-Taxare.getTaxa("Impozit")) * salariuNet;
            return salariuNet;
        } catch (ExceptieNumeTaxa e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
