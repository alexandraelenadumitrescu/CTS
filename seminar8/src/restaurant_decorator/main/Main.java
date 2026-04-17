package restaurant_decorator.main;

import restaurant_decorator.implementare.Bon;
import restaurant_decorator.implementare.DecoratorReducere;
import restaurant_decorator.implementare.IBon;
import restaurant_decorator.implementare.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana p=new Persoana("feminin");
        IBon bon=new Bon(p);

        bon.adaugaItem(100.0);
        bon.afiseazaTotal();


        IBon bon2=new Bon(p);
        IBon decoratorReducere=new DecoratorReducere(bon2);

        decoratorReducere.adaugaItem(10.0);
        decoratorReducere.afiseazaTotal();

        Persoana p2=new Persoana("masculin");
        IBon bon3=new Bon(p2);

        IBon decoratorReducere2=new DecoratorReducere(bon3);

        decoratorReducere2.adaugaItem(10.0);
        decoratorReducere2.afiseazaTotal();



    }


}
