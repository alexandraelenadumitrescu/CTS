package cts.g1089.s05.ex1.implementare;

public class Masa {
    private int id;
    private boolean esteLibera;
    //alte campuri de discutat pentru home

    public Masa(int id) {
        this.id = id;
        this.esteLibera = true;
    }

    public int getId() {
        return id;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", esteLibera=" + esteLibera +
                '}';
    }
}
