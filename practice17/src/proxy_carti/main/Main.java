package proxy_carti.main;

import proxy_carti.implementare.Biblioteca;
import proxy_carti.implementare.BibliotecaProxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        O bibliotecă digitală permite împrumutarea cărților online.
//        Accesul la o carte se face prin metoda imprumuta(String utilizator, String titluCarte).
//Se dorește adăugarea unui strat intermediar (Proxy) care să controleze accesul cu două reguli:
//
//Un utilizator poate împrumuta maxim 3 cărți simultan
//Nu poate împrumuta aceeași carte de două ori
//
//Dacă una din reguli e încălcată, Proxy-ul blochează accesul și afișează motivul.
// Dacă totul e ok, delegă către obiectul real.
        List<String> carti=new ArrayList<>();
        carti.add("C1");
        carti.add("C");
        carti.add("C");
        carti.add("C");
        Biblioteca biblioteca=new Biblioteca(new ArrayList<>());
        biblioteca.imprumuta("Gigel","carte 1");
        System.out.println(biblioteca.getCarti());
        BibliotecaProxy proxy=new BibliotecaProxy(biblioteca);
        proxy.imprumuta("Gigel","C");
        proxy.imprumuta("Gigel","C");
        proxy.imprumuta("Gigel","C");
        proxy.imprumuta("Gigel","C");
        //proxy.imprumuta("Gigel","C");


    }
}
