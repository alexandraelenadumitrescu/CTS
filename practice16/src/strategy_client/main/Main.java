package strategy_client.main;

import strategy_client.implementare.Client;
import strategy_client.implementare.Vizualizeaza2D;
import strategy_client.implementare.Vizualizeaza3D;

public class Main {
    public static void main(String[] args) {
//        Cerința:
//O companie de design interior oferă clienților mai multe modalități
// de vizualizare a planurilor de design propuse de arhitecți: Design 2D,
// Design 3D, Detalii produse. Clientul își poate schimba opțiunea de vizualizare
// oricând, atât timp cât are opțiunea respectivă în pachetul său tarifar. Sistemul
// trebuie să permită adăugarea de noi modalități de vizualizare în timp.
//
Client c=new Client();
c.setVizualizare(new Vizualizeaza2D());
c.utilizeaza();
        c.setVizualizare(new Vizualizeaza3D());
        c.utilizeaza();
    }
}
