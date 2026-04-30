package strategy_restaurant.main;

import strategy_restaurant.implementare.Client;
import strategy_restaurant.implementare.ModalitatePlata;
import strategy_restaurant.implementare.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("NUME1");
        client1.platesteTranzactie(10);
        client1.setStrategie(new PlataCash());
        client1.platesteTranzactie(10);
    }
}
