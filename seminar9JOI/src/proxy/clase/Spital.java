package proxy.clase;

public class Spital implements  ISpital{
    private String nume;

   public void interneazaPacient(Pacient p){
        System.out.println("s a internat");
    }

    public Spital(String nume) {
        this.nume = nume;
    }
}
