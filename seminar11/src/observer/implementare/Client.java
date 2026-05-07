package observer.implementare;

import java.util.List;

public class Client implements IObserver{
    private String numeClient;
    private List<String> listaOrase;

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("clientul "+ numeClient+ " a primit mesajul "+ mesaj);
    }

    public Client(String numeClient,List<String> orase) {
        this.numeClient = numeClient;
        this.listaOrase=orase;
    }



    public List<String> getListaOrase() {

        return listaOrase;
    }
}
