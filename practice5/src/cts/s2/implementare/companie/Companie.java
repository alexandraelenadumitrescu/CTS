package cts.s2.implementare.companie;

import cts.s2.implementare.angajati.IAngajat;

import java.util.ArrayList;
import java.util.List;

// relatia de has a
public class Companie {
    private String nume;
    private List<IAngajat> listaAngajati = new ArrayList<>();

    public Companie(String nume) {
        this.nume = nume;
    }

    public void adaugaAngajat(IAngajat angajat){
        if(angajat == null){
            throw new NullPointerException();
        }
        listaAngajati.add(angajat);
    }

    public double calculFondSalariu(){
        double fondSalariu = 0;
        for (IAngajat angajat : listaAngajati){
            fondSalariu += angajat.calculeazaSalariu();
        }
        return fondSalariu;
    }


}

