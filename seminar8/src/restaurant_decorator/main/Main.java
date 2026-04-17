package restaurant_decorator.main;

import restaurant_decorator.implementare.Bon;
import restaurant_decorator.implementare.IBon;
import restaurant_decorator.implementare.Persoana;

public class Main {
    public static void main(String[] args) {
        Bon bon=new Bon(new Persoana("feminin"));

        bon.adaugaItem(100.0);
        bon.afiseazaTotal();
    }


}
