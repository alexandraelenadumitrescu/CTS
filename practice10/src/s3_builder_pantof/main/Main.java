package s3_builder_pantof.main;

import s3_builder_pantof.implementare.Pantof;
import s3_builder_pantof.implementare.TipPantof;

public class Main {
    public static void main(String[] args) {
        Pantof p1=Pantof.getBuilder(31,10, TipPantof.TIP1,"piele").build();
        System.out.printf(p1.toString());

    }
}
