package ro.ase.cts.simpleFactory.clase.mijlocDeTransport;

import ro.ase.cts.simpleFactory.clase.Factory.MijlocDeTransport;

public class Autobuz implements MijlocDeTransport {
    private Integer nrLinie;
    private String marca;

    public Autobuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuzul de pe linia").append(this.nrLinie).append("este produs de ").append(this.marca);
        System.out.printf(sb.toString());
    }
}
