package cts.s06.factory.implementare;

import cts.s06.builder.implementare.IBuilder;

public class BauturiFactory {
    //vers simple factory
    //nu avem abstractizare
    public static Bautura getBautura(TipBautura tip){
        switch (tip){
            case CAFEA -> {
                return new Cafea();
            }
            case CIOCOLATA_CALDA -> {
                return new CiocolataCalda("basic","none");//macar un camp suplimentar in una dintre clase pentur a intelege faptul ca factory nu parametrizeaza
            }
            default -> {
                return null;
            }
        }

    }
}
