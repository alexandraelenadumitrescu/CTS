package command_bursa.main;

import command_bursa.implementare.Broker;
import command_bursa.implementare.Bursa;
import command_bursa.implementare.ComandaCumparare;

public class Main {
    public static void main(String[] args) {
       // Cerința:
//        Un sistem de tranzacționare la bursă permite utilizatorului să inițieze
//        ordine de cumpărare și vânzare pentru diferite acțiuni. Ordinele sunt
//        colectate și executate ulterior într-un mod uniform. Sistemul trebuie
//        să permită adăugarea de noi tipuri de ordine în viitor fără modificarea logicii de execuție.
//
//                Must-uri Command:
//
//        IComanda — interfață cu executa()
//        Receiver — Broker cu metode cumpara(String actiune, int cantitate) și
//        vinde(String actiune, int cantitate)
//        ConcreteCommand — ComandaCumparare, ComandaVanzare — au HAS-A Broker,
//        apelează metoda corespunzătoare în executa()
//        Invoker — Bursa cu List<IComanda> — metode adaugaOrdin(IComanda) și executaOrdine()
//        În Main — creezi Broker, comenzi concrete, le adaugi la Bursa și execuți
        Bursa bursa=new Bursa();
        bursa.adaugaOrdin(new ComandaCumparare(new Broker(),100,"GOOG"));
        bursa.adaugaOrdin(new ComandaCumparare(new Broker(),100,"GOOG"));
        bursa.adaugaOrdin(new ComandaCumparare(new Broker(),100,"GOOG"));
        bursa.executaOrdine();
    }
}
