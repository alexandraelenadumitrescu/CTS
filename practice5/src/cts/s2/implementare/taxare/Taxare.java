package cts.s2.implementare.taxare;

import cts.s2.implementare.exceptii.ExceptieNumeTaxa;

import java.util.HashMap;
import java.util.Map;

public class Taxare {
    private static Map<String, Double> taxe = new HashMap<>();

    // bloc static
    static{
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.1);
        taxe.put("Impozit", 0.1);
    }

    public static void adaugareTaxaNoua(String numeTaxa, double valoare) throws ExceptieNumeTaxa{
        if(taxe.containsKey(numeTaxa)){
            throw new ExceptieNumeTaxa("Taxa " + numeTaxa + " exista deja"); // asta nu e runtime, trebuie sa specificam ca meth arunca exceptia respectiva
        }else{
            taxe.put(numeTaxa, valoare);
        }
    }

    public static double getTaxa(String numeTaxa) throws ExceptieNumeTaxa{
        if(!taxe.containsKey(numeTaxa)){
            throw new ExceptieNumeTaxa("Taxa " + numeTaxa + " nu exista");
        }
        return taxe.get(numeTaxa);

    }


}
