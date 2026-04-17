
package decorator.main;

import decorator.implementare.Carte;
import decorator.implementare.DecoratorAmbalaj;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Carte carte=new Carte();
        carte.setName("nume");
        DecoratorAmbalaj decoratorAmbalaj=new DecoratorAmbalaj(carte);
        System.out.println(decoratorAmbalaj.getNume());
    }
}