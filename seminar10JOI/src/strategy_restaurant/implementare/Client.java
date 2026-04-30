package strategy_restaurant.implementare;

public class Client {
    private String nume;
    private ModalitatePlata modalitatePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitatePlata=new PlataCard();
    }
    public void setStrategie(ModalitatePlata modalitatePlata){
        this.modalitatePlata=modalitatePlata;
    }

    public void platesteTranzactie(int suma){
        this.modalitatePlata.plateste(nume,suma);
    }
}
