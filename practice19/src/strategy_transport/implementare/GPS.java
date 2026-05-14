package strategy_transport.implementare;

public class GPS {
    AbstractAlgoritmRuta abstractAlgoritmRuta;
    public void calculeaza(ReteaTransport reteaTransport,String start,String finish){
        abstractAlgoritmRuta.calculeazaRuta(reteaTransport,start,finish);
    }
    public void setStrategie(AbstractAlgoritmRuta abstractAlgoritmRuta){
        this.abstractAlgoritmRuta=abstractAlgoritmRuta;
    }

}
