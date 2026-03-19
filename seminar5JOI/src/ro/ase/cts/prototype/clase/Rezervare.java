package ro.ase.cts.prototype.clase;

public class Rezervare implements RezervarePrototype{
    private String numeClient;
    private int ora;
    private int nrPersoane;
    private String nrCard;

    private Rezervare(){

    }

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCard) {

        this.numeClient = numeClient;
        if(ora>=11&&ora<=22){
            this.ora = ora;
        }else{
            this.ora=11;
        }

        this.nrPersoane = nrPersoane;
        if (nrCard.length() == 16) {
            this.nrCard = nrCard;

        }else{
            this.nrCard="0000000000000000";
        }
    }

    @Override
    public RezervarePrototype copiaza() {
        Rezervare rezervare=new Rezervare();//putem incalca dep inv
        rezervare.nrCard=this.nrCard;
        rezervare.numeClient=this.numeClient;
        rezervare.ora=this.ora;
        rezervare.nrPersoane=this.nrPersoane;//liskov
        return rezervare;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", ora=" + ora +
                ", nrPersoane=" + nrPersoane +
                ", nrCard='" + nrCard + '\'' +
                '}';
    }
}

