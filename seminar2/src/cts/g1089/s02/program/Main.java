package cts.g1089.s02.program;

import cts.g1089.s02.implementare.angajati.Lucrator;
import cts.g1089.s02.implementare.companie.Companie;
import cts.g1089.s02.implementare.taxare.Taxe;

public class Main {
    public static void main(String[] args) {
//        Taxe t=new Taxe();
//        System.out.println("Hello, World!");
        Companie companie=new Companie("SRL_SRL");
        companie.addAngajat(new Lucrator("Costel",100,12));
        companie.addAngajat(new Lucrator("Marcel",80,11));
        companie.addAngajat(new Lucrator("Viorel",66,11));
        System.out.println("salariu total"+ companie.calculFondTotal());

    }

}