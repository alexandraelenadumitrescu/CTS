package cts.g1089.s04.ex1.program;

import cts.g1089.s04.ex1.implementare.Masa;
import cts.g1089.s04.ex1.implementare.Ospatar;
import cts.g1089.s04.ex1.implementare.Restaurant;

public class Main {
    public static void main(String[] args) {
        Ospatar ospatar1=new Ospatar("Gigel");
        Ospatar ospatar2=new Ospatar("Costel");
        Restaurant restaurant=Restaurant.getInstance();
        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));


        restaurant.afisareMese();

        ospatar1.preluareComanda("Pizza, Cola",2);

        ospatar2.preluareComanda("Pizza, Cola",3);
        ospatar1.preluareComanda("Pizza, Cola",4);
        ospatar1.afisareSituatieMese();
        ospatar2.preluareComandaFaraID("sushi");

        ospatar1.afisareSituatieMese();


    }
}