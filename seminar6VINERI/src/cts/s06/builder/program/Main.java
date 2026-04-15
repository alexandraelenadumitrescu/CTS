package cts.s06.builder.program;

import cts.s06.builder.implementare.Pantof;
import cts.s06.builder.implementare.TipPantof;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pantof p1= Pantof.getBuilder(40, TipPantof.ADIDASI,10,"canvas").build();
        System.out.println(p1.toString());
        Pantof p2= Pantof.getBuilder(41, TipPantof.ADIDASI,10,"piele").setMaterialSeucundar("piele de crocodil").build();
        System.out.println(p2.toString());

        //sa se testeze contextul in care un obj ar putea modifica campurile altui obiect
        Pantof p3= Pantof.getBuilder(41, TipPantof.ADIDASI,10,"piele").addMesaj("smecherie").setMaterialSeucundar("piele de crocodil").build();
        Pantof.PantofiBuilder buil=new Pantof.PantofiBuilder(42,TipPantof.ADIDASI,24,"piele de soparla");
        Pantof.PantofiBuilder builder=Pantof.getBuilder(42, TipPantof.ADIDASI,10,"piele").addMesaj("smecherie").setMaterialSeucundar("piele de crocodil");
        Pantof p4=builder.build();
        Pantof p5=builder.setMaterialSeucundar("piele strut").build();
        Pantof p6=builder.addMesaj("haide").build();

        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());

        try{
            Pantof p8= Pantof.getBuilder(50, TipPantof.ADIDASI,10,"canvas").build();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }



    }
}