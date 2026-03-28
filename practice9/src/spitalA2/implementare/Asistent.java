package spitalA2.implementare;

public class Asistent implements PersonalSpital{
    private String nume;

    protected Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("asistentul cu numele: "+this.nume);
    }
}
