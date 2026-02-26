package cts.s2.program;
// salarizarea intr-o companie
// avem nevoie de angajati si implicit tipuri de angajati pentru a le calcula salariul poate in functie de post
// taxare? -> decuplata de angajat ?? why? -> putem schimba in timp(ex: lista de taxe)
// angajat -> interfata / cls abstracta?
// Companie -> HAS A angajati
// adauga angajat, elimina, exceptii(tratate in main)
// pentru taxare -> map?


import cts.s2.implementare.angajati.Manager;
import cts.s2.implementare.companie.Companie;

public class Main{
    public static void main(String[] args){
        Companie companie = new Companie("mi compania");
        companie.adaugaAngajat(new Manager("Lulu", 4, "3462245"));
        companie.adaugaAngajat(new Manager("Stefan", 4, "3462245"));
        companie.adaugaAngajat(new Manager("Alex", 4, "3462245"));
        companie.adaugaAngajat(new Manager("Andrei", 4, "3462245"));

        System.out.println(companie.calculFondSalariu());
    }
}


