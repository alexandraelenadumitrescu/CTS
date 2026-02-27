package cts.g1089.s02.implementare.companie;

import cts.g1089.s02.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String numeCompanie;
    List<Angajat> angajati=new ArrayList<>();//dependency inversion

    public Companie(String nume ) {
        this.numeCompanie = nume;

    }
    public void addAngajat(Angajat angajat){
        if(angajat==null){
            throw new RuntimeException();
        }
        angajati.add(angajat);
    }

    public double calculFondTotal(){
        double salarii=0;
        for(Angajat angajat:angajati){
            salarii+= angajat.calculSalariu();
        }
        return salarii;
    }

}
