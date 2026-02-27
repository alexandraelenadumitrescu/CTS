package cts.g1089.s02.implementare.taxare;

import cts.g1089.s02.implementare.exceptii.ExceptieNumeTaxa;

import java.util.HashMap;
import java.util.Map;

public class Taxe {
    static Map<String, Double> taxe=new HashMap<>();//dependency inversion intre map si hashmap, abstract concret
    private String ceva;
//    public Taxe(String ceva){
//        this.ceva=ceva;
//        taxe.put(this.ceva)
//    }
//    //intr o metoda campuri statice this
//    public static void functie(){
//        taxe.put("sir1",100.3);
//        ceva="sada";
//    }
    //bloc static
    static{
        taxe.put("cass",0.1);
    taxe.put("cas",0.25);
    taxe.put("impozit",0.1);
}
//metoda de adaugare de taxa noua(daca exista deja arunca exceptie
public static void adaugaTaxa(String taxa, double procent) throws ExceptieNumeTaxa {
        //if(taxe.entrySet().contains())
    if(taxe.get(taxa)==null){
        taxe.put(taxa,procent);
    }else {
        throw new ExceptieNumeTaxa();
        //throw new RuntimeException();
    }
}
//metoda care consulta un anume procent (getter pe mapa pe baza cheii unice)
    public static double getProcent(String taxa) throws ExceptieNumeTaxa {
        if(taxe.containsKey(taxa)){
            return taxe.get(taxa);
        }else{
            throw new ExceptieNumeTaxa();
        }
    }
}
