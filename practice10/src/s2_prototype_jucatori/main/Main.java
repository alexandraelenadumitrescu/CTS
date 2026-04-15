package s2_prototype_jucatori.main;

import s2_prototype_jucatori.implementare.Jucator;
import s2_prototype_jucatori.implementare.TipJucator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> antrenamente=new ArrayList<>();
        antrenamente.add("ex1 baschet");
        antrenamente.add("ex2 baschet");
        antrenamente.add("ex3 baschet");
        List<String> medicamente=new ArrayList<>();
        medicamente.add("med 1");
        medicamente.add("med 2");
        medicamente.add("med 3");
        Jucator j=new Jucator(TipJucator.BASCHET,medicamente,antrenamente);
        Jucator j2=j.copiaza();
        System.out.println(j.toString());
        System.out.println(j2.toString());
        j.addMedicament("med 234");
        System.out.println(j.toString());
        System.out.println(j2.toString());
        Jucator j3=j.copiaza();
        System.out.println(j.toString()+"jucatorul 1 inainte de modificari");
        System.out.println(j3.toString()+"jucatorul 3 inainte de modificari");
        j3.setTipJucator(TipJucator.FOTBAL);
        j3.addAntrenament("12321");
        System.out.println(j.toString()+"jucatorul 1 dupa modificari");
        System.out.println(j3.toString()+"jucatorul 3 dupa modificari");
        Jucator j4=j.copiaza();
        Jucator j5=j.copiaza();

    }
}
