package observer_meteo.main;

import observer_meteo.implementare.AplicatieMeteo;
import observer_meteo.implementare.JurnalMeteo;
import observer_meteo.implementare.SistemIncalzire;
import observer_meteo.implementare.StatieMeteo;

import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
//        O stație meteo măsoară temperatura în timp real.
//        Când temperatura se schimbă, mai multe sisteme trebuie anunțate automat:
//
//AplicatieMobila — afișează noua temperatură utilizatorului
//SistemIncalzire — pornește/oprește încălzirea în funcție de prag
//JurnalMeteo — salvează fiecare modificare de temperatură

        AplicatieMeteo aplicatieMeteo=new AplicatieMeteo();
        SistemIncalzire sistemIncalzire=new SistemIncalzire();
        sistemIncalzire.setPrag(20);
        JurnalMeteo jurnalMeteo=new JurnalMeteo();

        StatieMeteo statieMeteo=new StatieMeteo();
        statieMeteo.attach(sistemIncalzire);
        statieMeteo.attach(aplicatieMeteo);
        statieMeteo.attach(jurnalMeteo);

        statieMeteo.setTemperatura(21);
        statieMeteo.setTemperatura(22);



    }
}
