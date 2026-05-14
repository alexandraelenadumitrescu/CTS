package strategy_transport.main;

import strategy_transport.implementare.*;

public class Main {
    public static void main(String[] args) {
//        . O aplicație de transport urban trebuie să calculeze
//        ruta optimă între două stații. Utilizatorul poate
//alege criteriul de optimizare: cel mai scurt timp, cel mai mic număr de stații, cost minim sau traseu
//cu cele mai puține schimbări. Fiecare variantă folosește o regulă proprie de calcul asupra aceleiași
//liste de stații și conexiuni. Algoritmul utilizat trebuie să poată fi schimbat la rulare. Pentru
//implementare se va folosi interfața AbstractAlgoritmRuta.
//1.5p. Să se testeze soluția prin:
//• definirea unei rețele simple de transport;
//• implementarea a cel puțin 3 variante de calcul;
//• calcularea rutei pentru aceeași pereche de stații folosind algoritmi diferiți;
//• compararea rezultatelor obținute.
        GPS gps=new GPS();
        gps.setStrategie(new StrategieStatii());
        gps.calculeaza(new ReteaTransport(),"start","finish");
        gps.setStrategie(new StrategieTimp());
        gps.calculeaza(new ReteaTransport(),"start","finish");

    }
}
