package cts.g1089.s05.prototype.program;

import cts.g1089.s05.prototype.implementare.API.APIDimensiuni;
import cts.g1089.s05.prototype.implementare.prototype1.Crocs;
import cts.g1089.s05.prototype.implementare.prototype2.AbstractCrocs;
import cts.g1089.s05.prototype.implementare.prototype2.CrocsPrototypeFactory;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();
        apiDimensiuni.init();

        //utilizare API pentru a prelua standarde dimensiuni in functie de marimea dorita
        List<Integer> dimensiuni = apiDimensiuni.getDimensiuni(40);
        System.out.println(dimensiuni);


        //testare prototype 1
        Crocs crocs1=new Crocs(40);
        //do not
        //Crocs crocs2=new Crocs(40);
        Crocs crocs2= (Crocs) crocs1.getCopie();//fac copie pentru ca vreau tot marimea 40

        Crocs crocs3=new Crocs(38);//CTR pentru ca alta marime

//
//        System.out.println(crocs1);
//        System.out.println(crocs2);
//
//        //test
//        crocs2.setCuloare("verde");
//        crocs2.setAccesorii("accesoriu");
//        crocs2.modificareDimensiune(0,24);
//
//        System.out.println(crocs1);
//        System.out.println(crocs2);
//


        //TESTARE PROTOTYPE 2
        AbstractCrocs crocs11= CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs12= CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs13= CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs14= CrocsPrototypeFactory.getPrototip("Fotbal");
        AbstractCrocs crocs15= CrocsPrototypeFactory.getPrototip("Fotbal");
        System.out.println(crocs11);
        System.out.println(crocs12);
        System.out.println(crocs13);
        System.out.println(crocs14);
        System.out.println(crocs15);

        //de demonstrat ca e deep copy
        crocs15.setCuloare("albastru");
        System.out.println(crocs15);
        System.out.println(crocs14);


        //de afisat statistici in cadrul prototype factory
        //disney  -  ? constructor  ?  clone
        //fotbal  -  ? constructor  ?  clone
        //la mare  -  ? constructor  ?  clone
        //de cate ori s a apelat ctr de cate ori s a apelat clona

    }
}