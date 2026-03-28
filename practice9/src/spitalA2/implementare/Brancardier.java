package spitalA2.implementare;

public class Brancardier implements PersonalSpital{
    private String nume;

    protected Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("brancardier cu numele: "+this.nume);
    }
}
