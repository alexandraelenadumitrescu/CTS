package composite_vapor.main;

import composite_vapor.implementare.ANod;
import composite_vapor.implementare.Colet;
import composite_vapor.implementare.Container;
import composite_vapor.implementare.Vapor;

public class Main {
    public static void main(String[] args) {
        // Containere
        ANod container1 = new Container("C001");
        ANod container2 = new Container("C002");

        // Colete in C001 — fara fragile
        container1.adaugaNod(new Colet("Colet-A", 120.0, false));
        container1.adaugaNod(new Colet("Colet-B", 80.0, false));

        // Colete in C002 — unul fragil
        container2.adaugaNod(new Colet("Colet-C", 50.0, false));
        container2.adaugaNod(new Colet("Colet-D", 30.0, true));  // FRAGIL

        // Radacina
        ANod radacina = new Container("Cala principala");
        radacina.adaugaNod(container1);
        radacina.adaugaNod(container2);

        // Vapor
        Vapor vapor = new Vapor("Titanic II", 500.0, radacina);
        vapor.afisareManifest();
    }
}
