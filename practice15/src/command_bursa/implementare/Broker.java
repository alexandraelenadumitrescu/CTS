package command_bursa.implementare;

import java.util.HashMap;
import java.util.Map;

public class Broker {



    void cumpara(String actiune, int cantitate){
        System.out.println("BUY "+actiune + cantitate);
    }

    void vinde(String actiune, int cantitate){
        System.out.println("SELL "+actiune + cantitate);

    }
}
