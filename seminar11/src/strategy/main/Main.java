package strategy.main;

import strategy.implementare.*;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("nume CLIENT1");
        Comanda comanda=new Comanda(10,100);
        ITehnicaPlata plataCard=new PlataCard("1909",300);
        ITehnicaPlata plataCash=new PlataCash(3,5);
        client.setTehnicaPlata(plataCard);

        client.inchideComanda(comanda);
    }
}
