package flyweight_linii_autobuz.main;

import flyweight_linii_autobuz.implementare.Autobuz;
import flyweight_linii_autobuz.implementare.FabricaLinii;

public class Main {
    public static void main(String[] args) {
//        Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an
//fabricatie, numar locuri, numar linie,prima statie, ultima statie. Aceste informatii sunt salvate
//pentru fiecare AutobuzLinie din oras. Se doreste implementarea unui modul care sa asigure
//gestiunea in mod optim a memoriei, tinandu-se cont de faptul ca anumite informatii sunt
//redundante, deoarece pe o linie vor merge mai multe autobuze.
        //fabrica statica.get(123).printeaza(autobuz);
        FabricaLinii.getLinie(100).printeaza(new Autobuz("modelAutobuz"));

    }
}
