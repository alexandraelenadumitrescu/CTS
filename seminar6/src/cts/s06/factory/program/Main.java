package cts.s06.factory.program;

import cts.s06.factory.implementare.Bautura;
import cts.s06.factory.implementare.BauturiFactory;
import cts.s06.factory.implementare.CiocolataCalda;
import cts.s06.factory.implementare.TipBautura;

public class Main {
    public static void main(String[] args) {
        Bautura bautura1= BauturiFactory.getBautura(TipBautura.CAFEA);
        System.out.println(bautura1.getDetalii());
        Bautura bautura2= BauturiFactory.getBautura(TipBautura.CIOCOLATA_CALDA);
        System.out.printf(bautura2.getDetalii());
        ((CiocolataCalda) bautura2).setTipCiocolata("haide");
        System.out.println(bautura2.getDetalii());
    }
}
