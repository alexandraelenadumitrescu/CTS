package cts.g1089.s02.implementare.companie;

import cts.g1089.s02.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String nume;
    List<Angajat> angajati=new ArrayList<>();//dependency inversion

    public Companie(String nume, List<Angajat> angajati) {
        this.nume = nume;
        this.angajati = angajati;
    }
}
