package restaurant_decorator.main;

import restaurant_decorator.implementare.Bon;
import restaurant_decorator.implementare.DecoratorReducere;
import restaurant_decorator.implementare.IBon;
import restaurant_decorator.implementare.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana p=new Persoana("feminin");
        Bon bon=new Bon(p);

        bon.adaugaItem(100.0);
        bon.afiseazaTotal();
        Bon bon2=new Bon(p);
        DecoratorReducere decoratorReducere=new DecoratorReducere(bon2);

        decoratorReducere.adaugaItem(10.0);
        decoratorReducere.afiseazaTotal();

    }


}
