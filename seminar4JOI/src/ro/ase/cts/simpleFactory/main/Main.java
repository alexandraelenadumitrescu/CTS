package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.clase.Factory.Factory;
import ro.ase.cts.simpleFactory.clase.Factory.MijlocDeTransport;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.Autobuz;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.TipTransport;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.Tramvai;
import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        MijlocDeTransport tramvai=  Factory.getMijlocTransport(TipTransport.TRAMVAI,"IMPERIO",5);
        tramvai.afiseazaTipTransport();


        MijlocDeTransport autobuz=  Factory.getMijlocTransport(TipTransport.AUTOBUZ,"ASTRA",5);
        tramvai.afiseazaTipTransport();
        //TREBUIE FACUTA FABRICA SINGLETON

        //daca adaugam o alta clasa, un nou tip si incalcam open close
    }
}
