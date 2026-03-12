package ro.ase.cts.simpleFactory.clase.Factory;

import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.*;

public class Factory {

    public static MijlocDeTransport getMijlocTransport(TipTransport tip, String marca, Integer nrLinie){
        switch(tip){
            case TipTransport.AUTOBUZ -> {
                Autobuz autobuz=new Autobuz(nrLinie,marca);
                return autobuz;
            }
            case TipTransport.TRAMVAI -> {
                Tramvai tramvai=new Tramvai(nrLinie, marca);
                return tramvai;
            }
            case TipTransport.TROLEIBUZ -> {
                Troleibuz troleibuz=new Troleibuz(nrLinie, marca);
                return troleibuz;
            }
            default -> {
                return null;
            }
        }
        //return null;
    }
}

//de facut return switch
