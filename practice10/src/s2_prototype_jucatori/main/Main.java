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

    }
}
