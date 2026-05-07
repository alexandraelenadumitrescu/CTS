package strategy.implementare;

public class Client {//clasa obiect din diagrama
    private String numeClient;
    private ITehnicaPlata tehnicaPlata;


    public Client(String numeClient) {
        this.numeClient = numeClient;
        //nu ar trebui modelata tehnica de plata la momentul acesta, putem sa lasam un default sau sa nu o gestionam aici
    }
    //SET STRATEGIE

    public void setTehnicaPlata(ITehnicaPlata tehnicaPlata) {
        this.tehnicaPlata = tehnicaPlata;
    }
    //METODA OPERATIE
    public void inchideComanda(Comanda comanda){
        if(tehnicaPlata!=null){
            System.out.println("s a initiat plata...");
            tehnicaPlata.plataComanda(comanda);
        }else{
            System.out.println("nu avem tehnica de plata selectata");

        }
    }
}
