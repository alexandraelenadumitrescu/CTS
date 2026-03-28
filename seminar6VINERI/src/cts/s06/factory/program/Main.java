package cts.s06.factory.program;

import cts.s06.builder.implementare.IBuilder;
import cts.s06.factory.implementare.BauturaFactory;
import cts.s06.factory.implementare.IBautura;
import cts.s06.factory.implementare.TipBautura;

public class Main {
    public static void main(String[] args) {
        IBautura b1= BauturaFactory.getBautura(TipBautura.CEAI,"un tip de ceai",100,20);
        System.out.printf(String.valueOf(b1));
    }
}
