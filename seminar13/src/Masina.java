public class Masina {
    private String model;
    private double consumMediu;
    private int kilometraj;
    private double nivelRezervor;
    private double capacitateMaximaRezervor;

//vf ctr -> model minim 3 litere
    //km  >=0
    //consum mediu 1-25 fara sa includem 25

    //consum mediu arunca exceptie consum
    //km arunca exceptie kilometraj
    //model exceptie model
    //ctr primeste doar modelul
    //consum mediu hardcodat 5
    //km la 0
    //nivel rezervor jumatate din capacitate
    //capacitatea primita ca parametru

    //metoda de deplasare(kilometri) arunca exceptie daca nu avem suficient combustibil
    //metoda de alimentare

    public Masina(String model, double capacitateMaximaRezervor){
        if(model.length()<3){
            throw new ExceptieModel("model gresit");
        }
        this.model = model;
        if(capacitateMaximaRezervor<10||capacitateMaximaRezervor>100){
            throw new ExceptieCapacitate("capacitate gresita");
        }
        this.consumMediu = 5;
        this.kilometraj = 0;
        this.nivelRezervor = capacitateMaximaRezervor/2;
        this.capacitateMaximaRezervor = capacitateMaximaRezervor;
    }

    public void deplaseaza(int distanta){

    }

    public void alimentare(double cantitateAlimentata) throws ExceptieAlimentare {
        if(cantitateAlimentata<0){
            throw new ExceptieAlimentare();
        }

        if(cantitateAlimentata+this.nivelRezervor>this.capacitateMaximaRezervor){
            throw new ExceptieAlimentare();
        }

        this.nivelRezervor+=cantitateAlimentata;
    }

    public String getModel() {
        return model;
    }

    public double getConsumMediu() {
        return consumMediu;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public double getNivelRezervor() {
        return nivelRezervor;
    }

    public double getCapacitateMaximaRezervor() {
        return capacitateMaximaRezervor;
    }
}
