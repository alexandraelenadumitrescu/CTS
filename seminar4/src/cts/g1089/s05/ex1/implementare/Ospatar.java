package cts.g1089.s05.ex1.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preluareComanda(String comanda,int id) {
        if(comanda==null){
            throw new RuntimeException("comanda nu poate fi goala");
        }
        Restaurant.getInstance().ocupaMasa(id);
    }
    public void afisareSituatieMese(){
        Restaurant.getInstance().afisareMese();
    }
    public void preluareComandaFaraID(String comanda){
        int id=Restaurant.getInstance().getPrimaMasaLibera();
        preluareComanda(comanda,id);
    }
}
