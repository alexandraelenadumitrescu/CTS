package ro.ase.cts.singletonregistry.main;

import ro.ase.cts.singletonregistry.clase.Cuptor;

public class Main {
    public static void main(String[] args) throws Exception {
        Cuptor cuptorElectric=Cuptor.getCuptor("Electric");
        cuptorElectric.addPreparat("Pizza",190);
        cuptorElectric.addPreparat("Pizza",190);
        cuptorElectric.addPreparat("Pizza",180);
        Cuptor cuptorLemne=Cuptor.getCuptor("Lemne");
        cuptorLemne.addPreparat("Pizza",100);
        cuptorLemne.addPreparat("Pizza",100);
        try{
            cuptorLemne.addPreparat("Pizza",3000);

        } catch (Exception e) {
            System.out.println(e.getMessage()+"eroare");
        }
        Cuptor.getBestCuptor().afisare();


    }
}